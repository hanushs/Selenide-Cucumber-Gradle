package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by pshynin on 11/10/2017.
 */
public class LoginPage {

    public HomePage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return page(HomePage.class);
    }

    public HomePage login() {
        $(By.id("j_username")).val("Admin");
        $(By.id("j_password")).val("password");
        $(byText("PUC_Login_StepDefinitions")).click();
        $(".error-msg").waitUntil(disappears, 2000);
        return page(HomePage.class);
    }
}