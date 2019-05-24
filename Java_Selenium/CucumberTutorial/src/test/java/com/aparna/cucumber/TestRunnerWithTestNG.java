package com.aparna.cucumber;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= "D:\\GitBashSelenium\\Java_Selenium\\CucumberTutorial\\Login\\LoginTest.feature",glue="com.aparna.cucumber",plugin={"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})


public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests  {

}
