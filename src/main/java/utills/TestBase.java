package utills;

import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit.TextReport;
import com.google.common.base.Strings;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;

import java.util.Enumeration;
import java.util.ResourceBundle;

import static com.codeborne.selenide.WebDriverRunner.addListener;

/**
 * Created by pshynin on 11/16/2017.
 */
public class TestBase {

    protected static final ApplicationManager app
            = new ApplicationManager();

    @Rule
    public TestRule report = new TextReport();

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();

}
