package steps;

import cucumber.api.java.en.And;
import manager.StepBase;


/**
 * Created by pshynin on 11/15/2017.
 */
public class HomePageActions extends StepBase {

   @And("^create new (.*) report$")
    public void createNewType(String type) {
        app.getHomePage().createNewType(type);
    }
}