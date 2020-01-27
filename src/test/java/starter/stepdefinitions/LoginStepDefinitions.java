package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import starter.builders.Login;
import starter.navigation.NavigateTo;
import starter.questions.dashboard.OverviewData;
import starter.ui.dashboard.DashboardPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    String name;

    @Given("(.*) has an active account")
    public void has_an_active_account(String name) {
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                Login
                        .with()
                        .username("pepito")
                        .and()
                        .password("seguridad")
                        .and()
                        .rememberMe()
        );
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
        theActorInTheSpotlight().should(
                seeThat("The displayed credit available", OverviewData.creditAvailable(), equalTo("$17,800")),
                seeThat("The displayed credit available", OverviewData.creditAvailable(), equalTo("$17,800"))
        );

        theActorInTheSpotlight().attemptsTo(
                Click.on(DashboardPage.LEFT_MENU.CREDIT_CARD_LINK)
        );
    }
}
