package de.sconto.steps_add_to_cart;

import de.sconto.pages.ArticlePage;
import de.sconto.pages.ProductsPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class ArticleSteps implements En {
    ProductsPage productsPage;
    ArticlePage articlePage;

    public ArticleSteps() {

        When("I click on the Selected Product", () -> {
            productsPage = page(ProductsPage.class);
            articlePage = productsPage.selectProduct();
        });
        Then("I see Article Page", () -> articlePage.article().should(exist));
        And("I see the status of the cart 0", () -> articlePage.cartEmpty().should(exist));

        When("I click on the Add Button", () -> articlePage.addProductToCart());
        Then("I see that status of the cart has changed to 1", () -> {
            articlePage.articleInTheCart().should(exist);
            /*articlePage.articleInTheCart().shouldHave(text("1"));*/
        });

    }
}
