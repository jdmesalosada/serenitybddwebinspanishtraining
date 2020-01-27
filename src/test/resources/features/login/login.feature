Feature: Login into the application

  Scenario: Successful login
    Given Pepito has an active account
    When he sends their valid credentials
    Then he should have access to manage his account

  Scenario: Remember things
    Given Pepito wants to remember something
    When he tries to remember Foo
    Then he should get Foo
