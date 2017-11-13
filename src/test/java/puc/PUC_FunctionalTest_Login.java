package puc;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/10/2017.
 */
public class PUC_FunctionalTest_Login {

    @Test
    public void testLogin() {
       // open("http://localhost:8080");
       //open(Configuration.baseUrl);
        LoginPage page = open("http://localhost:8080", LoginPage.class);


        //LoginPage page = open(System.getProperty("baseUrl"), LoginPage.class);
        HomePage home = page.login();
        close();
    }

/*    @AfterClass
    public static void logout() {
        $(By.linkText("Log out")).click();
        $(".page-header").shouldHave(text("Articles"));
        $(By.linkText("Log in")).shouldBe(visible);
    }*/
}
