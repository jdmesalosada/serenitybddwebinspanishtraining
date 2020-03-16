package starter.facts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.facts.Fact;
import starter.questions.token.GetToken;

public class AToken implements Fact {

    private String token;

    public static AToken toManageTheirProducts() {
        return new AToken();
    }

    @Override
    public void setup(Actor actor) {
        token = GetToken
                .toManageMyProducts()
                .answeredBy(actor);

        //Inject token into the browser.
    }


    public String toString() {
        return "token is " + token;
    }


}
