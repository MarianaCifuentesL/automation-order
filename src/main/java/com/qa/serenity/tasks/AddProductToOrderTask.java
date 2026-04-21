package com.qa.serenity.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.qa.serenity.ui.NewOrderDetailUI.*;
import static com.qa.serenity.ui.NewOrderUI.COSTUMER_SELECTION;
import static com.qa.serenity.ui.NewOrderUI.NEW_ORDER_DETAIL_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToOrderTask implements Task {

    private final DataTable productInfo;

    public AddProductToOrderTask(DataTable productInfo) {
        this.productInfo = productInfo;
    }

    public static AddProductToOrderTask with(DataTable productInfo) {
        return instrumented(AddProductToOrderTask.class, productInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        var data = productInfo.asMap(String.class, String.class);

        actor.attemptsTo(
                Click.on(NEW_ORDER_DETAIL_BUTTON),
                Click.on(PRODUCT_FIELD),
                Enter.theValue(data.get("Product")).into(PRODUCT_INPUT),
                WaitUntil.the(PRODUCT_SELECTION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PRODUCT_SELECTION),

                Enter.theValue(data.get("Quantity")).into(QUANTITY_FIELD),
                Enter.theValue(data.get("Price")).into(UNIT_PRICE_FIELD),
                Click.on(SAVE_ORDER_DETAIL_BUTTON)
        );
    }


}
