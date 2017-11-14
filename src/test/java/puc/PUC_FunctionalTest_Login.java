package puc;

import com.codeborne.selenide.junit.ScreenShooter;;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

/**
 * Created by pshynin on 11/10/2017.
 */
public class PUC_FunctionalTest_Login {
    private LoginPage page;

   // @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @BeforeClass
    public static void init() {
        timeout = 10000;
        baseUrl = "http://localhost:8080/pentaho/PUC_Login_StepDefinitions";
        browser = FIREFOX;
        startMaximized = false;
        open(baseUrl, LoginPage.class);
        waitUntilPagesIsLoaded();
    }

    @Test
    public void testLogin() {
        HomePage home = page.login();
        close();
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

    protected static void waitUntilPagesIsLoaded() {
        $(byText("Loading")).waitUntil(disappears, 20000);
    }
}
