package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utills.TestBase;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by pshynin on 12/1/2017.
 */
public class PUC_SmokeTest extends TestBase {


    @Test
    public void loginTest() {
        LoginPage page = open(baseUrl, LoginPage.class);
        HomePage home = page.login("Admin", "password");
        home.createNew("Analysis report");
    }

    @Test
    public void homePerspectiveTest() {

    }

    @Test
    public void createNewAnalysisReportTest() {

    }
}
