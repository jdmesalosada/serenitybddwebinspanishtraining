package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class DownloadStatementsStepDefinitions {

    String name;

    @Given("(.*) has made purchases with his credit card")
    public void pepito_has_made_purchases_with_his_credit_card(String name) throws InterruptedException {
        this.name = name;

        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage());

        Thread.sleep(5000);

    }

    @Given("he already downloaded his statements")
    public void he_already_downloaded_his_statements() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("he reviews his transactions")
    public void he_reviews_his_transactions() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("he should see the transactions for last month")
    public void he_should_see_the_transactions_for_last_month() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
