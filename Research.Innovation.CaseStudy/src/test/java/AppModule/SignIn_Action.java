package AppModule;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Page_Objects.Home_Page;
import Page_Objects.LogIn_Page;
import Utility.Log;

public class SignIn_Action {

	public static void Execute(Properties prop, WebDriver driver) {
		
		Home_Page.InitiateLocators(prop);
		
		LogIn_Page.InitiateLocators(prop);
		
		Home_Page.SignInLink(driver).click();
		
		Log.info("Click action performed on My Account link.");
		
		LogIn_Page.EmailAddress(driver).sendKeys("pandey.ayush@gmail.com");
		
		Log.info("UserName entered in username textbox.");
		
		Assert.assertTrue(LogIn_Page.Password(driver).isDisplayed());
		
		LogIn_Page.Password(driver).sendKeys("Practice@998~");
		
		Log.info("Password entered in password textbox.");
		
		LogIn_Page.btn_Submit().click();
		
		Log.info("Click action performed on submit button");
		
	}
}
