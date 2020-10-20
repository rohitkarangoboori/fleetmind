@Tag1
Feature: Add Route feature


  Scenario Outline: Login Page
    Given user is on homepage
    Then Navigate to RMS
    Then Switch to new Tab
    Then user enter username "<Email>" and User enter password "<Password>"
    Then  Click on sign in button

    Examples:
      | Email                   | Password      |
      | fleetmind@safefleet.net | Singapur2019* |

  Scenario Outline: Adding a new route with weekly frequency
    Given User clicks on Routes
    Then User clicks on Add Route
    Then User Enter the "<Name>"
    Then User Select the "<Date>"
    Then User Select the Frequency
    Then  User Select Material
    Then User Select Business
    Then User Enter "Notes"
    Then  Click on the Save Button
    Examples:
      | Date       | Name | Notes   |
      | 2020-03-03 | Test | Test001 |
				