package com.cedaniel200.screenplay.dojo.stepdefinition;

import com.cedaniel200.screenplay.dojo.userinterface.InicioSesionPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

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


    @When("^[a-z,A-Z]{1,50} se autentica$")
    public void autenticar() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^[a-z,A-Z]{1,50} debe ver la pagina de inicio$")
    public void debeVerLaPaginaDeInicio() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
