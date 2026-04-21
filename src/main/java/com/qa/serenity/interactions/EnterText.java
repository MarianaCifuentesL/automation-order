package com.qa.serenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterText implements Interaction {

    private String value;
    private Target field;

    public EnterText(String value, Target field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        field.resolveFor(actor).clear();
        field.resolveFor(actor).sendKeys(value);
    }

    public static EnterText into(Target field, String value) {
        return instrumented(EnterText.class, value, field);
    }
}