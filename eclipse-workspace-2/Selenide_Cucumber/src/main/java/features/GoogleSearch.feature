Feature: Search Google
  Scenario: Search Selenide Word in Google

    Given User goes to google

    When User search 'Selenide'

    Then User should get the 'Selenide site' in the results page