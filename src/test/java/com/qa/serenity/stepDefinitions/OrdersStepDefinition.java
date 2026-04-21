package com.qa.serenity.stepDefinitions;

import com.qa.serenity.questions.OrderValidation;
import com.qa.serenity.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrdersStepDefinition {


    @When("the user navigates to the {string} section in the {string} module")
    public void theUserNavigatesToTheSectionInTheModule(String section, String module) {
        theActorInTheSpotlight().attemptsTo(
                NavigateToOrdersTask.navigateToOrders(module, section)
        );
    }

    @When("creates a new order with the following main information:")
    public void createsANewOrderWithTheFollowingMainInformation(DataTable orderInfo) {
        theActorInTheSpotlight().attemptsTo(
                CreateOrderTask.with(orderInfo)
        );
    }

    @When("adds the following product to the order details:")
    public void addsTheFollowingProductToTheOrderDetails(DataTable productInfo) {
        theActorInTheSpotlight().attemptsTo(
                AddProductToOrderTask.with(productInfo)
        );
    }

    @When("saves the order record")
    public void savesTheOrderRecord() {
        theActorInTheSpotlight().attemptsTo(
                SaveOrderTask.now()
        );
    }

    @Then("the system shall display that the order was successfully created")
    public void theSystemShallDisplayThatTheOrderWasSuccessfullyCreated() {
        theActorInTheSpotlight().should(
                seeThat(OrderValidation.isSuccessful())

        );

    }
}
