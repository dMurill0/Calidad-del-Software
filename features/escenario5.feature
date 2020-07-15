@tag 
Feature: Volver al menu principal
    @tag1
    Scenario: Volver al inicio
    Given El usuario ha finalizado una partida
    When Accede a la pantalla de ranking
    And Pulsa el boton para Volver
    Then El jugador volvera a la pantalla del menu