package co.com.loginPOM.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/login.feature",
        glue="co/com/loginPOM/stepdefinitions", snippets = CucumberOptions.SnippetType.CAMELCASE


)
public class runnerLogin {

}
