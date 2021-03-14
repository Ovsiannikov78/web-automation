package com.herokuapp.steps.glovoapp;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Name;
import com.herokuapp.pages.glovoapp.GlovoPrivacyPage;
import com.herokuapp.pages.glovoapp.GlovoSignupPage;
import com.herokuapp.pages.glovoapp.UserPage;
import com.herokuapp.pages.glovoapp.VerificationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.glovoapp.GlovoPrivacyPage.*;
import static com.herokuapp.pages.glovoapp.GlovoSignupPage.*;
import static com.herokuapp.pages.glovoapp.VerificationPage.*;


public class GlovoSignupPageSteps implements En {
    Faker faker = new Faker();
    GlovoSignupPage signupPage;
    GlovoPrivacyPage privacyPage;
    VerificationPage verificationPage;
    UserPage userPage;

    public GlovoSignupPageSteps() {

        When("I accept cookies", () -> {
            $(cookies).click();
        });

        When("I enter user credentials:", (DataTable table) -> {
            // convert data table to List of maps
            List<Map<String, String>> credentials = table.asMaps();

            // get the credential values by the keys
            String name = credentials.get(0).get("name");
            String email = credentials.get(0).get("email");
            String password = credentials.get(0).get("password");

            /*Name name = faker.name();
            String email = faker.internet().emailAddress();
            String password = faker.internet().password();*/

            // input credentials
            $(nameField).setValue(String.valueOf(name));
            $(emailField).setValue(email);
            $(passwordField).setValue(password);
        });

        When("I click on Submit button", () -> {
            $(formSubmitBtn).click();
        });

        Then("I move to the Glovo Privacy page", () -> {
            $((WebElement) signupPage.moveToPrivacyPage());
        });

        And("I see Glovo Privacy page", () -> {
            $(privacyPage.onPrivacyPage()).shouldHave(text("Privacy"));
        });

        When("I accept the Terms and Conditions", () -> {
            $(privacyCheckbox).click();
        });

        And("I click Continue button", () -> {
            $(privacySubmitBtn).click();
        });

        Then("I see Verification page", () -> {
            $(verificationPage.onVerificationPage()).shouldHave(text("Hi" + $(nameField) + ",\nlet’s make your account secure"));
        });

        When("I click on Verify button", () -> {
            $(verifyBtn).click();
        });

        Then("I see User successfully logged in", () -> {
            $(userPage.onUserPage()).shouldHave((Condition) $(nameField));
        });
    }
}
