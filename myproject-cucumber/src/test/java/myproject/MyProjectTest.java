
package myproject;

import base.BaseScenario;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

// Default:
//@Cucumber.Options(tags={"@focus"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
//@Cucumber.Options(tags={"@now"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})

@CucumberOptions( 
		   format = {"pretty", "html:target/cucumber-html reports"},
		   tags= {"@TestAmazon"})
public class MyProjectTest {

  @AfterClass 
  public static void tearDownClass() {
    // Close web driver
    BaseScenario.quitDriver();
  }
}
