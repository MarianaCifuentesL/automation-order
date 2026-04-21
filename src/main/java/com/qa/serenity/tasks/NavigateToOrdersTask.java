package com.qa.serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.qa.serenity.ui.HomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToOrdersTask implements Task {

    private final String module;
    private final String section;

    public NavigateToOrdersTask(String module, String section) {
        this.module = module;
        this.section = section;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(STARTSHARP_MENU),
                Click.on(NORTHWIND_MENU),
                Click.on(ORDERS_OPTION)
        );
    }

    public static NavigateToOrdersTask navigateToOrders(String module, String section) {
        return instrumented(NavigateToOrdersTask.class, module, section);
    }
}
