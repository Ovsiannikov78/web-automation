package de.moemax_page.steps;

import de.moemax.pages.MoemaxPage;
import io.cucumber.java8.En;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static de.moemax.pages.MoemaxPage.*;


public class MoemaxPageSteps implements En {

    MoemaxPage moemaxPage;

    public MoemaxPageSteps() {
        Given("I open MoemaxPage page", () -> {
            moemaxPage = open(moemaxBasicURL, MoemaxPage.class);
            $(acceptCookies()).click();
        });

        When("I select the filter {}", (String filter) -> {
            $(selectFilter(filter)).click();
        });

        Then("I apply {} value", (String value) -> {
            $(selectFilterValue(value)).click();
        });

        Then("I see the value with number {} and value {} is applied", (String filter_number, String value) -> {
            $(filterIsAdded(filter_number)).shouldHave(text(value));
        });
    }
}
