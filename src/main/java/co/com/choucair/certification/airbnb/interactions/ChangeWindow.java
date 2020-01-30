package co.com.choucair.certification.airbnb.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ChangeWindow implements Interaction {
    private String urlTochange;
    // Create a Logger
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public ChangeWindow(String urlTochange) {
        this.urlTochange = urlTochange;
    }

    public static ChangeWindow nextTab(String urlTochange) {
        return new ChangeWindow(urlTochange);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> listWindows = getDriver().getWindowHandles();
        LOGGER.log(Level.SEVERE, "Changing window");
        for (String handle : listWindows) {
            getDriver().switchTo().window(handle);
            if (getDriver().getCurrentUrl().equals(urlTochange)) {
                    break;
            }

        }
    }

}