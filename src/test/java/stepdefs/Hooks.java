package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks{
	
	public static  WebDriver driver;
	
		
	@Before
	public void setUp(Scenario scenario) {
		
	
		String browser= "chrome";
		
		
		if( browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
			
		else if ( browser.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver","./Driver/chromedriver.exe");
			 driver=new FirefoxDriver();
		}
			
		else if (browser.equals("IE")) {
            System.setProperty("webdriver.IEDriverServer.driver", "./Driver/chromedriver.exe");
            driver = new FirefoxDriver();
        }
		
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
	
    
	
	@After
	public void teardown(Scenario scenario) {
		
		if(driver!=null)
			driver.quit();
	}

}



