package com.cedaniel200.screenplay.dojo.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaPaginaDeInicio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return false;
    }

    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }
}
