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
        plugin = {CourgettePlugin.EXTENT_REPORTS},
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/",
                glue = "org/example/stepdefinitions",
                tags = "@google",
                plugin = {
                        "pretty"}
        )
)
public class TestRunner {
}
