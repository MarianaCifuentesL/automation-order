package com.qa.serenity.stepDefinitions;

import com.qa.serenity.questions.DashboardVisible;
import com.qa.serenity.questions.ErrorAlertVisible;
import com.qa.serenity.tasks.LoginTask;
import com.qa.serenity.tasks.OpenBrowserTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinition {

    @Given("the user opens the browser")
    public void theUserOpensTheBrowser() {

        theActorInTheSpotlight().wasAbleTo(
                OpenBrowserTask.openBrowser()
        );
    }

    @When("the user sends the credentials")
    public void theUserSendsTheCredentials(DataTable dataTable) {

        theActorInTheSpotlight().attemptsTo(
                LoginTask.loginTask(dataTable)
        );
    }


    @Then("the user can see the message {string}")
    public void theUserCanSeeTheMessage(String expectedMessage) {

        if (expectedMessage.equals("Dashboard visible")) {
            theActorInTheSpotlight().should(
                    seeThat(DashboardVisible.isVisible(), equalTo(true))
            );
        } else if (expectedMessage.equals("Alert")) {
            theActorInTheSpotlight().should(
                    seeThat(ErrorAlertVisible.isVisible(), equalTo(true))
            );
        }
    }
}
