package puc;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/10/2017.
 */
public class PUC_FunctionalTest_Login {

    @Test
    public void testLogin() {
        open(Configuration.baseUrl);

        LoginPage page = open(Configuration.baseUrl, LoginPage.class);

        $(By.id("j_username")).val("Admin");
        $(By.id("j_password")).val("password");
        $(byText("Login")).click();

        // HomePage homePage = page.searchFor("selenide");
        // homePage.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));

        close();
    }

/*    @AfterClass
    public static void logout() {
        $(By.linkText("Log out")).click();
        $(".page-header").shouldHave(text("Articles"));
        $(By.linkText("Log in")).shouldBe(visible);
    }*/
}
