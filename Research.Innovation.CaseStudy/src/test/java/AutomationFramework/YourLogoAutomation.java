package AutomationFramework;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import AppModule.SignIn_Action;
import Page_Objects.Home_Page;
import Utility.Log;
import Utility.ReadObjectRepo;

public class YourLogoAutomation {
	
	
	public static WebDriver driver= null;
	Properties prop;
	
	@BeforeTest
	public void StartUp()throws Exception{
		
		prop=ReadObjectRepo.getObjectRepository("HomePage");
		
		DOMConfigurator.configure("log4j.xml");
		
		Log.startTestCase("Selenium Test");
		
		String path= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		
		Log.info("New driver instantiated.");
	}
	
	@Test
	public void TestCase1(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		Log.info("Web app is launched.");
		
		Reporter.log("Web app is launched.");
		
		SignIn_Action.Execute(prop,driver);
		
		System.out.println("User is successfully logged in. Time to logout.");
		
		Assert.assertTrue(Home_Page.SignOutLink(driver).isDisplayed());
		
		Home_Page.SignOutLink(driver).click();
		
		Log.info("Click action perfomed on logout button.");
		
		driver.quit();
		
		Log.info("Browser closed.");
		
		Log.endTestCase("Selenium Test");
		
	}

}
