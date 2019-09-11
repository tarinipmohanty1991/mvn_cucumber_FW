/**
 @author Pritish
 */
package myproject.homepage;

import base.BaseScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class GoogleSearchScenario extends BaseScenario {

  @When("^I search \"(.*?)\"$")
  public void i_search(String keyword) throws Throwable {
  
    // Find the text input element by its name
    WebElement element = driver.findElement(By.name("q"));

    // Enter something to search for keyword (From your feature file)
    element.sendKeys(keyword);

    // Now submit the form. WebDriver will find the form for us from the element
    element.submit();

    // Wait for 1 sec
    Thread.sleep(secondsToWait);

  }

  @Then("^The page title should contains \"(.*?)\"$")
  public void the_page_title_should_contains(String keyword) throws Throwable {

    //System.out.println("Page title is: " + driver.getTitle());
    assertTrue(driver.getTitle().contains(keyword));

    // close browser cookie / session
//    closeDriver();
  }

  @Then("^The User searches for product contains \"(.*?)\"$")
  public void the_user_searches_for_product_contains(String category) throws Throwable {

    //System.out.println("Page title is: " + driver.getTitle());
	  WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
    element.sendKeys(category);
    element.submit();
    Thread.sleep(secondsToWait);
    closeDriver();
  }

}
