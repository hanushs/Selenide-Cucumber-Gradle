package tests;

import org.junit.Test;
import pages.AnalysisReportPage;
import pages.DataSourcePage;
import pages.HomePage;
import pages.LoginPage;
import utills.TestBase;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 12/1/2017.
 */
public class PUC_Test extends TestBase {

    @Test
    public void createAnalysisReportTest() {
        LoginPage page = open(baseUrl, LoginPage.class);
        HomePage home = page.login("Admin", "password");
        DataSourcePage dataSource = home.createNew("Analysis report");
        AnalysisReportPage report = dataSource.selectDataSource("SteelWheels");
        report.addField("", "Rows");
        report.addField("", "Columns");
        report.addField("", "Measures");
    }
}
