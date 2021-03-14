package com.herokuapp.pages.glovoapp;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class VerificationPage {

    public static By confirmationVerificationPageText = By.xpath("//h4/div");

    public static By verifyBtn = By.xpath("//form/button[2]/span");

    public SelenideElement onVerificationPage() {
        return (SelenideElement) confirmationVerificationPageText;
    }


}
