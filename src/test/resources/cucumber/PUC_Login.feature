Feature: Puc Login

  Scenario: user can login to PUC
    Given open PUC
    Then login with username Admin and password password
    Then PUC opened

  Scenario: create new Analysis report
    Given PUC opened
    And create new Analysis report
    Then new Analysys report opened