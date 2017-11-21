package features;

import utills.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/17/2017.
 */
@Test
public class TestPUC extends TestBase {

    public void logiToPUCandCreateAnalysisReport() {
        app.setLoginPage(open(baseUrl, LoginPage.class));
        app.setHomePage(app.getLoginPage().login("Admin", "password"));
        app.getHomePage().createNew("Analysis");
        app.getAnalysisReportPage().selectDataSource("SteelWheelsSales");
    }
}
