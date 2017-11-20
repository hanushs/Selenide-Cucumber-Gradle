package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportPage {

    private SelenideElement frame() {
        return $(By.cssSelector("[name*=frame_]"));
    }

    private ElementsCollection dataSourcesList() {
        return $$(By.cssSelector("#datasources > option"));
    }

    private SelenideElement selectDataSourceOkButton() {
        return $(By.id("btnNext"));
    }

    private SelenideElement selectDataSourceCancelButton() {
        return $(By.id("btnCancel"));
    }

    public AnalysisReportPage() {
    }

    public void selectDataSource(String dataSource) {
        //frame().scrollTo().click();
        //switchTo().innerFrame("frame");
        makeClickable();
        for (SelenideElement element : dataSourcesList()) {
            if (element.getText().contains(dataSource)) {
                element.scrollTo().doubleClick();
            }
        }
    }

    public void makeClickable() {
        // magic fix to make element clickable if div is on the front
        try {
            String css = "body > div[style*='display: block']";
            ElementsCollection elements = $$(By.cssSelector(css));
            if (!elements.isEmpty()) {
                SelenideElement elem = elements.get(0);
                elem.click();
            }
        } catch (Exception e) {
        }
    }
}
