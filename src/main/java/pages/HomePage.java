package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pshynin on 11/10/2017.
 */
public class HomePage {

    public SelenideElement createNewButton() {
        return $(By.id("btnCreateNew"));
    }

    public SelenideElement div() {
        return $(By.id("btnCreateNew"));
    }

    public SelenideElement createNewAnalysisReportButton() {
        return $(By.id("createNewanalyzerButton"));
    }

    public HomePage() {
    }

    public void createNewType(String reportType) {
        if (createNewButton().isDisplayed()) {
            createNewButton().click();
            if (reportType.contains("Analysis")) {
                createNewAnalysisReportButton().click();
            }
        }
    }


    public void removeFrame() {
        div().clear();
    }
}