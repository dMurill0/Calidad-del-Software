import cucumber.api.java.en.And;

public class Test {

    // scenario1
    @When("^Elige la gama de colores usando el menu$")
    public void Elige_la_gama_de_colores_usando_el_menu() throws Throwable {
        System.out.println("Inside first step of scenario1");
    }

    @And("^Comienza la partida$")
    public void Comienza_la_partida() throws Throwable {
        System.out.println("Inside second step of scenario1");
    }

    @Then("^Las piezas del juego se veran con la gama de colores escogida por el jugador$")
    public void Las_piezas_del_juego_se_veran_con_la_gama_de_colores_escogida_por_el_usuario() throws Throwable {
        System.out.println("Inside last step of scenario 1");
    }

    // scenario2
    @When("^Finaliza la partida$")
    public void Finaliza_la_partida() throws Throwable {
        System.out.println("Inside first step of scenario 2");
    }

    @And("^Accede a la pantalla del ranking$")
    public void Accede_a_la_pantalla_del_ranking() throws Throwable {
        System.out.println("Inside second step of scenario 2");
    }

    @Then("^Aparecera un mensaje que informa al usuario sobre la cantidad obtenida$")
    public void Aparecer_un_mensaje_que_informa_al_usuario_sobre_la_cancion_obtenida() throws Throwable {
        System.out.println("Inside third step of scenario 2");
    }

    // scenario3
    @When("^Activa la opcion del modo ayuda$")
    public void Activa_opcion_modo_ayuda() throws Throwable {
        System.out.println("Inside first step of scenario 3");
    }

    @And("^Comienza el juego")
    public void Comienza_el_juego() throws Throwable {
        System.out.println("Inside second step of Scenario 3");
    }

    @Then("^La partida tendra una pieza extra multicolor")
    public void La_partida_tiene_pieza_multicolor() throws Throwable {
        System.out.println("Inside third step of Scenario 3");
    }

    // scenario4
    @When("^Marca las canciones que quiere escuchar")
    public void Marca_las_canciones_que_quiere_escuchar() throws Throwable {
        System.out.println("Inside first step of Scenario 4");
    }

    @And("^Comienza la partida")
    public void Empieza_el_juego() throws Throwable {
        System.out.println("Inside second step of Scenario 4");
    }

    @Then("^Se reproduciran durante la partida las canciones seleccionadas por el usuario")
    public void Se_reproduciran_durante_la_partida_las_canciones_seleccionadas_por_el_usuario() throws Throwable {
        System.out.println("Inside third step of Scenario 4");
    }

    // scenario5
    @When("^EL usuario accede al ranking")
    public void El_usuario_accede_al_ranking() throws Throwable {
        System.out.println("Inside first step of Scenario 5");
    }

    @And("^Pulsa el boton para volver")
    public void Pulsa_boton_volver() throws Throwable {
        System.out.println("Inside second step of Scenario 5");
    }

    @Then("^El jugador volvera a la pantalla del menu")
    public void Jugador_vuelve_a_la_pantalla_del_menu() throws Throwable {
        System.out.println("Inside third step of Scenario 5");
    }
}