package features;

import manager.StepBase;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 11/17/2017.
 */
@Test
public class TestPUC extends StepBase {

    public void logiToPUCandCreateAnalysisReport() {
        app.setLoginPage(open(baseUrl, LoginPage.class));
        app.setHomePage(app.getLoginPage().login("Admin", "password"));
        app.getHomePage().createNewType("Analysis");
        app.getAnalysisReportPage().selectDataSource("SteelWheelsSales");
    }
}
