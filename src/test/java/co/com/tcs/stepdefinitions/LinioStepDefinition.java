package co.com.tcs.stepdefinitions;

import co.com.tcs.questions.LaRespuesta;
import co.com.tcs.tasks.Abrir;
import co.com.tcs.tasks.OprimirBtnCategorias;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class LinioStepDefinition {

    @Before
    public void configuracion(){
        setTheStage(new OnlineCast());
    }

    @Given("^que camilo quiere buscar en linio$")
    public void que_camilo_quiere_buscar_en_linio() {
        theActorCalled("Camilo").wasAbleTo(Abrir.paginaDeLinio());
    }


    @When("^el oprime el boton categoria$")
    public void el_oprime_el_boton_categoria() {
    theActorInTheSpotlight().attemptsTo(OprimirBtnCategorias.buscar());
    }

    @Then("^el deberia ver la palabra (.*) en la pantalla$")
    public void el_deberia_ver_la_palabra_Hogar_en_la_pantalla(String palabraEsperada) {
        theActorInTheSpotlight().should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));
    }

}
