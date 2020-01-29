# Autor Jose Manuel Echeverri Palacio
# Testing project at Choucair company

@Tag1
Feature: Choucair Academy Profile and Courses
  As Choucair Academy Employee I want to manage
  my profile and my courses

  Background: Login into Choucair Academy Choucair Academy
    Given Given that Jose wants to enter to the web page
      | email       | password  |
      | jecheverrip | NITROpc98 |

  @Tag2
  Scenario: Success Login
    Then He should  see the top-screen message of welcome with the text "Choucair Academy"

  @Tag3
  Scenario: Edit profile
    Given that Jose go to the edit profile page
    When Jose add the missing information
      | description        | phoneticName | phoneticLastName  | interests | webpage                         | skype    | id        | phone1  | phone2     | address          |
      | Me gusta programar | José Manuel  | Echeverri Palacio | Java      | https://github.com/josemanuelep | jocepala | 000159747 | 4922713 | 3225443771 | Calle 40 # 88-65 |
    Then Jose should see a top middle message like "Detalles de usuario"
