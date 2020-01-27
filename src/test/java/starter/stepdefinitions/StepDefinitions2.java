package starter.stepdefinitions;

import cucumber.api.java.en.Then;
import starter.conf.SessionVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions2 {

    @Then("he should get Foo")
    public void he_should_get_Foo() {
        String valueRecall = theActorInTheSpotlight().recall(SessionVariables.FOO.toString());

    }
}
