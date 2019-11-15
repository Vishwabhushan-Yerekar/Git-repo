package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class PageCart_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "eleZipcodeCart")
	public static WebElement eleZipcodeCart;

public void verify_eleZipcodeCart_Status(String data){
		//Verifies the Status of the eleZipcodeCart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleZipcodeCart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleZipcodeCart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleZipcodeCart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleZipcodeCart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleZipcodeCart(){
		eleZipcodeCart.click();
}

@FindBy(how= How.ID, using = "eleShoppingCart")
	public static WebElement eleShoppingCart;

public void verify_eleShoppingCart_Status(String data){
		//Verifies the Status of the eleShoppingCart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShoppingCart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShoppingCart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShoppingCart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShoppingCart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShoppingCart(){
		eleShoppingCart.click();
}

@FindBy(how= How.ID, using = "eleLocationDropDown")
	public static WebElement eleLocationDropDown;

public void verify_eleLocationDropDown_Status(String data){
		//Verifies the Status of the eleLocationDropDown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleLocationDropDown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleLocationDropDown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleLocationDropDown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleLocationDropDown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleLocationDropDown(){
		eleLocationDropDown.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='cart-page']/div[3]/div[2]/div[1]/div[1]/div/a/span")
	public static WebElement LnkCheckoutCartpage;

public void verify_LnkCheckoutCartpage_Status(String data){
		//Verifies the Status of the LnkCheckoutCartpage
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkCheckoutCartpage.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkCheckoutCartpage.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkCheckoutCartpage.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkCheckoutCartpage.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkCheckoutCartpage(){
		LnkCheckoutCartpage.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}