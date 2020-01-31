package co.com.choucair.certification.airbnb.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target LOGIN_BUTTON = Target.the("Button to show login form").located(By.xpath("(//DIV[@class='_lvb55za'])[6]"));
    public static final Target LOGIN_BUTTON_GOOGLE = Target.the("Button to show login form").located(By.xpath("(//BUTTON[@type='submit'])[2]"));
    public static final Target EMAIL_GOOGLE = Target.the("Button to show login form").located(By.id("identifierId"));
    public static final Target BTN_NEXT_GOOGLE = Target.the("Button to show login form").located(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
    public static final Target BTN_NEXT_GOOGLE_FINISH = Target.the("Button to show login form").located(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
    public static final Target PASSWORD_GOOGLE = Target.the("Button to show login form").located(By.xpath("//input[@type='password']"));
    public static final Target IMG_GOOGLE = Target.the("Button to show login form").located(By.xpath("//IMG[@alt='Cuenta de José Manuel']"));
}
