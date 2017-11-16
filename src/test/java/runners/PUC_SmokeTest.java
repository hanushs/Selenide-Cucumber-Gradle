package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by pshynin on 11/14/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", glue = {"steps"})
public class PUC_SmokeTest {
}