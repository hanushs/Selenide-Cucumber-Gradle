package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.AnalysisReportPage;
import pages.DataSourcePage;
import pages.HomePage;
import pages.LoginPage;
import utills.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pshynin on 12/1/2017.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PUC_UITest extends TestBase {
    private HomePage homePage;
    private DataSourcePage dataSourcePage;
    private AnalysisReportPage analysisReportPage;

    @Test
    public void Test1homePage() {
        LoginPage page = open(baseUrl, LoginPage.class);
        homePage = page.login("Admin", "password");

        homePage.sidebar().shouldHave(
                text("Browse Files"),
                text("Create New"),
                text("Manage Data Sources"),
                text("Documentation"));
    }

    @Test
    public void Test2DataSource() {
        dataSourcePage = homePage.createNew("Analysis report");
    }

    @Test
    public void Test3AnalysisReport() {
        analysisReportPage = dataSourcePage.selectDataSource("Steel Wheels");

    }

    @Test
    public void Test4AddFields() {
    }
}
