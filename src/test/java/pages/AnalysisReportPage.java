package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideTargetLocator;
import org.openqa.selenium.By;

import java.text.CollationElementIterator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportPage {

    private SelenideElement frame() {
        return $(By.xpath("//iframe[@class='gwt-Frame'][@name='frame_0']"));
    }

    private SelenideElement dataSource(String source) {
        return $(By.cssSelector("#datasources>option[title*=" + source + "]"));
    }

    private SelenideElement selectDataSourceOkButton() {
        return $(By.id("btnNext"));
    }

    private SelenideElement selectDataSourceCancelButton() {
        return $(By.id("btnCancel"));
    }

    private SelenideElement reportTreeElement(String name) {
        return $(By.cssSelector("[id*='dojoUnique'][title='" + name + "']"));
    }

    private SelenideElement reportLayout(String type) {
        return $(By.cssSelector("#caption-text>gemPlaceholder.dojoDndSource.dojoDndTarget.dojoDndContainerOver>span"));
    }

    public AnalysisReportPage() {
    }

    public void selectDataSource(String name) {
        switchTo().defaultContent();
        switchTo().frame(frame());
        dataSource(name).doubleClick();
    }

    public void addField(String from, String to) {
        switchTo().defaultContent();
        switchTo().frame(frame());
     //   reportTreeElement(from).dragAndDropTo(reportLayout(to));

     //  Selenide.switchTo().activeElement().findElement().clear();
      // Selenide.switchTo().
    }
}
