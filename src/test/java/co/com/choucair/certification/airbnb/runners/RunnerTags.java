package co.com.choucair.certification.airbnb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        monochrome=true,
        strict = true,
        features = "src/test/resources/features/",
        tags = "@Tag1",
        glue = {"co.com.choucair.certification.airbnb.stepsdefinitions", "co.com.choucair.certification.airbnb.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
