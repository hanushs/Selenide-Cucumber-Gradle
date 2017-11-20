package steps;

import cucumber.api.java.en.And;
import manager.StepBase;

/**
 * Created by pshynin on 11/15/2017.
 */
public class AnalysisReportActions extends StepBase {

    @And("^select (.*) Data Source$")
    public void selectDataSources(String dataSource) {
        app.getAnalysisReportPage().selectDataSource(dataSource);
    }

    @And("^add field (.*) to the (.*)$")
    public void addFieldToRow(String selected, String column) {
    }
}
