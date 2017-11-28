package utills;

import pages.AnalysisReportPage;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by pshynin on 11/16/2017.
 */
public class ApplicationManager {
    private final Properties properties;
    private LoginPage loginPage;
    private HomePage homePage;
    private AnalysisReportPage analysisReportPage;

    ApplicationManager() {
        properties = new Properties();
        init();
    }

    private void init() {
        String target = System.getProperty("target", "gradle");

        try {
            properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
        } catch (IOException e) {
            e.printStackTrace();
        }

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
