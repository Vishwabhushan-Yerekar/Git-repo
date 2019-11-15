package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageCheckout_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[@id='state[Shipping]']")
	public static WebElement listState;

public void verify_listState(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(listState.getAttribute("value"),data);
	}

}

public void verify_listState_Status(String data){
		//Verifies the Status of the listState
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(listState.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(listState.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!listState.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!listState.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_listState(String data){
		Select dropdown= new Select(listState);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "listBillingState")
	public static WebElement listBillingState;

public void verify_listBillingState(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(listBillingState.getAttribute("value"),data);
	}

}

public void verify_listBillingState_Status(String data){
		//Verifies the Status of the listBillingState
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(listBillingState.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(listBillingState.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!listBillingState.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!listBillingState.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_listBillingState(String data){
		Select dropdown= new Select(listBillingState);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "radioPayByAccount")
	public static WebElement radioPayByAccount;

public void verify_radioPayByAccount_Status(String data){
		//Verifies the Status of the radioPayByAccount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(radioPayByAccount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(radioPayByAccount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!radioPayByAccount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!radioPayByAccount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_radioPayByAccount(){
		radioPayByAccount.click();
}

@FindBy(how= How.ID, using = "eleUPSGround2")
	public static WebElement eleUPSGround2;

public void verify_eleUPSGround2_Status(String data){
		//Verifies the Status of the eleUPSGround2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleUPSGround2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleUPSGround2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleUPSGround2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleUPSGround2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleUPSGround2(){
		eleUPSGround2.click();
}

@FindBy(how= How.ID, using = "eleUPSGround")
	public static WebElement eleUPSGround;

public void verify_eleUPSGround_Status(String data){
		//Verifies the Status of the eleUPSGround
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleUPSGround.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleUPSGround.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleUPSGround.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleUPSGround.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleUPSGround(){
		eleUPSGround.click();
}

@FindBy(how= How.ID, using = "eleUPS2Day2")
	public static WebElement eleUPS2Day2;

public void verify_eleUPS2Day2_Status(String data){
		//Verifies the Status of the eleUPS2Day2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleUPS2Day2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleUPS2Day2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleUPS2Day2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleUPS2Day2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleUPS2Day2(){
		eleUPS2Day2.click();
}

@FindBy(how= How.ID, using = "eleUPS2Day")
	public static WebElement eleUPS2Day;

public void verify_eleUPS2Day_Status(String data){
		//Verifies the Status of the eleUPS2Day
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleUPS2Day.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleUPS2Day.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleUPS2Day.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleUPS2Day.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleUPS2Day(){
		eleUPS2Day.click();
}

@FindBy(how= How.ID, using = "eleShippingBilling")
	public static WebElement eleShippingBilling;

public void verify_eleShippingBilling_Status(String data){
		//Verifies the Status of the eleShippingBilling
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingBilling.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingBilling.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingBilling.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingBilling.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingBilling(){
		eleShippingBilling.click();
}

@FindBy(how= How.ID, using = "eleShippingAdressAmericanDream")
	public static WebElement eleShippingAdressAmericanDream;

public void verify_eleShippingAdressAmericanDream_Status(String data){
		//Verifies the Status of the eleShippingAdressAmericanDream
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAdressAmericanDream.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAdressAmericanDream.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAdressAmericanDream.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAdressAmericanDream.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAdressAmericanDream(){
		eleShippingAdressAmericanDream.click();
}

@FindBy(how= How.ID, using = "eleShippingAddressRiverSide")
	public static WebElement eleShippingAddressRiverSide;

public void verify_eleShippingAddressRiverSide_Status(String data){
		//Verifies the Status of the eleShippingAddressRiverSide
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAddressRiverSide.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAddressRiverSide.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAddressRiverSide.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAddressRiverSide.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAddressRiverSide(){
		eleShippingAddressRiverSide.click();
}

@FindBy(how= How.ID, using = "eleShippingAddressLash")
	public static WebElement eleShippingAddressLash;

public void verify_eleShippingAddressLash_Status(String data){
		//Verifies the Status of the eleShippingAddressLash
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAddressLash.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAddressLash.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAddressLash.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAddressLash.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAddressLash(){
		eleShippingAddressLash.click();
}

@FindBy(how= How.ID, using = "eleShippingAddressEastQuarry")
	public static WebElement eleShippingAddressEastQuarry;

public void verify_eleShippingAddressEastQuarry_Status(String data){
		//Verifies the Status of the eleShippingAddressEastQuarry
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAddressEastQuarry.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAddressEastQuarry.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAddressEastQuarry.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAddressEastQuarry.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAddressEastQuarry(){
		eleShippingAddressEastQuarry.click();
}

@FindBy(how= How.ID, using = "eleShippingAddressAulani")
	public static WebElement eleShippingAddressAulani;

public void verify_eleShippingAddressAulani_Status(String data){
		//Verifies the Status of the eleShippingAddressAulani
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleShippingAddressAulani.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleShippingAddressAulani.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleShippingAddressAulani.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleShippingAddressAulani.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleShippingAddressAulani(){
		eleShippingAddressAulani.click();
}

@FindBy(how= How.ID, using = "eleOrderSummaryTab")
	public static WebElement eleOrderSummaryTab;

public void verify_eleOrderSummaryTab_Status(String data){
		//Verifies the Status of the eleOrderSummaryTab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleOrderSummaryTab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleOrderSummaryTab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleOrderSummaryTab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleOrderSummaryTab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleOrderSummaryTab(){
		eleOrderSummaryTab.click();
}

@FindBy(how= How.ID, using = "eleNextDayAir2")
	public static WebElement eleNextDayAir2;

public void verify_eleNextDayAir2_Status(String data){
		//Verifies the Status of the eleNextDayAir2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleNextDayAir2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleNextDayAir2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleNextDayAir2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleNextDayAir2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleNextDayAir2(){
		eleNextDayAir2.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='checkout-page']/div/div[2]/form/div[2]/div[2]/div[2]/div[3]/div/div/label[4]")
	public static WebElement eleNextDayAir;

public void verify_eleNextDayAir_Status(String data){
		//Verifies the Status of the eleNextDayAir
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleNextDayAir.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleNextDayAir.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleNextDayAir.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleNextDayAir.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleNextDayAir(){
		eleNextDayAir.click();
}

@FindBy(how= How.ID, using = "eleMillerRoad")
	public static WebElement eleMillerRoad;

public void verify_eleMillerRoad_Status(String data){
		//Verifies the Status of the eleMillerRoad
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleMillerRoad.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleMillerRoad.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleMillerRoad.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleMillerRoad.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleMillerRoad(){
		eleMillerRoad.click();
}

@FindBy(how= How.ID, using = "eleLittleYork")
	public static WebElement eleLittleYork;

public void verify_eleLittleYork_Status(String data){
		//Verifies the Status of the eleLittleYork
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleLittleYork.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleLittleYork.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleLittleYork.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleLittleYork.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleLittleYork(){
		eleLittleYork.click();
}

@FindBy(how= How.ID, using = "eleBillingAddressSameAsShippingAddress")
	public static WebElement eleBillingAddressSameAsShippingAddress;

public void verify_eleBillingAddressSameAsShippingAddress_Status(String data){
		//Verifies the Status of the eleBillingAddressSameAsShippingAddress
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleBillingAddressSameAsShippingAddress.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleBillingAddressSameAsShippingAddress.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleBillingAddressSameAsShippingAddress.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleBillingAddressSameAsShippingAddress.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleBillingAddressSameAsShippingAddress(){
		eleBillingAddressSameAsShippingAddress.click();
}

@FindBy(how= How.ID, using = "tax-id")
	public static WebElement txtTaxExemptID;

public void verify_txtTaxExemptID(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtTaxExemptID.getAttribute("value"),data);
	}

}

public void verify_txtTaxExemptID_Status(String data){
		//Verifies the Status of the txtTaxExemptID
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtTaxExemptID.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtTaxExemptID.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtTaxExemptID.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtTaxExemptID.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtTaxExemptID(String data){
		txtTaxExemptID.clear();
		txtTaxExemptID.sendKeys(data);
}

@FindBy(how= How.ID, using = "receiver-contact")
	public static WebElement txtReceiverContactName;

public void verify_txtReceiverContactName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtReceiverContactName.getAttribute("value"),data);
	}

}

public void verify_txtReceiverContactName_Status(String data){
		//Verifies the Status of the txtReceiverContactName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtReceiverContactName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtReceiverContactName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtReceiverContactName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtReceiverContactName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtReceiverContactName(String data){
		txtReceiverContactName.clear();
		txtReceiverContactName.sendKeys(data);
}

@FindBy(how= How.ID, using = "po-number")
	public static WebElement txtPONumber;

public void verify_txtPONumber(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtPONumber.getAttribute("value"),data);
	}

}

public void verify_txtPONumber_Status(String data){
		//Verifies the Status of the txtPONumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtPONumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtPONumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtPONumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtPONumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtPONumber(String data){
		txtPONumber.clear();
		txtPONumber.sendKeys(data);
}

@FindBy(how= How.ID, using = "name")
	public static WebElement txtNameonCard;

public void verify_txtNameonCard(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtNameonCard.getAttribute("value"),data);
	}

}

public void verify_txtNameonCard_Status(String data){
		//Verifies the Status of the txtNameonCard
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtNameonCard.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtNameonCard.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtNameonCard.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtNameonCard.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtNameonCard(String data){
		txtNameonCard.clear();
		txtNameonCard.sendKeys(data);
}

@FindBy(how= How.ID, using = "job-code")
	public static WebElement txtjobCode;

public void verify_txtjobCode(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtjobCode.getAttribute("value"),data);
	}

}

public void verify_txtjobCode_Status(String data){
		//Verifies the Status of the txtjobCode
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtjobCode.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtjobCode.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtjobCode.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtjobCode.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtjobCode(String data){
		txtjobCode.clear();
		txtjobCode.sendKeys(data);
}

@FindBy(how= How.ID, using = "exp")
	public static WebElement txtExpiryDate;

public void verify_txtExpiryDate(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtExpiryDate.getAttribute("value"),data);
	}

}

public void verify_txtExpiryDate_Status(String data){
		//Verifies the Status of the txtExpiryDate
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtExpiryDate.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtExpiryDate.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtExpiryDate.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtExpiryDate.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtExpiryDate(String data){
		txtExpiryDate.clear();
		txtExpiryDate.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='card']")
	public static WebElement txtEnterCardNumber;

public void verify_txtEnterCardNumber(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtEnterCardNumber.getAttribute("value"),data);
	}

}

public void verify_txtEnterCardNumber_Status(String data){
		//Verifies the Status of the txtEnterCardNumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtEnterCardNumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtEnterCardNumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtEnterCardNumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtEnterCardNumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtEnterCardNumber(String data){
		txtEnterCardNumber.clear();
		txtEnterCardNumber.sendKeys(data);
}

@FindBy(how= How.ID, using = "cvv-number")
	public static WebElement txtCVV;

public void verify_txtCVV(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCVV.getAttribute("value"),data);
	}

}

public void verify_txtCVV_Status(String data){
		//Verifies the Status of the txtCVV
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCVV.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCVV.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCVV.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCVV.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCVV(String data){
		txtCVV.clear();
		txtCVV.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='zip-code[Shipping]']")
	public static WebElement txtCheckoutZipCode;

public void verify_txtCheckoutZipCode(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutZipCode.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutZipCode_Status(String data){
		//Verifies the Status of the txtCheckoutZipCode
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutZipCode.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutZipCode.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutZipCode.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutZipCode.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutZipCode(String data){
		txtCheckoutZipCode.clear();
		txtCheckoutZipCode.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='phone-number[Shipping]']")
	public static WebElement txtCheckoutphoneNumber;

public void verify_txtCheckoutphoneNumber(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutphoneNumber.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutphoneNumber_Status(String data){
		//Verifies the Status of the txtCheckoutphoneNumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutphoneNumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutphoneNumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutphoneNumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutphoneNumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutphoneNumber(String data){
		txtCheckoutphoneNumber.clear();
		txtCheckoutphoneNumber.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='last-name[Shipping]']")
	public static WebElement txtCheckoutLastName;

public void verify_txtCheckoutLastName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutLastName.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutLastName_Status(String data){
		//Verifies the Status of the txtCheckoutLastName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutLastName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutLastName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutLastName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutLastName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutLastName(String data){
		txtCheckoutLastName.clear();
		txtCheckoutLastName.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='first-name[Shipping]']")
	public static WebElement txtCheckoutFirstName;

public void verify_txtCheckoutFirstName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutFirstName.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutFirstName_Status(String data){
		//Verifies the Status of the txtCheckoutFirstName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutFirstName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutFirstName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutFirstName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutFirstName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutFirstName(String data){
		txtCheckoutFirstName.clear();
		txtCheckoutFirstName.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='email-address']")
	public static WebElement txtCheckoutEmailAddress;

public void verify_txtCheckoutEmailAddress(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutEmailAddress.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutEmailAddress_Status(String data){
		//Verifies the Status of the txtCheckoutEmailAddress
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutEmailAddress.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutEmailAddress.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutEmailAddress.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutEmailAddress.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutEmailAddress(String data){
		txtCheckoutEmailAddress.clear();
		txtCheckoutEmailAddress.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='address-city[Shipping]']")
	public static WebElement txtCheckoutCity;

public void verify_txtCheckoutCity(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutCity.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutCity_Status(String data){
		//Verifies the Status of the txtCheckoutCity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutCity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutCity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutCity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutCity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutCity(String data){
		txtCheckoutCity.clear();
		txtCheckoutCity.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='street-address[Shipping]']")
	public static WebElement txtCheckoutAddressLine;

public void verify_txtCheckoutAddressLine(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtCheckoutAddressLine.getAttribute("value"),data);
	}

}

public void verify_txtCheckoutAddressLine_Status(String data){
		//Verifies the Status of the txtCheckoutAddressLine
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtCheckoutAddressLine.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtCheckoutAddressLine.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtCheckoutAddressLine.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtCheckoutAddressLine.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtCheckoutAddressLine(String data){
		txtCheckoutAddressLine.clear();
		txtCheckoutAddressLine.sendKeys(data);
}

@FindBy(how= How.ID, using = "zip-code[Shipping]")
	public static WebElement txtBillingzipcode;

public void verify_txtBillingzipcode(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtBillingzipcode.getAttribute("value"),data);
	}

}

public void verify_txtBillingzipcode_Status(String data){
		//Verifies the Status of the txtBillingzipcode
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtBillingzipcode.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtBillingzipcode.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtBillingzipcode.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtBillingzipcode.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtBillingzipcode(String data){
		txtBillingzipcode.clear();
		txtBillingzipcode.sendKeys(data);
}

@FindBy(how= How.ID, using = "phone-number[Shipping]")
	public static WebElement txtBillingphoneNumber;

public void verify_txtBillingphoneNumber(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtBillingphoneNumber.getAttribute("value"),data);
	}

}

public void verify_txtBillingphoneNumber_Status(String data){
		//Verifies the Status of the txtBillingphoneNumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtBillingphoneNumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtBillingphoneNumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtBillingphoneNumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtBillingphoneNumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtBillingphoneNumber(String data){
		txtBillingphoneNumber.clear();
		txtBillingphoneNumber.sendKeys(data);
}

@FindBy(how= How.ID, using = "last-name[Shipping]")
	public static WebElement txtBillingLastName;

public void verify_txtBillingLastName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtBillingLastName.getAttribute("value"),data);
	}

}

public void verify_txtBillingLastName_Status(String data){
		//Verifies the Status of the txtBillingLastName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtBillingLastName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtBillingLastName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtBillingLastName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtBillingLastName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtBillingLastName(String data){
		txtBillingLastName.clear();
		txtBillingLastName.sendKeys(data);
}

@FindBy(how= How.ID, using = "first-name[Shipping]")
	public static WebElement txtBillingFirstName;

public void verify_txtBillingFirstName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtBillingFirstName.getAttribute("value"),data);
	}

}

public void verify_txtBillingFirstName_Status(String data){
		//Verifies the Status of the txtBillingFirstName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtBillingFirstName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtBillingFirstName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtBillingFirstName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtBillingFirstName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtBillingFirstName(String data){
		txtBillingFirstName.clear();
		txtBillingFirstName.sendKeys(data);
}

@FindBy(how= How.ID, using = "address-city[Shipping]")
	public static WebElement txtBillingCity;

public void verify_txtBillingCity(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtBillingCity.getAttribute("value"),data);
	}

}

