package com.herokuapp.pages;

import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.WebDriver;

/**
 * BasePage
 * Class implements the base methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class BasePage {

    public static String herokuBasicUrl = PropertiesLoader.loadProperty("herokuUrl");

    public static String moemaxBasicURL = PropertiesLoader.loadProperty("moemaxUrl");
}
