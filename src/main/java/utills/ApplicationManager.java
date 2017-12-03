package utills;

import com.google.common.base.Strings;
import gherkin.lexer.Da;
import pages.AnalysisReportPage;
import pages.DataSourcePage;
import pages.HomePage;
import pages.LoginPage;

import java.util.Enumeration;
import java.util.ResourceBundle;

import static com.codeborne.selenide.WebDriverRunner.addListener;

/**
 * Created by pshynin on 11/16/2017.
 */
public class ApplicationManager {
    private LoginPage loginPage;
    private HomePage homePage;
    private DataSourcePage dataSourcePage;
    private AnalysisReportPage analysisReportPage;

    ApplicationManager() {
        init();
    }

    private void init() {
        ResourceBundle rb = ResourceBundle.getBundle("local");
        Enumeration<String> keys = rb.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.setProperty(key, (Strings.isNullOrEmpty(System.getProperty(key)) ? value : System.getProperty(key)));
        }

        addListener(new Highlighter());

        loginPage = new LoginPage();
        homePage = new HomePage();
        dataSourcePage = new DataSourcePage();
        analysisReportPage = new AnalysisReportPage();
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public DataSourcePage getDataSourcePage() {
        return dataSourcePage;
    }

    public AnalysisReportPage getAnalysisReportPage() {
        return analysisReportPage;
    }

    public void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public void setDataSourcePage(DataSourcePage dataSourcePage) {
        this.dataSourcePage = dataSourcePage;
    }

    public void setAnalysisReportPage(AnalysisReportPage analysisReportPage) {
        this.analysisReportPage = analysisReportPage;
    }
}
