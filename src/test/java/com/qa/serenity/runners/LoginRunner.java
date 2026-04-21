package com.qa.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@orders",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.qa.serenity.stepDefinitions"
)
public class LoginRunner {
}

