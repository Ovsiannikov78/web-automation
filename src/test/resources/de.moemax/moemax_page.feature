Feature: MoemaxPage

  @moemax
  Scenario Outline: MoemaxPage Tests
    Given I open MoemaxPage page
    When I select the filter <filter>
    And I apply <value> value
    Then I see the value with number <filter_number> and value <value> with number <filter_number> is applied

    Examples:
      | value | filter | filter_number |
      | weiß  | Farbe  | 1             |
      | Amica | Marke  | 2             |
      | Based | Marke  | 3             |
