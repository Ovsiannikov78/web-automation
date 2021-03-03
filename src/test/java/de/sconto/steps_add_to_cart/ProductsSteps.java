package de.sconto.steps_add_to_cart;

import com.codeborne.selenide.Condition;
import de.sconto.pages.HomePage;
import de.sconto.pages.ProductsPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.page;

public class ProductsSteps implements En {

    HomePage homePage;
    ProductsPage productsPage;

    public ProductsSteps() {

        When("I click on the Products Category from Products Category List", () -> {
            homePage = page(HomePage.class);
            productsPage = homePage.selectProductCategory();
        });

        Then("I see Products Page", () -> {
            productsPage.productsPageHeader().should(Condition.exist);
            productsPage.productsPageHeader().shouldHave(text("KAFFEEMASCHINEN"));
        });
    }
}
