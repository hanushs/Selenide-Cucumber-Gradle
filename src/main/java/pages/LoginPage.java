package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.When;
import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pshynin on 11/10/2017.
 */
public class LoginPage {
    private SelenideElement userNameField() {
        return $(By.id("j_username"));
    }

    private SelenideElement passwordField() {
        return $(By.id("j_password"));
    }

    private SelenideElement loginButton() {
        return $(By.xpath("//button[contains(., 'Login')]"));
    }

    private SelenideElement home() {
        return $(By.id("mantle-perspective-switcher"));
    }

    public LoginPage() {
    }

    public HomePage login(String username, String password) {
        userNameField().val(username);
        passwordField().val(password);
        loginButton().click();

        home().shouldHave(Condition.text("Home"));
        return new HomePage();
    }
}