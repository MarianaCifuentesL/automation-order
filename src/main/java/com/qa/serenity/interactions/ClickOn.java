package com.qa.serenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Interaction {

    private Target target;

    public ClickOn(Target target) {
        this.target = target;
    }

    public static ClickOn element(Target target) {
        return instrumented(ClickOn.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).click();
    }
}