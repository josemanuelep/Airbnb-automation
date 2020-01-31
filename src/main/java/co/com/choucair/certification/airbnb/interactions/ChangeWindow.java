package co.com.choucair.certification.airbnb.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ChangeWindow implements Interaction {
    private String urlTochange;


    public ChangeWindow(String urlTochange) {
        this.urlTochange = urlTochange;
    }

    public static ChangeWindow nextTab(String urlTochange) {
        return new ChangeWindow(urlTochange);
    }

    public static void toDefaultWindow(){

        getDriver().switchTo().window(getDriver().getWindowHandle());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> listWindows = getDriver().getWindowHandles();
        for (String handle : listWindows) {
            getDriver().switchTo().window(handle);
            if (getDriver().getCurrentUrl().equals(urlTochange)) {
                    break;
            }

        }
    }

}