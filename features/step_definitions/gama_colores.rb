Given("El usuario ha accedido al menú del juego") do

end
  
  When("Elige la gama de colores con el modo {string} en el menú") do |modo|
    
    @modo = modo
  end
  
  When("Comienza la partida {string}") do |inicio|

    @Partida_iniciada = inicio
  end
  
  Then("El juego se inicia en el modo {string}") do |modoColoresPersonalizados|
    if @partida_iniciada == "true" then
      @modo == modoColoresPersonalizados
    end

end