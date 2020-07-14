Feature: Elección de canciones

As a usuario
Quiero tener la opción de poder saltarme alguna cancion

Scenario: Reproducir la siguiente cancion
	Given Una partida en curso con la pista numero 1
    When Pulso el "boton" de siguiente pista
    Then Se reproducira la pista numero 2