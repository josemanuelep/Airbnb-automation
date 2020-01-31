package co.com.choucair.certification.airbnb.stepsdefinitions;

import co.com.choucair.certification.airbnb.model.User;
import co.com.choucair.certification.airbnb.tasks.Login;
import co.com.choucair.certification.airbnb.tasks.OpenThe;
import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AirbnbSteps {

    private String url = "https://accounts.google.com/signin/oauth/identifier?client_id=622686756548-j87bjniqthcq1e4hbf1msh3fikqn892p.apps.googleusercontent.com&as=Neelqq7fjGBaM_ReXHe0WQ&destination=https%3A%2F%2Fwww.airbnb.com.co&approval_state=!ChRiUE9mRzJVcGFISzJUMGY4TzR4URIfZzBnbFlZSWkxck1lVUU3MWpGWk5XazJ6WXNLR194WQ%E2%88%99AJDr988AAAAAXjSgYpky9pYV2Hyyjj-mLCrW9srpErEi&oauthgdpr=1&xsrfsig=ChkAeAh8T1ZuiDkZSxHbg6POODo6gFsddgOtEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow";

    @Given("^Jose wants go to Airbnb page$")
    public void joseWantsGoToAirbnbPage() {
        theActorCalled("Jose").wasAbleTo(OpenThe.page());

    }


    @When("^He decide enter with Google account using the credencials$")
    public void heDecideEnterWithGoogleAccountUsingTheCredencials(List<User> users) {
        theActorCalled("Jose").attemptsTo(Login.withGoogleAccount(users,url));
    }

    @Then("^He should see his own profile image from Google$")
    public void heShouldSeeHisOwnProfileImageFromGoogle() {

    }

    @Given("^search for city$")
    public void searchForCity(DataTable arg1) {

    }

    @When("^he add some filters$")
    public void heAddSomeFilters(DataTable arg1) {

    }

    @When("^he add the cheapest to favorites with the name$")
    public void heAddTheCheapestToFavoritesWithTheName(DataTable arg1) {

    }

    @Then("^he should see a fill red heart$")
    public void heShouldSeeAFillRedHeart() {

    }
}
