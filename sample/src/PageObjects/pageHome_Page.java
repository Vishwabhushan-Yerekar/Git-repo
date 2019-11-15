package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageHome_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "MYLOCATION")
	public static WebElement MYLOCATION;

public void verify_MYLOCATION_Status(String data){
		//Verifies the Status of the MYLOCATION
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(MYLOCATION.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(MYLOCATION.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!MYLOCATION.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!MYLOCATION.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_MYLOCATION(){
		MYLOCATION.click();
}

@FindBy(how= How.XPATH, using = "//div[@id='user-panel']//i[@class='hd-icon icon-chevron-down']")
	public static WebElement eleMyAccountDropDown;

public void verify_eleMyAccountDropDown_Status(String data){
		//Verifies the Status of the eleMyAccountDropDown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleMyAccountDropDown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleMyAccountDropDown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleMyAccountDropDown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleMyAccountDropDown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleMyAccountDropDown(){
		eleMyAccountDropDown.click();
}

@FindBy(how= How.XPATH, using = "//div[@id='user-panel']//i[@class='hd-icon icon-chevron-down']")
	public static WebElement eleMy_Account;

public void verify_eleMy_Account_Status(String data){
		//Verifies the Status of the eleMy_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleMy_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleMy_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleMy_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleMy_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleMy_Account(){
		eleMy_Account.click();
}

@FindBy(how= How.ID, using = "eleHomePageHeader")
	public static WebElement eleHomePageHeader;

public void verify_eleHomePageHeader_Status(String data){
		//Verifies the Status of the eleHomePageHeader
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleHomePageHeader.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleHomePageHeader.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleHomePageHeader.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleHomePageHeader.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleHomePageHeader(){
		eleHomePageHeader.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=\"search\"]/div[1]/input")
	public static WebElement editHomepageSearch;

public void verify_editHomepageSearch(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(editHomepageSearch.getAttribute("value"),data);
	}

}

public void verify_editHomepageSearch_Status(String data){
		//Verifies the Status of the editHomepageSearch
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editHomepageSearch.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editHomepageSearch.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editHomepageSearch.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editHomepageSearch.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_editHomepageSearch(String data){
		editHomepageSearch.clear();
		editHomepageSearch.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id=\"search\"]/div[1]/button/i")
	public static WebElement Submit;

public void verify_Submit_Status(String data){
		//Verifies the Status of the Submit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Submit(){
		Submit.click();
}

@FindBy(how= How.ID, using = "lnkMy_Profile")
	public static WebElement lnkMy_Profile;

public void verify_lnkMy_Profile_Status(String data){
		//Verifies the Status of the lnkMy_Profile
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkMy_Profile.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkMy_Profile.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkMy_Profile.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkMy_Profile.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkMy_Profile(){
		lnkMy_Profile.click();
}

@FindBy(how= How.XPATH, using = "//a[@class='button button--login header-dropdown__button']")
	public static WebElement lnkLoginNow;

public void verify_lnkLoginNow_Status(String data){
		//Verifies the Status of the lnkLoginNow
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkLoginNow.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkLoginNow.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkLoginNow.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkLoginNow.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkLoginNow(){
		lnkLoginNow.click();
}

@FindBy(how= How.ID, using = "lnkGetanAccount")
	public static WebElement lnkGetanAccount;

public void verify_lnkGetanAccount_Status(String data){
		//Verifies the Status of the lnkGetanAccount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkGetanAccount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkGetanAccount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkGetanAccount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkGetanAccount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkGetanAccount(){
		lnkGetanAccount.click();
}

@FindBy(how= How.ID, using = "lnkBRANDS")
	public static WebElement lnkBRANDS;

public void verify_lnkBRANDS_Status(String data){
		//Verifies the Status of the lnkBRANDS
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkBRANDS.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkBRANDS.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkBRANDS.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkBRANDS.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkBRANDS(){
		lnkBRANDS.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}