package com.herokuapp.pages.glovoapp;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class UserPage {

    public static By logOutDropdown = By.cssSelector(".dropdown_button");

    public SelenideElement onUserPage() {
        return (SelenideElement) logOutDropdown;
    }
}
