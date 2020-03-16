Feature: Login into the application

  Scenario: Successful login
    Given Pepito has an active account
    When he sends their valid credentials
    Then he should have access to manage his account

  @suite2
  Scenario: Successful login 2
    Given Pepito has an active account
    When he sends their valid credentials
    Then he should have access t  o manage his account

  @suite3
  Scenario: Successful login 3
    Given Pepito has an active account
    When he sends their valid credentials
    Then he should have access to manage his account


  @suite4
  Scenario: Successful login 4
    Given Pepito has an active account
    When he sends their valid credentials
    Then he should have access to manage his account

  Scenario: Successful login 5
    Given Pepito xhas a token


   @dev
  Scenario: Failed 1
    Given Pepito failed1

  @dev
  Scenario: Failed 2
    Given Pepito failed2

  @dev
  Scenario: Compromised 1
    Given Pepito compromised