package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags="",
       // @dashboard or @driver"
        plugin="html:target/cucumber-html-report"
        //tags="@sales_manager and @driver" if have both tags
)
public class CucumberRunner {


}
