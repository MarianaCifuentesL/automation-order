package com.qa.serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.qa.serenity.ui.HomeUI.*;
import static com.qa.serenity.ui.NewOrderUI.COSTUMER_SELECTION;
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
                WaitUntil.the(STARTSHARP_MENU, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(STARTSHARP_MENU),
                WaitUntil.the(NORTHWIND_MENU, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NORTHWIND_MENU),
                WaitUntil.the(ORDERS_OPTION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ORDERS_OPTION)
        );
    }

    public static NavigateToOrdersTask navigateToOrders(String module, String section) {
        return instrumented(NavigateToOrdersTask.class, module, section);
    }
}
