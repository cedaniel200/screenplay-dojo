package com.cedaniel200.screenplay.dojo.stepdefinition;

import com.cedaniel200.screenplay.dojo.exceptions.AutenticacionFallidaError;
import com.cedaniel200.screenplay.dojo.questions.LaPaginaDeInicio;
import com.cedaniel200.screenplay.dojo.tasks.IniciarSesion;
import com.cedaniel200.screenplay.dojo.userinterfaces.InicioSesionPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.cedaniel200.screenplay.dojo.models.UsuarioBuilder.unUsuarioPorDefecto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinition {

    private InicioSesionPage inicioSesionPage;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) quiere autenticarse$")
    public void quiereAutenticarse(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn(inicioSesionPage)
        );
    }


    @When("^Cesar se autentica$")
    public void cesarSeAutentica() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(unUsuarioPorDefecto())
        );
    }

    @Then("^Cesar debe ver la pagina de inicio$")
    public void cesarDebeVerLaPaginaDeInicio() {
        theActorInTheSpotlight().should(seeThat(LaPaginaDeInicio.esVisible())
                .orComplainWith(AutenticacionFallidaError.class, "authentication failed"));
    }

}
