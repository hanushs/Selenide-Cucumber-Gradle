package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit.TextReport;
import com.google.common.base.Strings;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import pages.AnalysisReportPage;
import pages.DataSourcePage;
import pages.HomePage;
import pages.LoginPage;
import utills.Highlighter;

import java.util.Enumeration;
import java.util.ResourceBundle;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.addListener;

/**
 * Created by pshynin on 12/1/2017.
 */
public class PUC_Test {

    @Rule
    public TestRule report = new TextReport();

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();

    @BeforeClass
    public static void init() {
        addListener(new Highlighter());

        ResourceBundle rb = ResourceBundle.getBundle("local");
        Enumeration<String> keys = rb.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.setProperty(key, (Strings.isNullOrEmpty(System.getProperty(key)) ? value : System.getProperty(key)));
        }
    }

    @Test
    public void createAnalysisReportTest() {
        LoginPage page = open(baseUrl, LoginPage.class);
        HomePage home = page.login("Admin", "password");
        DataSourcePage dataSource = home.createNew("Analysis report");
        AnalysisReportPage report = dataSource.selectDataSource("SteelWheelseee");
        report.addField("", "Rows");
        report.addField("", "Columns");
        report.addField("", "Measures");
    }
}
