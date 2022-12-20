Feature: Computer page tests
  As user I want to open computer page into nop commerce website


  Scenario: verify User Should Navigate To Computer Page Successfully
    Given I am on computer page
    When I click on Menu Tab "Computer"
    Then I should navigate computers page successfully


  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given I am on computer page
    When I click on Menu Tab"Computer"
    And I click on subMenu "Desktops"
    Then  Verify desktop page displayed successfully


    Scenario Outline:verify That User Should Build Own Computer And Add To Cart Successfully
      Given I am on Computer page
      When  I click on Menu Tab "Computer"
      And   I click On subMenu "Desktops"
      And  I select Product "Build your own computer"
      And  i select Processor "<processor>"
      And  i select ram "<ram>"
      And  i select hdd "<hdd>"
      And  i select os "<os>"
      And  i select software "<software>"
      And I click on Add to cart  button
      Then I should see the  confirmation message
      Examples:
        | processor                                       | ram           | hdd               | os                       | software                   |
        | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]     | Microsoft Office [+$50.00] |
        | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | "Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
        | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]     | Total Commander [+$5.00]   |
