package com.guru99.test.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registerAccount.feature",
        glue = "com.guru99.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags =  "@secondTest")
public class RegisterAccountRunner {
}
