package org.example.runners;


import courgette.api.*;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 1,
        runLevel = CourgetteRunLevel.SCENARIO,
        testOutput = CourgetteTestOutput.CONSOLE,
        reportTargetDir = "target",
        reportTitle = "DHL MyGTS Automation Report",
        plugin = { CourgettePlugin.EXTENT_REPORTS },
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/",
                glue = "org/example/stepdefinitions",
                tags = "@google",
                plugin = {
                        "pretty",
                        "json:target/cucumber-report/cucumber.json",
                        "html:target/cucumber-report/cucumber.html",
                        "junit:target/cucumber-report/cucumber.xml"}
        )
)
public class TestRunner {
}
