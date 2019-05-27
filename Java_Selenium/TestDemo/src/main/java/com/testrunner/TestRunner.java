package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="classpath:MyTest\\MyTest.feature",glue="com.stepdefination",plugin={"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})
public class TestRunner {

}
