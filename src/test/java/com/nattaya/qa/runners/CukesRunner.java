package com.nattaya.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        glue = "com/nattaya/qa/steps_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags ="@wip",
        publish = true
)
public class CukesRunner {
}
