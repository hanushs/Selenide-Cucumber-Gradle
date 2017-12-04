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

    private SelenideElement div() {
        return $(By.id("div"));
    }

    private SelenideElement createNewAnalysisReportButton() {
        return $(By.cssSelector(".popover-content>#createNewanalyzerButton"));
    }

    public SelenideElement page() {
        return $(By.id("mantle-perspective-switcher"));
    }

    public SelenideElement wellSidebar() { return  $("div.well sidebar"); }

    public HomePage() {
    }

    public DataSourcePage createNew(String reportType) {
        switchTo().frame(homeFrame());
        createNewButton().pressEnter();
        if (reportType.contains("Analysis")) {
            createNewAnalysisReportButton().click();
        }
        return new DataSourcePage();
    }
}