package pageFactory;

import org.openqa.selenium.*;

public class LandingPage {
    public static void navigateToLink(WebDriver webDriver, String link) {
        webDriver.get(link);
    }

    public static String fetchPageTitle(WebDriver webDriver) {
        return webDriver.getTitle();
    }
}
