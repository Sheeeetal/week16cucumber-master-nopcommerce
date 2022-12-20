@login
  Feature: Login Test
    As user I want to login into nop commerce website

  Scenario: verify user Should Navigate To Login Page
    Given I am on Login Page
    When I click on login link
    Then Welcome Message displayed

    Scenario: verify Error Message With Invalid Credentials
      Given I am on login page
      When I click on login link
      And I enter email "prime1234@gmail.com"
      And I enter password "prime123"
      And i click on login button
      Then I should see error message displayed

      Scenario: verify That User Should Login Successfully With Valid Credentials
        Given I am on login page
        When I click on login link
        And I enter email "prime1234@gmail.com"
        And I enter password "Prime123"
        And I click on login button
        Then I should see logout link displayed

        Scenario: verify That User Should Logout Successfully
          Given I am On login page
          When I click on login link
          And I enter email "prime123@gmail.com"
          And I enter password "Prime123"
          And I click on login button
          And I click on login link
          Then i should see login link is displayed

