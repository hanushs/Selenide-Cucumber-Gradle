package tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import utills.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by pshynin on 12/1/2017.
 */
public class PUC_Streightforward extends TestBase {

    @Test
    public void testLoginAndVerifyMainSection() {
        open("/url");
        $(By.id("j_username")).val("Admin");
        $(By.id("j_password")).val("password");
        $("#submit").click();

        $(By.id("pucHeader")).waitUntil(Condition.text("Home"), 4000);
        $("#well sidebar").shouldHave(
                text("Browse Files"),
                text("Create New"),
                text("Manage Data Sources"),
                text("Documentation"));

//        assertThat($("#getting-started").getText(), equalTo("Getting Started"));
//        assertThat($$("#sub-messages>p").size(), equalTo(String.valueOf(4)));
    }

    @Test
    public void testLoginAndVerifyHeader() {
        open("/url");
        $(By.id("j_username")).val("Admin");
        $(By.id("j_password")).val("password").pressEnter();
        $$(".gwt-MenuItem").shouldHaveSize(4);
        $(".gwt-MenuItem").shouldBe(visible).shouldHave(
                text("File"),
                text("View"),
                text("View"),
                text("View"));

 //       assertThat($("#getting-started").getText(), equalTo("Getting Started"));
    }

    @Test
    public void analysisReportTest() {
    }

    @Test
    public void addFieldsTest() {
    }
}
