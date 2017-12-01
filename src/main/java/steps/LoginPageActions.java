package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utills.TestBase;
import pages.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/14/2017.
 */
public class LoginPageActions extends TestBase {

    @When("^open PUC$")
    public void openPUC() {
        app.setLoginPage(open(baseUrl, LoginPage.class));
    }

    @Then("^login with username (.*) and password (.*)$")
    public void login(String username, String password) {
        app.setHomePage(app.getLoginPage().login(username, password));
    }
}