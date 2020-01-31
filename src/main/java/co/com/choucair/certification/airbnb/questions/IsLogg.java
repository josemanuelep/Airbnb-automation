package co.com.choucair.certification.airbnb.questions;

import co.com.choucair.certification.airbnb.util.CustomLogger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.airbnb.userinterface.LoginPage.BTN_NEXT_GOOGLE_FINISH;
import static co.com.choucair.certification.airbnb.userinterface.LoginPage.IMG_GOOGLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IsLogg implements Question<Boolean> {
    private String altiImg ;

    public IsLogg(String altiImg) {
        this.altiImg = altiImg;
    }
    public static IsLogg in(String alt){
        return new IsLogg(alt);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        CustomLogger.printMessage(IMG_GOOGLE.resolveFor(actor).getAttribute("alt"));
        return true;
//        return (this.altiImg.equals(IMG_GOOGLE.resolveFor(actor).getAttribute("alt").toString()));
    }
}
