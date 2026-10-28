package com.cedaniel200.screenplay.dojo.stepdefinition;

import com.cedaniel200.screenplay.dojo.userinterfaces.InicioSesionPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void quiereAutenticarse(String actorName) {
        theActorCalled(actorName).attemptsTo(
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