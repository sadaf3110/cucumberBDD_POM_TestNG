Feature: login to meddbase with different user accounts

Background:
  Given I navigate to meddbase login page
  And click on sign in button
  Then I click on log out button

Scenario : Login with valid data


When I enter username as "<mail4vijaya@gmail.com>"
And I enter password  as "<Meddbase123>"



Scenario: login with invalid data
  When I enter invlid username as "<test.1@gmail.com >"
  And I enter invalid password  as "<Bananaapp34>"
  Then It should display me the message

