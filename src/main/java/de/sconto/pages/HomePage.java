package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


/**
 * HomePage
 * Class implements the HomePage methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomePage {

    /* Properties */

    public static String basicURL = PropertiesLoader.loadProperty("url");

    /* Elements */

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    private static By banner = By.cssSelector(".consentForm__title");
    private static By loginIcon = By.cssSelector(".headerElement--login");
    private static By carouselImg = By.cssSelector(".carouselImage");

    private static By headerMenuCategory = By.xpath("//li[2]/span/a/span/span");

    private static By productsCategoryListButton = By.xpath("//li[2]/span[2]/span[2]/a/span/span/button");

    private static By productsCategory = By.xpath("//a[contains(.,'Kaffeemaschinen')]");


    public void acceptCookies() {
        $(acceptBtn).click();
        $(banner).shouldNot(Condition.exist);
    }

    public LoginPage clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }

    public void hoverLoginIcon() {
        $(loginIcon).hover();
    }

    public SelenideElement carousel() {
        return $(carouselImg);
    }

    public void getProductCategoryList() {
        $(headerMenuCategory).click();
    }

    public ProductsPage selectProductCategory() {
        $(productsCategory).click();
        return Selenide.page(ProductsPage.class);
    }

    public SelenideElement productsCategoryList() {
        return $(productsCategoryListButton);
    }
}
