package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportPage {
    private ElementsCollection dataSourcesList() {
        return $$(By.xpath("//select[@id='datasources']/option[starts-with(text(),'%s')]"));
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
        for (SelenideElement element : dataSourcesList()) {
            if (element.getText().contains(dataSource)) {
                element.scrollTo().doubleClick();
            }
        }
    }
}
