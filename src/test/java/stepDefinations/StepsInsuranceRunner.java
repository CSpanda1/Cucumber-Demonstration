package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/Insurance.feature",format = {"pretty", "json:target/cucumber.json"})

public class StepsInsuranceRunner {

}
