
@all @radio_button
Feature: Radio Button Page testing feature

  Background:
    Given I open Demoqa site
    Then Main page should be opened and 6 cards must be present
    When I click on "Elements" card
#    Then "Elements" page should be opened
    When I click on "Radio Button" on left panel
    Then "Radio Button" page should be opened


  Scenario: Radio Button. Click on radio buttons
    When I click on "Yes" radio button on Radio Button Page
    Then Result string should appear and contain text: "Yes"
    When I click on "Impressive" radio button on Radio Button Page
    Then Result string should appear and contain text: "Impressive"
    And Radio button "No" is disabled