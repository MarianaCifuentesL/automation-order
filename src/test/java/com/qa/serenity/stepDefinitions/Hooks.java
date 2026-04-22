package com.qa.serenity.stepDefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Managed()
    WebDriver hisDriver;

    @Before
    public void setUp() {
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver()
                .avoidResolutionCache()
                .setup();
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
        // Maximizar la ventana del navegador
//        hisDriver.manage().window().maximize();
    }
}