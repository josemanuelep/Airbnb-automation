package co.com.choucair.certification.airbnb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsLogg implements Question<Boolean> {
    private String altiImg ;

    public IsLogg(String altiImg) {
        this.altiImg = altiImg;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return this.altiImg.equals();
    }
}
