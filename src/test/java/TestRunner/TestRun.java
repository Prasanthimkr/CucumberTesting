package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
( features=".//Features/Login.feature",
  glue="StepDefinitions",
  dryRun=false,
  monochrome=true,
  plugin= {"pretty","html:test-output.html"}	)


public class TestRun {

}
