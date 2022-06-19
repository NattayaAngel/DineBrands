package com.nattaya.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "src/test/java/com/nattaya/qa/steps_definitions/Navigation_Steps.java",
        features = "@target/rerun.txt"
)

public class FailedTestRunner {
}
