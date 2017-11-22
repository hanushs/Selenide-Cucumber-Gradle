package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by pshynin on 11/10/2017.
 */
public class HomePage {

    private SelenideElement homeFrame() {
        return $(By.id("home.perspective"));
    }

    private SelenideElement createNewButton() {
        return $(By.id("btnCreateNew"));
    }

    public SelenideElement div() {
        return $(By.id("btnCreateNew"));
    }

    private SelenideElement createNewAnalysisReportButton() {
        return $(By.cssSelector(".popover-content>#createNewanalyzerButton"));
    }

    public HomePage() {
    }

    public void createNew(String reportType) {
        switchTo().frame(homeFrame());
        createNewButton().click();
        if (reportType.contains("Analysis")) {
            createNewAnalysisReportButton().click();
        }
    }
}