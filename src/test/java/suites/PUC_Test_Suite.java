package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import tests.PUC_SmokeTest;

/**
 * Created by pshynin on 11/14/2017.
 */
@RunWith(value = org.junit.runners.Suite.class)
@SuiteClasses(value = {PUC_SmokeTest.class})
public class PUC_Test_Suite {
}