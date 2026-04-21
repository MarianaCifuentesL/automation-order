package com.qa.serenity.tasks;

import com.qa.serenity.interactions.ClickOn;
import com.qa.serenity.interactions.EnterText;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import static com.qa.serenity.ui.LoginUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final DataTable data;

    public LoginTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T t) {

        t.attemptsTo(
                EnterText.into(USERNAME_INPUT, String.valueOf(data.cell(0, 0))),
                EnterText.into(PWD_INPUT, String.valueOf(data.cell(1, 0))),
                ClickOn.element(LOGIN_BTN)
        );
    }

        public static LoginTask loginTask(DataTable data) {
        return instrumented(LoginTask.class, data);
        }
}
