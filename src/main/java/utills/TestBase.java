package utills;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by pshynin on 11/16/2017.
 */
public class TestBase {

    protected static final ApplicationManager app
            = new ApplicationManager();

/*    @BeforeClass
    public void init() {
        System.out.println("#################################################");
        System.out.println("STARTED TEST: " + Test.class.getCanonicalName());
    }

    @AfterClass
    public void tearDown() {
        System.out.println("#################################################");
        System.out.println("FINISHED TEST: " + Test.class.getCanonicalName());
    }*/
}
