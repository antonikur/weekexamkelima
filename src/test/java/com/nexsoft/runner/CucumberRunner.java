package com.nexsoft.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
				 features = "src/test/resources/CucumberTesting.feature",
				 glue = "com.nexsoft.definition")
public class CucumberRunner extends AbstractTestNGCucumberTests {


	
}
