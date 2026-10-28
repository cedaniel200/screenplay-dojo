package com.cedaniel200.screenplay.dojo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.cedaniel200.screenplay.dojo.userinterfaces.InicioPage.DASHBOARD;

public class LaPaginaDeInicio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DASHBOARD.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }
}
