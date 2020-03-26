package com.cucumber.TestRunner;

import org.junit.runner.RunWith;

import com.cucumber.Utility.Utility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features =	"src\\test\\resources\\com\\cucumber\\features\\", glue = "com.cucumber.StepDefinition",
	dryRun=false,monochrome=true,strict=true
		)



public class TestRunner {

}
