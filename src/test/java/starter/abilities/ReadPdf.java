package starter.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class ReadPdf implements Ability {

    public ReadPdf() {
    }

    public static ReadPdf using() {
        return new ReadPdf();
    }

    public static ReadPdf as(Actor actor) {
        return actor.abilityTo(ReadPdf.class);
    }

}
