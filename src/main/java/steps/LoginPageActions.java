package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.pool2.ObjectPool;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/14/2017.
 */
public class LoginPageActions extends StepBase {
    LoginPage loginPage;
    HomePage homePage;

    private ObjectPool<StringBuffer> pool;


    @When("^open PUC$")
    public void openPUC() {
        app.setLoginPage(open("http://svqxqacn7platforma2.pentahoqa.com:8080/pentaho/Login", LoginPage.class));
    }


    @Then("^login with username (.*) and password (.*)$")
    public void login(String username, String password) {
        app.setHomePage(app.getLoginPage().login(username, password));
    }
}