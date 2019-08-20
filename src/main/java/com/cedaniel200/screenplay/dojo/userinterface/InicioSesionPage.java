package com.cedaniel200.screenplay.dojo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://github.com/login")
public class InicioSesionPage extends PageObject {

    public static final Target NOMBRE_USUARIO_O_CORREO = Target.the("Username or email field")
            .located(By.id("login_field"));
    public static final Target CONTRASENA = Target.the("Password field").located(By.id("password"));
    public static final Target INGRESAR = Target.the("Sign in").located(By.name("commit"));

}
