package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseWebDriver {
    public WebDriver webDriver;

    public void initializeWebDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\My_Files\\Dev\\Java\\Selenium\\WebDrivers\\edgedriver_win64\\msedgedriver.exe");
        webDriver = new EdgeDriver();
    }

    public void closeAllBrowserWindows() {
        webDriver.quit();
    }
}
