Feature: Login to MeddBase
 In order to login to meddbase
 As a User
 I have to provide valid credentials
 
 
 Scenario: Login To MeddBAse With Valid Credentials
 
 Given I navigate to meddbase login page 
 When I enter valid username "mail4vijaya@gmail.com"
 And I enter valid password "Meddbase123"
 And I click on sign in button
 Then I should be able to login successfully    

