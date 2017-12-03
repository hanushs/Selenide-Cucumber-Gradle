package steps;

import cucumber.api.java.en.And;
import utills.TestBase;

/**
 * Created by pshynin on 12/3/2017.
 */
public class DataSourcePageActions extends TestBase {

    @And("^select (.*) Data Source$")
    public void selectDataSources(String dataSource) {
        // app.getAnalysisReportPage().selectDataSource(dataSource);
    }
}
