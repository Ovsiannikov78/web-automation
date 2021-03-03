package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {

    private static By productsPageHeader = By.xpath("//h1");

    private static By selectedProduct = By.xpath("//div[4]/a");


    public ArticlePage selectProduct() {
        $(selectedProduct).click();
        return Selenide.page(ArticlePage.class);
    }

    public SelenideElement productsPageHeader() {
        return $(productsPageHeader);
    }

}
