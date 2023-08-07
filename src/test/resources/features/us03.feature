
Feature: As a data consumer, I want UI and DB book categories are match.

  Background:
    Given Establish the database connection

    @US_3
  Scenario: verify book categories with DB

    When the user navigates to "Books" page
    And the user clicks book categories
    Then verify book categories must match book_categories table from db