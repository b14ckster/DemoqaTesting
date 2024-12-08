
@all @web_table
Feature: Web Tables Page testing feature

  Background:
    Given I open Demoqa site
    Then Main page should be opened and 6 cards must be present
    When I click on "Elements" card
   # Then "Elements" page should be opened
    When I click on "Web Tables" on left panel
    Then "Web Tables" page should be opened

  Scenario: Web Table. Add\Delete\Edit rows. Change rows per page, navigation in pages.
    When I add new 4 rows in web table containing:
      | First Name | Last Name | Age | Email                     | Salary | Department           |
      | Monica     | Geller    | 34  | firstEverywhere@gmail.com | 12345  | Cooking              |
      | Chandler   | Bing      | 29  | bingbang@yandex.ru        | 100000 | Data reconfiguration |
      | Joey       | Tribbiani | 33  | email1111@example.com     | 10     | Television           |
      | Phoebe     | Buffay    | 37  | reginaPhalange@gmail.com  | 4500   | Massage              |
    Then At least 4 rows with values should be in web table
    And Added rows and following rows should be a in web table:
      | First Name | Last Name | Age | Email              | Salary | Department |
      | Cierra     | Vega      | 39  | cierra@example.com | 10000  | Insurance  |
      | Alden      | Cantrell  | 45  | alden@example.com  | 12000  | Compliance |
      | Kierra     | Gentry    | 29  | kierra@example.com | 2000   | Legal      |
    When I delete 3 row in web table
    Then At least 6 rows with values should be in web table
    And Deleted row is no longer in web table
    When I edit 2 row in web table to:
      | First Name | Last Name | Age | Email                 | Salary | Department |
      | Ross       | Geller    | 31  | dinosuper91@yahoo.com | 13990  | Archeology |
    Then 2 row should contain entered values in web table
    When I change rows per page to 5 rows
    Then "Next" button should be enabled
    And "Previous" button should be enabled
    When I click on "Next" button
    Then At least 1 rows with values should be in web table
    When I click on "Previous" button
    Then At least 5 rows with values should be in web table

  Scenario: Web Table. Sorting web table. Using search box.
    #String
    When I click on "Last Name" column in web table
    Then Web table should be sorted by "Last Name" column of "string" in "ascending" order
    When I click on "Last Name" column in web table
    Then Web table should be sorted by "Last Name" column of "string" in "descending" order
    #int
    When I click on "Salary" column in web table
    Then Web table should be sorted by "Salary" column of "int" in "ascending" order
    When I click on "Salary" column in web table
    Then Web table should be sorted by "Salary" column of "int" in "descending" order
    #Search
    When I enter "ierra" in search box
    Then Web table should contain rows only with entered value
