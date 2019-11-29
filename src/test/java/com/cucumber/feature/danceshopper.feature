Feature: DanceShopper automation test scripts


  Scenario: User purchase a product
    Given User should be in the danceshopper page
    When User mousehover women category and select dancetop category
    When User select the first product
    When User select the size
    When User select the color
    When User click on addtobag
    #When User confirm the order
   # When User click on the bag
   # And User click on continue shopping
