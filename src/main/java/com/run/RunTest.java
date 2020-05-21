package com.run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/features/first_cucumber.feature",
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/site/return.txt",
                "json:target/cucumberjson.json"
        },
        tags = {"@Automation"}, //指定要运行的带有该注释的场景
        glue = {"com.steps"}    //steps类对应的路径
)
public class RunTest extends AbstractTestNGCucumberTests{
}
