package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class PageOrderConfirmation_Page extends PageObjectBase{
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

@FindBy(how= How.ID, using = "eleTaxAmnt")
	public static WebElement eleTaxAmnt;

public void verify_eleTaxAmnt_Status(String data){
		//Verifies the Status of the eleTaxAmnt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTaxAmnt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTaxAmnt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTaxAmnt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTaxAmnt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTaxAmnt(){
		eleTaxAmnt.click();
}

@FindBy(how= How.ID, using = "eleSubTotal")
	public static WebElement eleSubTotal;

public void verify_eleSubTotal_Status(String data){
		//Verifies the Status of the eleSubTotal
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleSubTotal.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleSubTotal.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleSubTotal.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleSubTotal.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleSubTotal(){
		eleSubTotal.click();
}

@FindBy(how= How.ID, using = "eleSkuAmnt2")
	public static WebElement eleSkuAmnt2;

public void verify_eleSkuAmnt2_Status(String data){
		//Verifies the Status of the eleSkuAmnt2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleSkuAmnt2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleSkuAmnt2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleSkuAmnt2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleSkuAmnt2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleSkuAmnt2(){
		eleSkuAmnt2.click();
}

@FindBy(how= How.ID, using = "eleSkuAmnt")
	public static WebElement eleSkuAmnt;

public void verify_eleSkuAmnt_Status(String data){
		//Verifies the Status of the eleSkuAmnt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleSkuAmnt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleSkuAmnt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleSkuAmnt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleSkuAmnt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleSkuAmnt(){
		eleSkuAmnt.click();
}

@FindBy(how= How.ID, using = "eleSku2")
	public static WebElement eleSku2;

public void verify_eleSku2_Status(String data){
		//Verifies the Status of the eleSku2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleSku2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleSku2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleSku2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleSku2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleSku2(){
		eleSku2.click();
}

@FindBy(how= How.ID, using = "eleSku")
	public static WebElement eleSku;

public void verify_eleSku_Status(String data){
		//Verifies the Status of the eleSku
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleSku.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleSku.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleSku.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleSku.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleSku(){
		eleSku.click();
}

@FindBy(how= How.ID, using = "eleShippingfee")
	public static WebElement eleShippingfee;

public void verify_eleShippingfee_Status(String data){
		//Verifies the Status of the eleShippingfee
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingfee.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingfee.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingfee.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingfee.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingfee(){
		eleShippingfee.click();
}

@FindBy(how= How.ID, using = "eleShippingAddress")
	public static WebElement eleShippingAddress;

public void verify_eleShippingAddress_Status(String data){
		//Verifies the Status of the eleShippingAddress
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAddress.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAddress.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAddress.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAddress.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAddress(){
		eleShippingAddress.click();
}

@FindBy(how= How.ID, using = "elePoNumber")
	public static WebElement elePoNumber;

public void verify_elePoNumber_Status(String data){
		//Verifies the Status of the elePoNumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(elePoNumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(elePoNumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!elePoNumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!elePoNumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_elePoNumber(){
		elePoNumber.click();
}

@FindBy(how= How.ID, using = "eleOrderTotal")
	public static WebElement eleOrderTotal;

public void verify_eleOrderTotal_Status(String data){
		//Verifies the Status of the eleOrderTotal
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderTotal.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderTotal.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderTotal.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderTotal.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderTotal(){
		eleOrderTotal.click();
}

@FindBy(how= How.ID, using = "eleOrderQuantity2")
	public static WebElement eleOrderQuantity2;

public void verify_eleOrderQuantity2_Status(String data){
		//Verifies the Status of the eleOrderQuantity2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderQuantity2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderQuantity2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderQuantity2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderQuantity2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderQuantity2(){
		eleOrderQuantity2.click();
}

@FindBy(how= How.ID, using = "eleOrderQuantity")
	public static WebElement eleOrderQuantity;

public void verify_eleOrderQuantity_Status(String data){
		//Verifies the Status of the eleOrderQuantity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderQuantity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderQuantity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderQuantity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderQuantity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderQuantity(){
		eleOrderQuantity.click();
}

@FindBy(how= How.ID, using = "eleOrderNumber")
	public static WebElement eleOrderNumber;

public void verify_eleOrderNumber_Status(String data){
		//Verifies the Status of the eleOrderNumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderNumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderNumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderNumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderNumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderNumber(){
		eleOrderNumber.click();
}

@FindBy(how= How.ID, using = "eleOrderDate_")
	public static WebElement eleOrderDate_;

public void verify_eleOrderDate__Status(String data){
		//Verifies the Status of the eleOrderDate_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderDate_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderDate_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderDate_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderDate_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderDate_(){
		eleOrderDate_.click();
}

@FindBy(how= How.ID, using = "eleOrderConfirmation")
	public static WebElement eleOrderConfirmation;

public void verify_eleOrderConfirmation_Status(String data){
		//Verifies the Status of the eleOrderConfirmation
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderConfirmation.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderConfirmation.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderConfirmation.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderConfirmation.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderConfirmation(){
		eleOrderConfirmation.click();
}

@FindBy(how= How.ID, using = "eleDeliveryZip")
	public static WebElement eleDeliveryZip;

public void verify_eleDeliveryZip_Status(String data){
		//Verifies the Status of the eleDeliveryZip
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleDeliveryZip.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleDeliveryZip.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleDeliveryZip.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleDeliveryZip.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleDeliveryZip(){
		eleDeliveryZip.click();
}

@FindBy(how= How.ID, using = "eleBillingAddress")
	public static WebElement eleBillingAddress;

public void verify_eleBillingAddress_Status(String data){
		//Verifies the Status of the eleBillingAddress
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleBillingAddress.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleBillingAddress.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleBillingAddress.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleBillingAddress.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleBillingAddress(){
		eleBillingAddress.click();
}

@FindBy(how= How.ID, using = "lnkMyOrderHistory")
	public static WebElement lnkMyOrderHistory;

public void verify_lnkMyOrderHistory_Status(String data){
		//Verifies the Status of the lnkMyOrderHistory
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkMyOrderHistory.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkMyOrderHistory.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkMyOrderHistory.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkMyOrderHistory.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkMyOrderHistory(){
		lnkMyOrderHistory.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}