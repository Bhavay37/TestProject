package Page_Objects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import Utility.Log;

/**
 * @author bhavay.pant
 *
 */
public class Home_Page {
	
	public static WebElement element= null;
	public static WebDriver driver;
	static By SignInLink;
	static By SignOutLink;
	
	public static void InitiateLocators(Properties prop){
		
		SignInLink= By.className(prop.getProperty("SignInLink"));
		
		SignOutLink= By.className(prop.getProperty("SignOutLink"));
	}
	
	public static WebElement SignInLink(WebDriver driver){
		
		element= driver.findElement(SignInLink);
		
		Log.info("SignIn Element found.");
		
		return element;
	
	}
	
	public static WebElement SignOutLink(WebDriver driver){
		
		element= driver.findElement(SignOutLink);
		
		Log.info("SignOut Element found.");
		
		return element;
	
	}
	
	

}
