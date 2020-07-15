@tag
Feature: Nuevas canciones para la partida

    @tag1
    Scenario: Obtención de nueva canción
        When Finaliza la partida
        And Accede a la pantalla del ranking
        Then Aparecera un mensaje que informa al jugador sobre la cancion elegida
        