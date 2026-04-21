package com.qa.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.qa.serenity.ui.LoginUI.ERROR_ALERT;

public class ErrorAlertVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ERROR_ALERT.resolveFor(actor).isVisible();
    }

    public static ErrorAlertVisible isVisible() {
        return new ErrorAlertVisible();
    }
}
