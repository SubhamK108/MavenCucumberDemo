Feature: Landing Page

  Scenario: Get the application landing page title of GitHub.
    When Navigates to GitHub using "https://github.com" link
    Then Fetch the page title of GitHub

  Scenario: Get the application landing page title of Google.
    When Navigates to Google using "https://www.google.com" link
    Then Fetch the page title of Google