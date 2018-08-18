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
public class LogIn_Page {

	static WebElement element= null;
	static WebDriver driver;
	static By EmailAddress;
	static By Password;
	static By SubmitBtn;

	public static void InitiateLocators(Properties prop){

		EmailAddress= By.id(prop.getProperty("EmailAddress"));
		Password= By.id(prop.getProperty("Password"));
		SubmitBtn= By.id(prop.getProperty("SubmitBtn"));

	}


	public static WebElement EmailAddress(WebDriver driver){

		element= driver.findElement(EmailAddress);

		Log.info("User name text box found.");

		return element;

	}

	public static WebElement Password(WebDriver driver){

		element= driver.findElement(Password);

		Log.info("Password text box found.");

		return element;

	}

	public static WebElement btn_Submit(){

		element= driver.findElement(SubmitBtn);

		Log.info("Submit button found.");

		return element;

	}
}
