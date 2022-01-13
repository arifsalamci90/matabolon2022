@login
Feature: Login Page

  Scenario Outline: Log into the app with valid credentials

    Given I am on "<url>"
    When I enter username "<username>" and password "<password>"
    And I click on login button
    Then I verify that sauce demo main page is opened
    Then I verify the app logo exists on main page

    Examples:
      | username          | password     | url                           |
      | standard_user     | secret_sauce |  https://www.saucedemo.com/   |


  Scenario Outline: Log into the app with invalid credentials

    Given I am on "<url>"
    When I enter username "<username>" and password "<password>"
    And I click on login button
    Then I verify the Error Message contains the text "<errorMessage>"


    Examples:
      | username          | password     | url                           | errorMessage                     |
      | locked_out_user   | secret_sauce | https://www.saucedemo.com/    | Sorry, this user has been banned.|