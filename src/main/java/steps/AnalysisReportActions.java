package steps;

import cucumber.api.java.en.And;
import utills.TestBase;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportActions extends TestBase {

    @And("^add field (.*) to the (.*)$")
    public void addReportField(String from, String to) {
        app.getAnalysisReportPage().addField(from, to);
    }
}
