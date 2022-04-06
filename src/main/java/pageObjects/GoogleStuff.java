package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class GoogleStuff {
    public void searchGoogleFor(WebDriver webDriver, String text) {
        Actions actions = new Actions(webDriver);
        Action action = actions
                .moveToElement(webDriver.findElement(By.xpath("//input[@class='gLFyf gsfi']")))
                .sendKeys(text, Keys.RETURN)
                .build();
        action.perform();
    }

    public String translateText(WebDriver webDriver, String text, String targetLang) {
        Actions actions = new Actions(webDriver);
        Action action = actions
                .moveToElement(webDriver.findElement(By.xpath("//span[@class='source-language']")))
                .click()
                .moveToElement(webDriver.findElement(By.xpath("//input[@id='sl_list-search-box']")))
                .sendKeys("english", Keys.ARROW_DOWN, Keys.RETURN)
                .moveToElement(webDriver.findElement(By.xpath("//span[@class='target-language']")))
                .click()
                .moveToElement(webDriver.findElement(By.xpath("//input[@id='tl_list-search-box']")))
                .sendKeys(targetLang, Keys.ARROW_DOWN, Keys.RETURN)
                .moveToElement(webDriver.findElement(By.xpath("//textarea[@id='tw-source-text-ta']")))
                .click()
                .sendKeys(text)
                .build();
        action.perform();
        WebElement translatedParentEle = webDriver.findElement(By.xpath("//div[@id='kAz1tf']/div[1]"));
        WebElement translatedELe = webDriver.findElement(By.xpath("//pre[@id='tw-target-text']/span"));
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(translatedParentEle, "class", "tw-prog")));
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(translatedELe, "Translating...")));
        return translatedELe.getText();
    }
}
