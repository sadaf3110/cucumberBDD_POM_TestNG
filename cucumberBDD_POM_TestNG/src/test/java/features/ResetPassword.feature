Feature: Reset Password Meddbase patient portal

  Background:
    Given patient lauches the URL
    When patient enters username as "<username>" Password as "<password>"
    Then Patient is navigated to patient portal home page
  Scenario Outline: Resetting a Password
    When patient choose "My Account"
    Then Patient click on My Account
    When Patient clicks on "Reset Password" button
    Then Reset Password pop up box should appear
    When Patient clicks on "Submit Password Reset Button"
    Then Patient should receive an email to reset the password
    And Patient should subsequently be logged out
    And Patient should receive an email with a link to reset password
    When Patient clicks on reset password link from an email
    Then Patient navigated to Online Portal Password Reset page
    When Patient enters First name as "<firstname>" Last name as "<lastname>" DOB as "<date>""<month>""<year>" Post       Code as "<postcode>"   New Password  as "<newpassword>"
    Then Patient should get password reset successful message


    Examples:
      | username                | password      | firstname | lastname | date |month| year | postcode | newpassword|
      | chhabra.teena@gmail.com | Bananaapps    |  Teena    |  Gulati  |  09  |Nov  | 1980 |  TW31PN  | Bananaapps123|