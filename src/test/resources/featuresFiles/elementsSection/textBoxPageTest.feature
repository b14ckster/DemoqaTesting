Feature: Text Box Page testing feature

  Background:
    Given I open Demoqa site
    Then Main page should be opened and 6 cards must be present
    When I click on "Elements" card
    Then "Elements" page should be opened

  Scenario: Text Box. Enter data in the text fields.
    When I click on "Text Box" on left panel
    Then "Text Box" page should be opened
    When I enter following values in text fields:
      | Full Name         | Ibrahim Tutovich    |
      | Email             | ZhopkaKota@repa.com |
      | Current Address   | Muhosransk          |
      | Permanent Address | Lohovo              |
    And I click on Submit button
    Then Output should appear
    And Output should contain entered values
