package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Frameright_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "")
	public static WebElement WebTabelPONumber;

public void verify_WebTabelPONumber(String data){
		Assert.assertEquals(WebTabelPONumber,WebTabelPONumber);
}

@FindBy(how= How.ID, using = "eleTaxExemptID")
	public static WebElement eleTaxExemptID;

public void verify_eleTaxExemptID_Status(String data){
		//Verifies the Status of the eleTaxExemptID
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTaxExemptID.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTaxExemptID.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTaxExemptID.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTaxExemptID.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTaxExemptID(){
		eleTaxExemptID.click();
}

@FindBy(how= How.ID, using = "eleShippingMethodDetailspage")
	public static WebElement eleShippingMethodDetailspage;

public void verify_eleShippingMethodDetailspage_Status(String data){
		//Verifies the Status of the eleShippingMethodDetailspage
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingMethodDetailspage.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingMethodDetailspage.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingMethodDetailspage.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingMethodDetailspage.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingMethodDetailspage(){
		eleShippingMethodDetailspage.click();
}

@FindBy(how= How.ID, using = "eleShippingAddressDetailspage")
	public static WebElement eleShippingAddressDetailspage;

public void verify_eleShippingAddressDetailspage_Status(String data){
		//Verifies the Status of the eleShippingAddressDetailspage
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAddressDetailspage.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAddressDetailspage.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAddressDetailspage.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAddressDetailspage.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAddressDetailspage(){
		eleShippingAddressDetailspage.click();
}

@FindBy(how= How.ID, using = "elePayments")
	public static WebElement elePayments;

public void verify_elePayments_Status(String data){
		//Verifies the Status of the elePayments
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(elePayments.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(elePayments.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!elePayments.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!elePayments.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_elePayments(){
		elePayments.click();
}

@FindBy(how= How.ID, using = "elePaymentAccount")
	public static WebElement elePaymentAccount;

public void verify_elePaymentAccount_Status(String data){
		//Verifies the Status of the elePaymentAccount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(elePaymentAccount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(elePaymentAccount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!elePaymentAccount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!elePaymentAccount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_elePaymentAccount(){
		elePaymentAccount.click();
}

@FindBy(how= How.ID, using = "eleDetails")
	public static WebElement eleDetails;

public void verify_eleDetails_Status(String data){
		//Verifies the Status of the eleDetails
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleDetails.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleDetails.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleDetails.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleDetails.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleDetails(){
		eleDetails.click();
}

@FindBy(how= How.ID, using = "eleDeliveryModeDetailspage")
	public static WebElement eleDeliveryModeDetailspage;

public void verify_eleDeliveryModeDetailspage_Status(String data){
		//Verifies the Status of the eleDeliveryModeDetailspage
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleDeliveryModeDetailspage.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleDeliveryModeDetailspage.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleDeliveryModeDetailspage.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleDeliveryModeDetailspage.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleDeliveryModeDetailspage(){
		eleDeliveryModeDetailspage.click();
}

@FindBy(how= How.ID, using = "eleCardType")
	public static WebElement eleCardType;

public void verify_eleCardType_Status(String data){
		//Verifies the Status of the eleCardType
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleCardType.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleCardType.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleCardType.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleCardType.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleCardType(){
		eleCardType.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}