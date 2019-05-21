package com.aparna.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "D:\\Java_Workspace\\CucumberTutorial\\Login\\LoginTest.feature",glue="com.aparna.cucumber",plugin={"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})
public class TestRunner {

}
