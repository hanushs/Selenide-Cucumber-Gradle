package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by pshynin on 11/14/2017.
 */
public class Login_StepDefinitions {
    private String username;
    private String password;

    @When("open PUC")
    public void openPUC() {
        //Configuration.browser = "chrome";
        open("https://google.com/ncr");
    }

    @Then("login with username (.*) and password (.*)")
    public void loginWithUsernameAdminAndPasswordPassword(String username, String password) {
        $(By.id("j_username")).val(username);
        $(By.id("j_password")).val(password).pressEnter();
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
