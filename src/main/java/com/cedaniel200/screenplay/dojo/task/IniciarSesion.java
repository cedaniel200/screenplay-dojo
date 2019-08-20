package com.cedaniel200.screenplay.dojo.task;

import com.cedaniel200.screenplay.dojo.model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cedaniel200.screenplay.dojo.userinterface.InicioSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private Usuario usuario;

    public IniciarSesion(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getUsuario()).into(NOMBRE_USUARIO_O_CORREO),
                Enter.theValue(usuario.getContrasena()).into(CONTRASENA),
                Click.on(INGRESAR)
        );
    }

    public static IniciarSesion con(Usuario usuario) {
        return instrumented(IniciarSesion.class, usuario);
    }
}
