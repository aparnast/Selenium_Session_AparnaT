package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features={"classpath:FeatureFiles\\OpenUrl.feature","classpath:FeatureFiles\\CloseBrowser.feature"},glue="com.test",plugin={"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})

public class TestRunnerC {

}
