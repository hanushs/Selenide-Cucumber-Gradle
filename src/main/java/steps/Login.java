package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/14/2017.
 */
public class Login {
    private LoginPage loginPage;
    private HomePage homePage;

    @When("open PUC")
    public void openPUC() {
        LoginPage loginPage = open(baseUrl, LoginPage.class);
    }

    @Then("login with username (.*) and password (.*)")
    public void loginWithUsernameAdminAndPasswordPassword(String username, String password) {
        HomePage homePage = loginPage.login();
    }

    @Then("PUC opened")
    public void topTenMatchesShouldBeShown(int resultsCount) {
        $$("#res .g").shouldHave(size(resultsCount));
    }

    @And("^create new Analysis report$")
    public void createNewAnalysisReport() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
