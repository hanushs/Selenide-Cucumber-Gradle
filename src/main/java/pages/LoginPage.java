package pages;

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
    public SelenideElement userNameField() {
        return $(By.id("j_username"));
    }

    public SelenideElement passwordField() {
        return $(By.id("j_password"));
    }

    public SelenideElement loginButton() {
        return $(By.xpath("//button[contains(., 'Login')]"));
    }

    public LoginPage() {
    }

    public HomePage login(String username, String password) {
        userNameField().val(username);
        passwordField().val(password);
        loginButton().click();
        return new HomePage();
    }
}