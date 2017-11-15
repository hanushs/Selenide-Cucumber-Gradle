package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by pshynin on 11/10/2017.
 */
public class LoginPage {

    public HomePage login() {
        $(By.id("j_username")).val("Admin");
        $(By.id("j_password")).val("password").pressEnter();
        return page(HomePage.class);
    }
}