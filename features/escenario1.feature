@tag
Feature: Elección de gama de colores

    @tag1
    Scenario: Elección de colores del menú
        When Elige la gama de colores usando el menu
        And Comienza la partida
        Then Las piezas del juego se verán con la gama de colores elegida por el jugador
        