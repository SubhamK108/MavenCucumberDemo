package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.testng.*;
import pageObjects.*;
import utils.*;

import java.io.*;

public class StepDefinitions extends BaseWebDriver {
    @Before
    public void initializeWebDriver() {
        super.initializeWebDriver();
    }

    @After
    public void closeAllBrowserWindows() {
        super.closeAllBrowserWindows();
    }

    @When("Navigates to GitHub using {string} link")
    public void navigates_to_git_hub_using_link(String link) {
        LandingPage landingPage = new LandingPage();
        landingPage.navigateToLink(webDriver, link);
        System.out.println("WHEN PASSED\n");
    }

    @When("Navigates to Google using {string} link")
    public void navigates_to_google_using_link(String link) {
        LandingPage landingPage = new LandingPage();
        landingPage.navigateToLink(webDriver, link);
        System.out.println("WHEN PASSED\n");
    }

    @Then("Fetch the page title of GitHub")
    public void fetch_the_page_title_of_git_hub() {
        final String expectedTitle = "GitHub: Where the world builds software · GitHub";
        LandingPage landingPage = new LandingPage();
        String title = landingPage.fetchPageTitle(webDriver);
        System.out.println("PAGE TITLE: " + title);
        Assert.assertEquals(title, expectedTitle);
        System.out.println("THEN PASSED\n");
    }

    @Then("Fetch the page title of Google")
    public void fetch_the_page_title_of_google() {
        final String expectedTitle = "Google";
        LandingPage landingPage = new LandingPage();
        String title = landingPage.fetchPageTitle(webDriver);
        System.out.println("PAGE TITLE: " + title);
        Assert.assertEquals(title, expectedTitle);
        System.out.println("THEN PASSED\n");
    }

    @When("Searches Google for {string}")
    public void searches_google_for(String text) {
        GoogleStuff googleStuff = new GoogleStuff();
        googleStuff.searchGoogleFor(webDriver, text);
        System.out.println("WHEN PASSED\n");
    }

    @Then("Successfully translates {string} from English to {string}")
    public void successfully_translates_text_from_english_to_german(String text, String targetLang) {
        GoogleStuff googleStuff = new GoogleStuff();
        String translatedText = googleStuff.translateText(webDriver, text, targetLang);
        System.out.println("TRANSLATED TEXT: " + translatedText);
        boolean puncture = text.contains("!");
        Assert.assertFalse(puncture);
        System.out.println("THEN PASSED\n");
    }

    @Then("Takes a screenshot and saves it locally")
    public void takes_a_screenshot_and_saves_it_locally() {
        String filePath = ScreenshotUtil.takeScreenshot(webDriver);
        File screenshot = new File(filePath);
        boolean fileExists = screenshot.exists() && screenshot.isFile();
        Assert.assertTrue(fileExists);
        System.out.println("SCREENSHOT SAVED AT: " + filePath);
        System.out.println("THEN PASSED\n");
    }
}
