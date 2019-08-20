package com.cedaniel200.screenplay.dojo.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.cedaniel200.screenplay.dojo.userinterface.InicioPage.DASHBOARD;

@Subject("the home page is visible")
public class LaPaginaDeInicio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DASHBOARD.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }
}
