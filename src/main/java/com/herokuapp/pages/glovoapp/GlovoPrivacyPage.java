package com.herokuapp.pages.glovoapp;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class GlovoPrivacyPage {

    public static By confirmationPrivacyPageText = By.xpath("//h1");

    public static By privacyCheckbox = By.xpath("//div[2]/label/span/span");

    public static By privacySubmitBtn = By.cssSelector(".privacy__submit-btn");

    public SelenideElement onPrivacyPage() {
        return (SelenideElement) confirmationPrivacyPageText;
    }
}
