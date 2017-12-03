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

    @BeforeClass
    public static void init() {
        addListener(new Highlighter());

        ResourceBundle rb = ResourceBundle.getBundle("local");
        Enumeration<String> keys = rb.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.setProperty(key, (Strings.isNullOrEmpty(System.getProperty(key)) ? value : System.getProperty(key)));
        }
    }
}
