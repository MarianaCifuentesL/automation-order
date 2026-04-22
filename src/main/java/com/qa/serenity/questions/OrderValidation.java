package com.qa.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import static com.qa.serenity.ui.OrdersUI.*;

public class OrderValidation implements Question<Boolean> {

    public static OrderValidation isSuccessful() {
        return new OrderValidation();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Map<String, String> data = actor.recall("orderData");

        String expectedCustomer = data.get("Customer");
        String expectedEmployee = data.get("Employee");
        String expectedDate = data.get("Date");

        String actualCustomer = Text.of(RECENT_ORDER_CUSTOMER).answeredBy(actor);
        String actualEmployee = Text.of(RECENT_ORDER_EMPLOYEE).answeredBy(actor);
        String actualDate = Text.of(RECENT_ORDER_DATE).answeredBy(actor);

        // Ajustar el formato de la fecha real al formato esperado
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate actualDateFormatted = LocalDate.parse(actualDate, inputFormatter);
        String actualDateReformatted = actualDateFormatted.format(outputFormatter);

        return actualCustomer.contains(expectedCustomer)
                && actualEmployee.contains(expectedEmployee)
                && actualDateReformatted.equals(expectedDate);
    }
}
