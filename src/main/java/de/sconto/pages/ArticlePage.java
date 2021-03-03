package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ArticlePage {

    private static By article = By.cssSelector(".articleTabs__tabLabel--active");

    private static By addToCartButton = By.cssSelector(".button__label--addToCart");

    private static By cartEmptyStatus = By.xpath("//span[@class=\"headerElement__icon headerElement__icon--cart headerElement__icon--cartEmpty\"]");

    private static By cartFiledStatus = By.xpath("//span[@class=\"headerElement__status headerElement__status--cart\"]");


    public void addProductToCart() {
        $(addToCartButton).click();
    }


    public SelenideElement article() {
        return $(article);
    }

    public SelenideElement cartEmpty() {
        return $(cartEmptyStatus);
    }

    public SelenideElement articleInTheCart() {
        return $(cartFiledStatus);
    }
}
