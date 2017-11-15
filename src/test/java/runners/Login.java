package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by pshynin on 11/14/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"stepDefinition"})
public class Login {
}
