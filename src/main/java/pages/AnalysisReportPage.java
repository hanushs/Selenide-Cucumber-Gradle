package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportPage {

    private SelenideElement reportTreeElement(String name) {
        return $(By.cssSelector("[id*='dojoUnique'][title='" + name + "']"));
    }

    private SelenideElement reportLayout(String type) {
        return $(By.cssSelector("#caption-text>gemPlaceholder.dojoDndSource.dojoDndTarget.dojoDndContainerOver>span"));
    }

    public AnalysisReportPage() {
    }

    public void addField(String from, String to) {
        switchTo().defaultContent();
        //switchTo().frame(frame());
        //   reportTreeElement(from).dragAndDropTo(reportLayout(to));

        //  Selenide.switchTo().activeElement().findElement().clear();
        // Selenide.switchTo().
    }
}
