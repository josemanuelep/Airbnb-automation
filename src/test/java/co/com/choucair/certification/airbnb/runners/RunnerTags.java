package co.com.choucair.certification.airbnb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/Airbnb.feature",
        tags = "@Regresion",
        glue = {"co.com.choucair.certification.airbnb.stepsdefinitions", "co.com.choucair.certification.airbnb.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
