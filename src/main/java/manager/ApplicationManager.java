package manager;

import pages.AnalysisReportPage;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by pshynin on 11/16/2017.
 */
public class ApplicationManager {
    LoginPage loginPage;
    HomePage homePage;
    AnalysisReportPage analysisReportPage;

    public ApplicationManager() {
        init();
    }

    public void init() {
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
