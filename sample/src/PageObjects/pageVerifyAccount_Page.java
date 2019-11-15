package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageVerifyAccount_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "logonIdentifier")
	public static WebElement editUserName;

public void verify_editUserName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(editUserName.getAttribute("value"),data);
	}

}

public void verify_editUserName_Status(String data){
		//Verifies the Status of the editUserName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editUserName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editUserName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editUserName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editUserName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_editUserName(String data){
		editUserName.clear();
		editUserName.sendKeys(data);
}

@FindBy(how= How.ID, using = "password")
	public static WebElement editPassword;

public void verify_editPassword(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(editPassword.getAttribute("value"),data);
	}

}

public void verify_editPassword_Status(String data){
		//Verifies the Status of the editPassword
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editPassword.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editPassword.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editPassword.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editPassword.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_editPassword(String data){
		editPassword.clear();
		editPassword.sendKeys(data);
}

@FindBy(how= How.ID, using = "next")
	public static WebElement btnSignin;

public void verify_btnSignin_Status(String data){
		//Verifies the Status of the btnSignin
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnSignin.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnSignin.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnSignin.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnSignin.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnSignin(){
		btnSignin.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}