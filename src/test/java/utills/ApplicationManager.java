package utills;

import com.codeborne.selenide.Configuration;
import pages.AnalysisReportPage;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by pshynin on 11/16/2017.
 */
public class ApplicationManager {
    private LoginPage loginPage;
    private HomePage homePage;
    private AnalysisReportPage analysisReportPage;

    ApplicationManager() {
        init();
    }

    private void init() {
        Configuration.baseUrl = "http://svqxqacn7platforma2.pentahoqa.com:8080/pentaho/";
        Configuration.timeout = 10000;
        Configuration.browser = "gecko"; //options: chrome, firefox(gecko, marionette), edge,

        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;

        Configuration.clickViaJs = true;

        loginPage = new LoginPage();
        homePage = new HomePage();
        analysisReportPage = new AnalysisReportPage();
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public HomePage getHomePage() {
        return homePage;
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

    public void setAnalysisReportPage(AnalysisReportPage analysisReportPage) {
        this.analysisReportPage = analysisReportPage;
    }
}
