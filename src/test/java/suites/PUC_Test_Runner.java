package suites;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import tests.PUC_SmokeTest;

/**
 * Created by pshynin on 11/14/2017.
 */
@RunWith(Cucumber.class)
@SuiteClasses(PUC_SmokeTest.class)
public class PUC_Test_Runner {
}