package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags = {"@suite2"} ,
        features = "src/test/resources/features")
public class CucumberTestSuite2 {
}
