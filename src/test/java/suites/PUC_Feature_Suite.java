package suites;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import utills.TestBase;

/**
 * Created by pshynin on 11/14/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", plugin = {"pretty", "html:build/cucumber-report"}, glue = {"steps"})
public class PUC_Feature_Suite {
}