package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs{
	
	public WebDriver driver;
	
	public StepDefs(){
		this.driver=Hooks.driver;	
		
	}

	@Given("Launch rediffmail login")
	public void launch_rediffmail_login() {
	  System.out.println("Launch rediffmail url");
	 
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		 System.out.println("Enter user name "+username);
		 Assert.assertEquals("ravibabu408@gmail.com",username,"username is not correct");
		 driver.findElement(By.id("login1")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	  
		System.out.println("Enter Password "+password);
		
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("I Click on login button")
	public void i_click_on_login_button() {
	   
		System.out.println("Click on login button");
		driver.findElement(By.name("proceed")).click();
	}

	@Then("I loggged into rediffmail successfully")
	public void i_loggged_into_rediffmail_successfully() {
	   
		System.out.println("logged in successfully");
		System.out.println(driver.getTitle());
		
	}
}
