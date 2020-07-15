@tag
Feature: Eleccion de canciones
    @tag1
    Scenario: Seleccion de canciones para partida
        When Marca las canciones que quiere escuchar en la seccion disponible en el menu
        And Empieza el juego
        Then Se reproduciran durante la partida las canciones seleccionadas por el usuario
