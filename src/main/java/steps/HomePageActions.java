package steps;

import cucumber.api.java.en.And;
import utills.TestBase;


/**
 * Created by pshynin on 11/15/2017.
 */
public class HomePageActions extends TestBase {

   @And("^create new (.*) report$")
    public void createNewType(String type) {
        app.getHomePage().createNew(type);
    }
}