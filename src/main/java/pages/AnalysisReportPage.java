package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportPage {
    public ElementsCollection dataSourcesList() {
        return $$(By.id("datasources"));
    }

    public SelenideElement selectDataSourceOkButton() {
        return $(By.id("btnNext"));
    }

    public SelenideElement selectDataSourceCancelButton() {
        return $(By.id("btnCancel"));
    }

    public AnalysisReportPage() {
    }

    public void selectDataSource(String dataSource) {
        for (SelenideElement element : dataSourcesList()) {
            element.find(dataSource).scrollTo().doubleClick();
        }
    }
}
