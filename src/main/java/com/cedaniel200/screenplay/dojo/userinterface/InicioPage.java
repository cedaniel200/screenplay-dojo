package com.cedaniel200.screenplay.dojo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage {
    public static final Target DASHBOARD = Target.the("Dashboard  of the home page")
            .located(By.id("dashboard"));
}
