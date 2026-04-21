package com.qa.serenity.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static com.qa.serenity.ui.NewOrderUI.*;
import static com.qa.serenity.ui.OrdersUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateOrderTask implements Task {

    private final DataTable orderInfo;


    public CreateOrderTask(DataTable orderInfo) {
        this.orderInfo = orderInfo;
    }

    public static CreateOrderTask with(DataTable orderInfo) {
        return instrumented(CreateOrderTask.class, orderInfo);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        var data = new HashMap<>(orderInfo.asMap(String.class, String.class));

//        var data = orderInfo.asMap(String.class, String.class);

        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        data.put("Date", currentDate);

        actor.remember("orderData", data);

        actor.attemptsTo(
                Click.on(NEW_ORDER_BUTTON),
                Click.on(COSTUMER_FIELD),
                Enter.theValue(data.get("Customer")).into(COSTUMER_INPUT),
                WaitUntil.the(COSTUMER_SELECTION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(COSTUMER_SELECTION),

                Click.on(ORDER_DATE_FIELD),
                Clear.field(ORDER_DATE_FIELD),
                Click.on(DATE_BUTTON),   // abre calendario
                Click.on(TODAY_BUTTON),        // selecciona hoy


                Click.on(EMPLOYEE_FIELD),
                Enter.theValue(data.get("Employee")).into(EMPLOYEE_INPUT),
                WaitUntil.the(EMPLOYEE_SELECTION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(EMPLOYEE_SELECTION)
                // manejar fecha si es "current"
        );
    }
}
