package tests;

import org.testng.annotations.Test;
import pages.AnalysisReportPage;
import pages.DataSourcePage;
import pages.HomePage;
import pages.LoginPage;
import utills.TestBase;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 12/1/2017.
 */
public class PUC_Test extends TestBase {
    private HomePage home;
    private AnalysisReportPage report;

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

    @Test (dependsOnMethods = "loginTest")
    public void selectDataSource() {
        DataSourcePage dataSource = home.createNew("Analysis report");
        dataSource.selectDialog().shouldHave(text("Select Data Source"));
        report = dataSource.selectDataSource("SteelWheels");
        report.widgitLable().shouldHave(text("Analysis Report"));
    }

    @Test (dependsOnMethods = "selectDataSource")
    public void addFields() {
        report.addField("", "Rows");
        report.addField("", "Columns");
        report.addField("", "Measures");
    }
}
