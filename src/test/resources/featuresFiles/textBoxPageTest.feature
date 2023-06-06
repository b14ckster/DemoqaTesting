Feature: Elements Page testing feature

  Background:
    Given I open Demoqa site
    Then "Main page" should be opened
    And 6 cards must be present

    When I click on "Elements card"
    Then "Elements page" should be opened
    And Header should be "Elements"

  Scenario: Text Box. Enter data in the text fields.
    When I click on "Text Box" on left panel
    Then "Text Box page" should be opened
    And Header should be "Text Box"

    When I enter following values in text fields:
      | Full Name         | Ibrahim Tutovich            |
      | Email             | Email:ZhopkaKota@repa.com   |
      | Current Address   | Current Address :Muhosransk |
      | Permanent Address | Permananet Address :Lohovo  |
    And I click on "Submit" button
    Then Output should appear
    And Output should contain entered values:
      | Name:Ibrahim Tutovich       |
      | Email:ZhopkaKota@repa.com   |
      | Current Address :Muhosransk |
      | Permananet Address :Lohovo  |

