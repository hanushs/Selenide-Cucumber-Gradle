package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
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
        LoginPage page = open(baseUrl, LoginPage.class);

        app.setLoginPage(open(baseUrl, LoginPage.class));
    }

    @Then("^login with username (.*) and password (.*)$")
    public void login(String username, String password) {
        app.setHomePage(app.getLoginPage().login(username, password));
    }

    @And("^select report$")
    public void selectReport() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}