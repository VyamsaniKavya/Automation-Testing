package in.amazon.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features=
"E:\\Kavya_workspace\\amazon_Capgemini_Automation\\src\\test\\resources\\feature\\Endtoend.feature",//the path of the feature file
glue= {"in/amazon/step"},//the path of the step definition file
format= {"progress", "json:target/cucumber-reports/CucumberTestReport.json"},//this generates different types of reporting
plugin= {"json:target/cucumber-reports/CucumberTestReport.json"},//Specifies different formatting options for the output report
monochrome=true,//display the console output in a proper readable format
dryRun=false,// to check the mapping is proper between feature file and step definition file
tags= {"@EndtoEnd2"})//Running Scenarios with a Tag

public class Runner extends AbstractTestNGCucumberTests{

}
