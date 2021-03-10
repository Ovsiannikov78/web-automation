package de.moemax.pages;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.By;

public class MoemaxPage extends BasePage {


    public static By acceptCookies() {
        return By.xpath("//button[@data-purpose='cookieBar.button.accept']");
    }

    public static By selectColor(String color) {
        return By.xpath("//span[contains(text(),'" + color + "')]");
    }

    public static By colorFilter() {
        return By.xpath("//span[contains(text(),'Farbe')]");
    }


    public static By colorFilterIsAdded() {
        return By.xpath("//li/div/div/span");
    }
}
