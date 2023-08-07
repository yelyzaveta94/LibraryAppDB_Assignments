
Feature: As a librarian, I want to know borrowed books number

  Background:
    Given the "librarian" on the home page



@US_2
  Scenario: verify the total amount of borrowed books

    When the librarian gets borrowed books number
    Then borrowed books number information must match with DB