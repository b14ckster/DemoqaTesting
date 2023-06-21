Feature: Check Box Page testing feature

  Background:
    Given I open Demoqa site
    Then Main page should be opened and 6 cards must be present
    When I click on "Elements" card
    Then "Elements" page should be opened
    When I click on "Check Box" on left panel
    Then "Check Box" page should be opened

  Scenario: Check Box. Click on check boxes.
    When I click on "Expand all" button on Check Box Page
    And I select following check boxes:
      | Notes     |
      | React     |
      | Angular   |
      | Veu       |
      | Private   |
      | General   |
      | Downloads |
    Then Result string should appear
    And Result string should contain entered values with following values:
      | workspace |
      | wordFile  |
      | excelFile |
    When I click on "Home" checkbox on Check Box Page
    Then Result string should contain entered values with following values:
      | home       |
      | desktop    |
      | commands   |
      | documents  |
      | office     |
      | public     |
      | classified |
    When I click on "Home" checkbox on Check Box Page
    And I click on "Collapse all" button on Check Box Page
    Then Check Box "Home" is not selected
