Feature: Puc Login

  Scenario: user can login to PUC
    Given open PUC
    Then login with username Admin and password password
    Then PUC opened