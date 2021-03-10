Feature: MoemaxPage

  @moemax
  Scenario Outline: MoemaxPage Tests
    Given I open MoemaxPage page
    When I search for the <color> color
    Then I see the filter <color> is applied

    Examples:
      | color |
      | weiß  |