public void verify_txtBillingCity_Status(String data){
		//Verifies the Status of the txtBillingCity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtBillingCity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtBillingCity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtBillingCity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtBillingCity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtBillingCity(String data){
		txtBillingCity.clear();
		txtBillingCity.sendKeys(data);
}

@FindBy(how= How.ID, using = "txtBillingAddressLine")
	public static WebElement txtBillingAddressLine;

public void verify_txtBillingAddressLine(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtBillingAddressLine.getAttribute("value"),data);
	}

}

public void verify_txtBillingAddressLine_Status(String data){
		//Verifies the Status of the txtBillingAddressLine
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtBillingAddressLine.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtBillingAddressLine.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtBillingAddressLine.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtBillingAddressLine.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtBillingAddressLine(String data){
		txtBillingAddressLine.clear();
		txtBillingAddressLine.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='cvv']")
	public static WebElement cvv_number;

public void verify_cvv_number(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(cvv_number.getAttribute("value"),data);
	}

}

public void verify_cvv_number_Status(String data){
		//Verifies the Status of the cvv_number
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(cvv_number.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(cvv_number.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!cvv_number.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!cvv_number.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_cvv_number(String data){
		cvv_number.clear();
		cvv_number.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='checkout-page']/div/div[1]/div[3]/button/span")
	public static WebElement btnPlaceOrder;

public void verify_btnPlaceOrder_Status(String data){
		//Verifies the Status of the btnPlaceOrder
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnPlaceOrder.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnPlaceOrder.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnPlaceOrder.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnPlaceOrder.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnPlaceOrder(){
		btnPlaceOrder.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='checkout-page']/div/div[2]/div[1]/div/form/div[3]/div/button/span")
	public static WebElement btnContinueAsGuest;

public void verify_btnContinueAsGuest_Status(String data){
		//Verifies the Status of the btnContinueAsGuest
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnContinueAsGuest.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnContinueAsGuest.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnContinueAsGuest.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnContinueAsGuest.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnContinueAsGuest(){
		btnContinueAsGuest.click();
}

@FindBy(how= How.XPATH, using = "//button[@class='button button--blue']")
	public static WebElement btnCheckoutSaveAndContinue;

public void verify_btnCheckoutSaveAndContinue_Status(String data){
		//Verifies the Status of the btnCheckoutSaveAndContinue
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnCheckoutSaveAndContinue.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnCheckoutSaveAndContinue.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnCheckoutSaveAndContinue.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnCheckoutSaveAndContinue.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnCheckoutSaveAndContinue(){
		btnCheckoutSaveAndContinue.click();
}

@FindBy(how= How.ID, using = "lnkNewShippingAddress")
	public static WebElement lnkNewShippingAddress;

public void verify_lnkNewShippingAddress_Status(String data){
		//Verifies the Status of the lnkNewShippingAddress
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkNewShippingAddress.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkNewShippingAddress.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkNewShippingAddress.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkNewShippingAddress.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkNewShippingAddress(){
		lnkNewShippingAddress.click();
}

@FindBy(how= How.ID, using = "lnkChangeBillingAddress")
	public static WebElement lnkChangeBillingAddress;

public void verify_lnkChangeBillingAddress_Status(String data){
		//Verifies the Status of the lnkChangeBillingAddress
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkChangeBillingAddress.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkChangeBillingAddress.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkChangeBillingAddress.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkChangeBillingAddress.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkChangeBillingAddress(){
		lnkChangeBillingAddress.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}