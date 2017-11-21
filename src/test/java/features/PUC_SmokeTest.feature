Feature: Puc_SmokeTest

  Scenario Outline: login to PUC and create Analysis Report
    Given open PUC
    And login with username <username> and password <password>
    And create new <report type> report
    And select <data source> Data Source
    And add field <rows> to the Row
    And add field <columns> to the Columns
    And add field <measures> to the Measures

    Examples:
    | username    | password   | report type   | data source      | rows     | columns   | measures   |
    | Admin       | password   | Analysis      | SteelWheelsSales | Customer | Type      | Quality    |