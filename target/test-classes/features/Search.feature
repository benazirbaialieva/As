Feature: Typed words in text box it should suggest words that matches typed keyword. When user start
  typing word in text box it should suggest words that matches typed keyword

  Background:
    Given gets to home page

  Scenario:
    When user clicks on search filed
    Then suggestions dropdown should display 10 top destinations

  @test
    Scenario:
     When user searches "san" in search field
     Then suggestions dropdown items should contain "san"
    Then user selects option 3 from the list
  And clicks on reward programs
  Then user sees list of "Popular" programs
  And user verifies the list is sorted
    Then user sees list of "All" programs
    And user verifies the list is sorted
  And list of "Popular" programs contains "Amazon.com Gift Card"











#  Scenario: Post another note on Dashboard
#    When I post "Hello all"
#    Then Post should be displayed
#    And I logout from application