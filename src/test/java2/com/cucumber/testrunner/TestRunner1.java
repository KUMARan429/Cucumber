package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java2\\src\\test\\features\\Adactin.feature",glue="com.cucumber.Stepdefinition",
		dryRun=false,strict=true,monochrome=true
		)

public class TestRunner1  {

}
