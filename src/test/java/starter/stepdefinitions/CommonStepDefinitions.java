package starter.stepdefinitions;

import cucumber.api.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStepDefinitions {

    @Given("(.*) wants to remember something")
    public void setActorName(String name) {
        theActorCalled(name);
    }

}
