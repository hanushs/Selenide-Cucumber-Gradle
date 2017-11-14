package puc;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.FIREFOX;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

;

/**
 * Created by pshynin on 11/10/2017.
 */
public class PUC_FunctionalTest_Login {
    private LoginPage page;
    Configuration configuration = new Configuration();

    // @Rule
    // public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @Test
    public void init() {

        //baseUrl = "http://localhost:8080/pentaho";
        //browser = FIREFOX;
        //startMaximized = false;
        page = open(baseUrl, LoginPage.class);
        // waitUntilPagesIsLoaded();
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

/*    protected static void waitUntilPagesIsLoaded() {
        $(byText("Loading")).waitUntil(disappears, 20000);
    }*/
}
