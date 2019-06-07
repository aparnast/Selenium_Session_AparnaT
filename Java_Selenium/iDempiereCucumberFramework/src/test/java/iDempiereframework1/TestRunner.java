package iDempiereframework1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features={"D:\\GitBashSelenium\\Java_Selenium\\iDempiereCucumberFramework\\Feature\\LogIn_Test.feature"},glue="iDempiereCucumberFramework",plugin={"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})
//@CucumberOptions(features="classpath:FeatureFiles\\OpenUrl.feature",tags = {"~@RegressionTest"},glue="com.test",plugin={"html:target/test-report","junit:target/junit-xml-report.xml","json:target/json-report.json"})

public class TestRunner {
	

}
