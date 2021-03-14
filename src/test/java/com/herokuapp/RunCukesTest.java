package com.herokuapp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        /*glue = "com.herokuapp",*/
        glue = "com.glovoapp.business",
        strict = true,
        /*tags= "@login"*/
        tags = "@glovologin"
)
public class RunCukesTest {
}
