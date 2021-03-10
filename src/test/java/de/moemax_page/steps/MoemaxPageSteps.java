package de.moemax_page.steps;

import de.moemax.pages.MoemaxPage;
import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static de.moemax.pages.MoemaxPage.*;
import static de.sconto.pages.HomePage.basicURL;

public class MoemaxPageSteps implements En {

    MoemaxPage moemaxPage;

    public MoemaxPageSteps() {
        Given("I open MoemaxPage page", () -> {
            moemaxPage = open(basicURL, MoemaxPage.class);
            $(acceptCookies()).click();
        });

        When("I search for the {} color", (String color) -> {
            $(colorFilter()).click();
            $(selectColor(color)).click();
        });

        Then("I see the filter {} is applied", (String color) -> {
            $(colorFilterIsAdded()).shouldHave(text(color));
        });
    }
}
