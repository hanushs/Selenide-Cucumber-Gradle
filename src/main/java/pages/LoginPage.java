package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

/*    public LoginPage login() {
        $(By.id("j_username")).val("");
    }*/
}