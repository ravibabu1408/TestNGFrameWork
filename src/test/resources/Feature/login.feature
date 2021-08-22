#Author: your.email@your.domain.com

@tag
Feature: Login to Rediffmail
 

  @tag1
  Scenario:Login to rediffmail with valid username and password
    Given Launch rediffmail login
    When I enter username as "ravibabu408@gmail.com"
    And I enter password as "kanapa123"
    And I Click on login button
    Then I loggged into rediffmail successfully
   
  @tag1
  Scenario:Login to rediffmail with invalid username and password
    Given Launch rediffmail login
    When I enter username as "ravibabu408@gmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   

