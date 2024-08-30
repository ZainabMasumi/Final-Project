Feature: this feature is for the home page validation

  Scenario: Validate When user navigate to home page title is TEK Insurance UI
  and create Primary Account Button is exist
    Given open browser and navigate to insurance app
    Then validate home page is title is "TEK Insurance UI"
    Then create Primary Account Button exists
