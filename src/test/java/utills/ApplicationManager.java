package utills;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import pages.AnalysisReportPage;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

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
        Configuration.browser = "firefox"; //options: chrome, firefox
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
        Configuration.headless = true;

        clearBrowserCookies();
      //  driverSetup(getWebDriver());

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

    private void driverSetup(WebDriver driver) {
      //  driver.equals(CHROME) ? chromeOptions.addArguments("headless", "disable-gpu") : getWebDriver();
    }
}
