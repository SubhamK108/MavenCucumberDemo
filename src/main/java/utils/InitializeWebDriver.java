package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class InitializeWebDriver {
    public static WebDriver webDriver;

    public static void initializeWebDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\My_Files\\Dev\\Java\\Selenium\\WebDrivers\\edgedriver_win64\\msedgedriver.exe");
        webDriver = new EdgeDriver();
    }

    public static void closeAllBrowserWindows() {
        webDriver.quit();
    }
}
