package pageObjects;

import org.openqa.selenium.*;

public class LandingPage {
    public void navigateToLink(WebDriver webDriver, String link) {
        webDriver.get(link);
    }

    public String fetchPageTitle(WebDriver webDriver) {
        return webDriver.getTitle();
    }
}
