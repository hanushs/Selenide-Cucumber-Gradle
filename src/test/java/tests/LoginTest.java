package tests;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Rule;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

;

/**
 * Created by pshynin on 11/10/2017.
 */
public class LoginTest {

    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @Test
    public void testLogin() {
        System.setProperty("selenide.browser", "Chrome");
        LoginPage page = open(baseUrl, LoginPage.class);
        HomePage home = page.login();
        close();
    }
}