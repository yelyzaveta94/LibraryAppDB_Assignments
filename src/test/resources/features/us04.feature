
Feature: As a data consumer, I want UI and DB book information are match.

  Background:
    Given Establish the database connection



  Scenario: Verify book information with DB

    And the user navigates to "Books" page
    When the user searches for "Clean Code" book
    And  the user clicks edit book button
    Then book information must match the Database