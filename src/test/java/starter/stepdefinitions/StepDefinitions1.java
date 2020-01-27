package starter.stepdefinitions;

import cucumber.api.java.en.When;
import starter.conf.SessionVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions1 {

    @When("he tries to remember (.*)")
    public void he_tries_to_remember_Foo(String value) {
        theActorInTheSpotlight().remember(SessionVariables.FOO.toString(), value);
    }
}
