package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageEPIServer_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "")
	public static WebElement Order_Management;

public void verify_Order_Management(String data){
		Assert.assertEquals(Order_Management,Order_Management);
}

@FindBy(how= How.ID, using = "")
	public static WebElement Customer_Management;

public void verify_Customer_Management(String data){
		Assert.assertEquals(Customer_Management,Customer_Management);
}

@FindBy(how= How.ID, using = "eleWelcome")
	public static WebElement eleWelcome;

public void verify_eleWelcome_Status(String data){
		//Verifies the Status of the eleWelcome
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleWelcome.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleWelcome.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleWelcome.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleWelcome.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleWelcome(){
		eleWelcome.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='ext-gen83']/div/li/ul/li[2]/ul/li[1]/div/a/span")
	public static WebElement eleToday;

public void verify_eleToday_Status(String data){
		//Verifies the Status of the eleToday
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleToday.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleToday.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleToday.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleToday.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleToday(){
		eleToday.click();
}

@FindBy(how= How.ID, using = "lnkSignOut")
	public static WebElement lnkSignOut;

public void verify_lnkSignOut_Status(String data){
		//Verifies the Status of the lnkSignOut
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkSignOut.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkSignOut.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkSignOut.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkSignOut.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkSignOut(){
		lnkSignOut.click();
}

@FindBy(how= How.ID, using = "LnkPurchaseOrders")
	public static WebElement LnkPurchaseOrders;

public void verify_LnkPurchaseOrders_Status(String data){
		//Verifies the Status of the LnkPurchaseOrders
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkPurchaseOrders.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkPurchaseOrders.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkPurchaseOrders.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkPurchaseOrders.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkPurchaseOrders(){
		LnkPurchaseOrders.click();
}

@FindBy(how= How.ID, using = "lnkContacts")
	public static WebElement lnkContacts;

public void verify_lnkContacts_Status(String data){
		//Verifies the Status of the lnkContacts
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkContacts.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkContacts.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkContacts.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkContacts.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkContacts(){
		lnkContacts.click();
}

@FindBy(how= How.XPATH, using = "//td[text()='Order Management']")
	public static WebElement LnkOrderManagement;

public void verify_LnkOrderManagement_Status(String data){
		//Verifies the Status of the LnkOrderManagement
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkOrderManagement.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkOrderManagement.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkOrderManagement.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkOrderManagement.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkOrderManagement(){
		LnkOrderManagement.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='ctl03_xmlStruct']/ul/li[6]")
	public static WebElement TabPayment;

public void verify_TabPayment_Status(String data){
		//Verifies the Status of the TabPayment
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TabPayment.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TabPayment.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TabPayment.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TabPayment.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TabPayment(){
		TabPayment.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}