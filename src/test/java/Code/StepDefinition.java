package Code;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;


public class StepDefinition {
	
	public WebDriver driver;
  @Given("user opens login portal")
  public void given() throws Throwable {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
  }

  @When("user enters username as {string}")
  public void when(String username) throws Throwable {
	  driver.findElement(By.name("userName")).sendKeys(username);
  }

  @And("user enters password as {string}")
  public void and(String password) throws Throwable {
	  driver.findElement(By.name("password")).sendKeys(password);
  }

  @And("clicks on sign on button")
  public void and1() throws Throwable {
	  driver.findElement(By.name("login")).click();
  }

  @Then("validate success login")
  public void then() throws Throwable {
	  System.out.println("Successfull login");
  }
  @And("quit the application")
  public void and2() throws Throwable {
	  driver.quit();
  }

 
  

}
