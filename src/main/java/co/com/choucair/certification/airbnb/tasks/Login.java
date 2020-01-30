package co.com.choucair.certification.airbnb.tasks;

import co.com.choucair.certification.airbnb.interactions.ChangeWindow;
import co.com.choucair.certification.airbnb.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.airbnb.userinterface.LoginPage.*;
import static co.com.choucair.certification.airbnb.util.Constants.INDEX_0;

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
                Enter.theValue(users.get(INDEX_0).getPassword()).into(PASSWORD_GOOGLE),
                Click.on(BTN_NEXT_GOOGLE_FINISH)
        );
    }
}
