package co.com.choucair.certification.airbnb.tasks;

import co.com.choucair.certification.airbnb.interactions.ChangeToDefault;
import co.com.choucair.certification.airbnb.interactions.ChangeWindow;
import co.com.choucair.certification.airbnb.model.User;
import co.com.choucair.certification.airbnb.util.CustomLogger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.airbnb.userinterface.LoginPage.*;
import static co.com.choucair.certification.airbnb.util.Constants.INDEX_0;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.apache.commons.io.FileUtils.waitFor;

public class Login implements Task {

    private List<User> users;
    private String url;

    public Login(List<User> users, String url) {
        this.users = users;
        this.url = url;
    }

    public static Login withGoogleAccount(List<User> users, String url) {
        return Tasks.instrumented(Login.class, users, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON),
                Click.on(LOGIN_BUTTON_GOOGLE),
                ChangeWindow.nextTab(this.url),
                Enter.theValue(users.get(INDEX_0).getUser()).into(EMAIL_GOOGLE),
                Click.on(BTN_NEXT_GOOGLE),
                WaitUntil.the(PASSWORD_GOOGLE, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(users.get(INDEX_0).getPassword()).into(PASSWORD_GOOGLE),
                WaitUntil.the(BTN_NEXT_GOOGLE_FINISH, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_NEXT_GOOGLE_FINISH)
//                ChangeToDefault.window()
        );
    }
}
