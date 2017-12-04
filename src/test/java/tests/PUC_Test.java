package tests;

import org.junit.Test;
import pages.AnalysisReportPage;
import pages.DataSourcePage;
import pages.HomePage;
import pages.LoginPage;
import utills.TestBase;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 12/1/2017.
 */
public class PUC_Test extends TestBase {
    private HomePage home;

    @Test
    public void loginTest() {
        LoginPage page = open(baseUrl, LoginPage.class);
        home = page.login("Admin", "password");
        home.buttons().shouldHave(
                texts("Browse Files",
                        "Create New",
                        "Manage Data Sources",
                        "Documentation"));
    }

    @Test
    public void create() {
        DataSourcePage dataSource = home.createNew("Analysis report");
        AnalysisReportPage report = dataSource.selectDataSource("SteelWheels");
        report.addField("", "Rows");
        report.addField("", "Columns");
        report.addField("", "Measures");
    }
}
