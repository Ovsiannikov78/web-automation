package de.sconto.steps_add_to_cart;

import com.codeborne.selenide.Condition;
import de.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static de.sconto.pages.HomePage.basicURL;

public class HomePageSteps implements En {
    HomePage homePage;

    public HomePageSteps() {

        Given("I am on the Homepage", () -> {
            homePage = open(basicURL, HomePage.class);
            homePage.acceptCookies();
        });

        Then("I should see Homepage", () -> {
            homePage.carousel().should(exist);
        });

        When("I click on the Küchen menu field", () -> {
            homePage.getProductCategoryList();
        });

        Then("I see Products Category List", () -> {
            homePage.productsCategoryList().should(Condition.exist);
            homePage.productsCategoryList().shouldHave(text("Alles für Ihre Küche"));
        });
    }
}

