package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)

    @CucumberOptions( // below are three types of report we use in cucumber. The last one (rerun.txt) is the best one
            plugin = {"html:target/cucumber-report.html",
                      "json:target/cucumber.json",
                      "rerun:target/rerun.txt"
                    //for rerun file type we need to create another runner class to run it
            },
            features = "src/test/resources/features", //we pass the path of the feature.file here
            glue = "com/cybertek/step_definitions", //we pass the path of the step_definition folder here
            dryRun = false,

            //we only want to run  student and admin only
            //tags = "@login" // this runs all feature file

           // tags = "@login and not @librarian"
            //OR tags = "not @librarian"

          // tags = "@employee and @sunday and not @librarian"


            tags = "@SmokeTest"


    )


public class CukesRunner {

}


