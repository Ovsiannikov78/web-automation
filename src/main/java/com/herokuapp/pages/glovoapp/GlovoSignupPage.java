package com.herokuapp.pages.glovoapp;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.page;

public class GlovoSignupPage extends BasePage {

    public static By cookies = By.id("onetrust-accept-btn-handler");
    public static By nameField = By.name("inner_name");
    public static By emailField = By.name("inner_email");
    public static By passwordField = By.name("inner_password");
    public static By formSubmitBtn = By.xpath("//button[@type='submit']");


    public GlovoSignupPage(WebDriver driver) {
        super(driver);
    }

    public GlovoPrivacyPage moveToPrivacyPage() {
        return page(GlovoPrivacyPage.class);
    }

}
