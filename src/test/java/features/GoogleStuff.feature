Feature: Google Stuff

  Background:
    Given The WebDriver is initialized

  Scenario Outline: Translate a piece of text from English to a particular language.
    When Navigates to Google using "https://www.google.com" link
    And Searches Google for "translate"
    Then Successfully translates <text> from English to <targetLang>
    And Takes a screenshot and saves it locally
    Examples:
      | text                                                                       | targetLang |
      | "I am Subham"                                                              | "german"   |
      | "I am Subham. How are you, hope you are doing well. I am good. Thank you!" | "german"   |