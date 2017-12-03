package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by pshynin on 12/3/2017.
 */
public class DataSourcePage {
    private SelenideElement dataSource(String source) {
        return $(By.cssSelector("#datasources>option[title*=" + source + "]"));
    }

    private SelenideElement selectDataSourceOkButton() {
        return $(By.id("btnNext"));
    }

    private SelenideElement selectDataSourceCancelButton() {
        return $(By.id("btnCancel"));
    }

    private SelenideElement frame() {
        return $(By.xpath("//iframe[@class='gwt-Frame'][@name='frame_0']"));
    }

    public AnalysisReportPage selectDataSource(String name) {
        switchTo().defaultContent();
        switchTo().frame(frame());
        dataSource(name).doubleClick();
        return new AnalysisReportPage();
    }

}
