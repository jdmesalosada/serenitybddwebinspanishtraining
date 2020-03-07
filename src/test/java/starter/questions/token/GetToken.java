package starter.questions.token;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.UUID;

public class GetToken implements Question<String> {

    public static Question<String> toManageMyProducts(){
        return new GetToken();
    }


    @Override
    public String answeredBy(Actor actor) {
        return UUID.randomUUID().toString();
    }
}
