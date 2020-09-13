package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions( // below are three types of report we use in cucumber. The last one (rerun.txt) is the best one

        features = "@target/rerun.txt", //we pass the path of the feature.file here
        glue = "com/cybertek/step_definitions" //we pass the path of the step_definition folder here
)

public class FailsTestRunner {

}
