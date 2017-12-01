package steps;

import cucumber.api.java.en.And;
import utills.TestBase;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportActions extends TestBase {

    @And("^select (.*) Data Source$")
    public void selectDataSources(String dataSource) {
        app.getAnalysisReportPage().selectDataSource(dataSource);
    }

    @And("^add field (.*) to the (.*)$")
    public void addReportField(String from, String to) {
        app.getAnalysisReportPage().addField(from, to);
    }
}
