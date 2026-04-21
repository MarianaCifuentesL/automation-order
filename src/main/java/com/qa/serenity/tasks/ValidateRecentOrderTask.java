package com.qa.serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class ValidateRecentOrderTask implements Task {

    private final String expectedCustomer;
    private final String expectedDate;
    private final String expectedEmployee;

    public ValidateRecentOrderTask(String expectedCustomer, String expectedDate, String expectedEmployee) {
        this.expectedCustomer = expectedCustomer;
        this.expectedDate = expectedDate;
        this.expectedEmployee = expectedEmployee;
    }

    public static ValidateRecentOrderTask with(String customer, String date, String employee) {
        return new ValidateRecentOrderTask(customer, date, employee);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}