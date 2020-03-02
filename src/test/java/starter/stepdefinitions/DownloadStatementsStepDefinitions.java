package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.util.EnvironmentVariables;
import starter.abilities.ReadPdf;
import starter.navigation.NavigateTo;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DownloadStatementsStepDefinitions {

    String name;

    //Serenity properties - Serenity will instantiate this field automatically
    private EnvironmentVariables environmentVariables;

    String downloadFolder;
    String fileName;

    @Given("(.*) has made purchases with his credit card")
    public void pepito_has_made_purchases_with_his_credit_card(String name) throws InterruptedException {
        this.name = name;

        downloadFolder = environmentVariables.optionalProperty("download.filesFolder")
                .orElseThrow(IllegalArgumentException::new);

        fileName = environmentVariables.optionalProperty("statements.fileName")
                .orElseThrow(IllegalArgumentException::new);
    }

    @Given("he already downloaded his statements")
    public void he_already_downloaded_his_statements() throws InterruptedException {

        theActorCalled(name);

        withCurrentActor(
                NavigateTo.theDuckDuckGoHomePage()
        );

        Thread.sleep(5000);
    }

    @When("he reviews his transactions")
    public void he_reviews_his_transactions() throws IOException {

        String statementFilePath = String.format("%s/%s", downloadFolder, fileName);

        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));

        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();

        System.out.println(pdfText);
    }

    @Then("he should see the transactions for last month")
    public void he_should_see_the_transactions_for_last_month() {
    }

}
