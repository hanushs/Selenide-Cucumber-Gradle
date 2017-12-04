package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

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

    public LoginPage() {
    }

    public HomePage login(String username, String password) {
        userNameField().val(username);
        passwordField().val(password);
        loginButton().click();
        return new HomePage();
    }
}