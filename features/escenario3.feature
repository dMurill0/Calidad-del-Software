@tag
Feature: Pieza de ayuda
    @tag1
    Scenario: Eleccion de modo ayuda
    Given El usuario ha accedido al menu del juego
    When Activa la opcion del modo ayuda
    And Comienza el juego
    Then La partida tendra una pieza extra multicolor que ayuda a eliminar filas
