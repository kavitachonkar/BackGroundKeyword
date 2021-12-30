package Parallel;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  "C:\\Users\\kavita.chonkar\\git\\BackgroundKeyword\\src\\test\\resources\\parallel",
glue = {"Parallel"},
monochrome = true,
//plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"}
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
           "timeline:test-output-thread/",}
                                                 

)		


public class testRunner  extends AbstractTestNGCucumberTests {
	
@Override
@DataProvider(parallel = true)	
	 
public Object [] [] scenarios(){
return super.scenarios();	

}
}