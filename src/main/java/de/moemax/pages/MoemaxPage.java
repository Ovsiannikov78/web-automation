package de.moemax.pages;

import com.herokuapp.pages.BasePage;
import org.openqa.selenium.By;

public class MoemaxPage extends BasePage {


    public static By acceptCookies() {
        return By.xpath("//button[@data-purpose='cookieBar.button.accept']");
    }

    public static By selectFilter(String filter) {
        return By.xpath("//span[contains(text(),'" + filter + "')]");
    }

    public static By selectFilterValue(String value) {
        return By.xpath("//span[contains(text(),'" + value + "')]");
    }

    public static By filterIsAdded(String filter_number) {
        return By.xpath("//li['" + filter_number + "']/div/div/span");
    }
}
