Feature: You can enter data in the text fields and after the correct input an output appears with the results

  Scenario: Check text fields in Text Box
    Given I open Demoqa site
    Then "Main page" should be opened
    And 6 cards must be present

    When I click on "Elements card"
    Then "Elements page" should be opened
    And Header should be "Elements"

    When I click on "Text Box" on left panel
    Then "Text Box page" should be opened
    And Header should be "Text Box"

    When I enter "Full Name" in Full Name text field
    And I enter "Email" in Email text field
    And I enter "Current Address" in Current Address text field
    And I enter "Permanent Address" in Permanent Address text field
    And I click on "Submit" button
    Then Output should appear
    And Output should contain following values:
      | Name:                | 'Name'              |
      | Email:               | 'Email'             |
      | Current Address :    | 'Current Address'   |
      | Permananet Address : | 'Permanent Address' |

