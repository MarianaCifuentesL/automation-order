package com.qa.serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.qa.serenity.ui.NewOrderUI.SAVE_ORDER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveOrderTask implements Task {

    public static SaveOrderTask now() {
        return instrumented(SaveOrderTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SAVE_ORDER_BUTTON)
        );
    }


}
