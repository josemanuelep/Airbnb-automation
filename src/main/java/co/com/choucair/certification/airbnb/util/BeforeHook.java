package co.com.choucair.certification.airbnb.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BeforeHook {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }
}