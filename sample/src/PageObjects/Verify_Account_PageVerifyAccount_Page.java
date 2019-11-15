package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Verify_Account_PageVerifyAccount_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[@id='logonIdentifier']")
	public static WebElement name__Username_or_email_address;

public void verify_name__Username_or_email_address(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(name__Username_or_email_address.getAttribute("value"),data);
	}

}

public void verify_name__Username_or_email_address_Status(String data){
		//Verifies the Status of the name__Username_or_email_address
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__Username_or_email_address.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__Username_or_email_address.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__Username_or_email_address.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__Username_or_email_address.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_name__Username_or_email_address(String data){
		name__Username_or_email_address.clear();
		name__Username_or_email_address.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='password']")
	public static WebElement name__Password;

public void verify_name__Password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(name__Password.getAttribute("value"),data);
	}

}

public void verify_name__Password_Status(String data){
		//Verifies the Status of the name__Password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__Password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__Password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__Password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__Password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_name__Password(String data){
		name__Password.clear();
		name__Password.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='next']")
	public static WebElement name__Sign_in;

public void verify_name__Sign_in_Status(String data){
		//Verifies the Status of the name__Sign_in
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__Sign_in.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__Sign_in.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__Sign_in.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__Sign_in.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_name__Sign_in(){
		name__Sign_in.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}