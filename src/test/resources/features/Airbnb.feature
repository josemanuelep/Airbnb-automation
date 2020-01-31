  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @Regresion
  Feature: Search for housing and add to favorites the cheapest

    A visitor looking for a housing to visit, Login add the
    cheapest to the favorites. Seacrh  housing to 2 adults
    and 1 boy in Medellin, preferably in Poblado near to
    Lleras Park


    Background:
      Given Jose wants go to Airbnb page
      When He decide enter with Google account using the credencials
        | user              | password |
        | jozelg9@gmail.com | ENVYpc98 |
      Then He should see his own profile image from Google with alt atributte "Cuenta de José Manuel"

    Scenario: Searching housing
      Given search for city
        | city     |
        | Medellín |
        | Pereira  |
      When he add some filters
        | since      | until      | adultls | boys | babies | work | type                  | immediately |
        | 31/01/2020 | 20/02/2020 | 2       | 2    | 4      | no   | Alojamiento entero    | yes         |
        | 5/05/2020  | 10/02/2020 | 2       | 0    | 0      | yes  | Habitación compartida | no          |
      And he add the cheapest to favorites with the name
        | favorite           |
        | Places in Colombia |
        | Rest of world      |
      Then he should see a fill red heart



