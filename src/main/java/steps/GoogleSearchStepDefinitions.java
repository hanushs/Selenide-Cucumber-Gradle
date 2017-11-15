package stepdefinition;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/14/2017.
 */
public class GoogleSearchStepDefinitions {
    private String keyword;

    @Given("an open browser with google.com")
    public void openGoogleSearch() {
        Configuration.browser = "chrome";
        open("https://google.com/ncr");
    }

    @When("a keyword (.*) is entered in input field")
    public void enterKeyword(String keyword) {
        this.keyword = keyword;
        $(By.name("q")).val(keyword).pressEnter();
    }

    @Then("top (\\d+) matches should be shown")
    public void topTenMatchesShouldBeShown(int resultsCount) {
        $$("#res .g").shouldHave(size(resultsCount));
    }

    @Then("the first one should contain (\\d+)")
    public void theFirstOneShouldContainKeyword(String expectedText) {
        $("#res .g").shouldHave(text(expectedText));
    }
}