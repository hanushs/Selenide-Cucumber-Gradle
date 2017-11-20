package manager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import pages.AnalysisReportPage;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

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
        loginPage = new LoginPage();
        homePage = new HomePage();
        analysisReportPage = new AnalysisReportPage();
        Configuration.baseUrl = "http://svqxqacn6platforma1.pentahoqa.com:8080/pentaho/Home";
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        //Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
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
