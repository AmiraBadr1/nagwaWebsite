
Feature: explore the mobile application

  Background: nagwa application is available
    Given user open the mobile application

  Scenario: anonymous user download books
    When user download 4 books
    Then application inform user that the free limit has been reached

    Scenario: application performance while mobile battery is low
      When mobile battery is "10" percent
      Then the response time is acceptable
      #not testable (need more specific criteria)

   Scenario: latest 10 books is displayed
     When user search for the latest 10 books
     Then search result match the displayed ones in the main application