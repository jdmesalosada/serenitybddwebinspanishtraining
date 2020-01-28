Feature: Login into the application 2

  @login
  Scenario: Successful login 2
    Given Pepito has an active account
    When he sends their valid credentials
    Then he should have access to manage his account
