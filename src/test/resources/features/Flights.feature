Feature: Latam flights

  Scenario Outline: User login account
    Given User create account
      | documentId   | name   | lastname   | birthDate   | genre   | phoneNumber   | email   | password   |
      | <documentId> | <name> | <lastname> | <birthDate> | <genre> | <phoneNumber> | <email> | <password> |
    Then User login successfully
    Examples:
      | documentId | name  | lastname | birthDate  | genre | phoneNumber | email          | password |
      | 1014353453 | Jorge | Lozano   | 10/11/1998 | M     | 30032432234 | test@gmail.com | 12423345 |