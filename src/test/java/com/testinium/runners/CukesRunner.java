package com.testinium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  plugin = {"json:target/cucumber.json",
    "html:target/default-html-reports",
    "rerun:target/rerun.txt"},
  features = "/Users/egeyelken/IdeaProjects/TestiniumBeymen/src",
  glue = "com/testinium/step_definitions",
  dryRun = false,
  tags = "@wip"
)
public class CukesRunner {
}
