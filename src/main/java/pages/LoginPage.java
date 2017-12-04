package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

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


    public void excample() {
        switchTo().activeElement();
        switchTo().defaultContent();



        $("single_element").isDisplayed();
        $("single_element").scrollTo().waitUntil(enabled, 20000).pressEnter();


        $$("collection_elements").filter(enabled);
        $$("collection_elements").filter(text("Home"));
        $$("collection_elements").filter(visible);




        Configuration.pageLoadStrategy = "eager" ;

        $(By.xpath("locator")).waitUntil(disappears, 4000);
    }
}