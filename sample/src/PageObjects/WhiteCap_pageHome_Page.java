package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class WhiteCap_pageHome_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "innertext__Remove")
	public static WebElement innertext__Remove;

public void verify_innertext__Remove_Status(String data){
		//Verifies the Status of the innertext__Remove
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(innertext__Remove.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(innertext__Remove.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!innertext__Remove.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!innertext__Remove.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_innertext__Remove(){
		innertext__Remove.click();
}

@FindBy(how= How.ID, using = "url__strLinkURL")
	public static WebElement url__strLinkURL;

public void verify_url__strLinkURL_Status(String data){
		//Verifies the Status of the url__strLinkURL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(url__strLinkURL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(url__strLinkURL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!url__strLinkURL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!url__strLinkURL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_url__strLinkURL(){
		url__strLinkURL.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=?user-panel?]/a/span")
	public static WebElement name__My_Account;

public void verify_name__My_Account_Status(String data){
		//Verifies the Status of the name__My_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__My_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__My_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__My_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__My_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_name__My_Account(){
		name__My_Account.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=?user_account?]/div[1]/a/span")
	public static WebElement name__Login_Now;

public void verify_name__Login_Now_Status(String data){
		//Verifies the Status of the name__Login_Now
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__Login_Now.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__Login_Now.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__Login_Now.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__Login_Now.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_name__Login_Now(){
		name__Login_Now.click();
}

@FindBy(how= How.ID, using = "name__My_Profile")
	public static WebElement name__My_Profile;

public void verify_name__My_Profile_Status(String data){
		//Verifies the Status of the name__My_Profile
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__My_Profile.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__My_Profile.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__My_Profile.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__My_Profile.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_name__My_Profile(){
		name__My_Profile.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}