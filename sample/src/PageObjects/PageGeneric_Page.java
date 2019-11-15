package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class PageGeneric_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "eleproductTitle")
	public static WebElement eleproductTitle;

public void verify_eleproductTitle_Status(String data){
		//Verifies the Status of the eleproductTitle
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleproductTitle.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleproductTitle.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleproductTitle.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleproductTitle.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleproductTitle(){
		eleproductTitle.click();
}

@FindBy(how= How.ID, using = "eleproductCount")
	public static WebElement eleproductCount;

public void verify_eleproductCount_Status(String data){
		//Verifies the Status of the eleproductCount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleproductCount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleproductCount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleproductCount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleproductCount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleproductCount(){
		eleproductCount.click();
}

@FindBy(how= How.ID, using = "eleproduct_listing")
	public static WebElement eleproduct_listing;

public void verify_eleproduct_listing_Status(String data){
		//Verifies the Status of the eleproduct_listing
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleproduct_listing.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleproduct_listing.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleproduct_listing.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleproduct_listing.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleproduct_listing(){
		eleproduct_listing.click();
}

@FindBy(how= How.XPATH, using = "//span[@class='minicart__cart-count-number']")
	public static WebElement eleminicart;

public void verify_eleminicart_Status(String data){
		//Verifies the Status of the eleminicart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleminicart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleminicart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleminicart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleminicart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleminicart(){
		eleminicart.click();
}

@FindBy(how= How.XPATH, using = "/html/body/div[1]/header/div[1]/div/div[1]/div[2]/a/span")
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

@FindBy(how= How.NAME, using = "searchZipCode")
	public static WebElement txtsearchZipCodeHeader;

public void verify_txtsearchZipCodeHeader(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(txtsearchZipCodeHeader.getAttribute("value"),data);
	}

}

public void verify_txtsearchZipCodeHeader_Status(String data){
		//Verifies the Status of the txtsearchZipCodeHeader
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(txtsearchZipCodeHeader.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(txtsearchZipCodeHeader.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!txtsearchZipCodeHeader.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!txtsearchZipCodeHeader.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_txtsearchZipCodeHeader(String data){
		txtsearchZipCodeHeader.clear();
		txtsearchZipCodeHeader.sendKeys(data);
}

@FindBy(how= How.NAME, using = "query")
	public static WebElement editProductSearch;

public void verify_editProductSearch(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(editProductSearch.getAttribute("value"),data);
	}

}

public void verify_editProductSearch_Status(String data){
		//Verifies the Status of the editProductSearch
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(editProductSearch.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(editProductSearch.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!editProductSearch.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!editProductSearch.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_editProductSearch(String data){
		editProductSearch.clear();
		editProductSearch.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id='user_location']/div/div/div[2]/button/span")
	public static WebElement btnZipcodeHeaderUpdate;

public void verify_btnZipcodeHeaderUpdate_Status(String data){
		//Verifies the Status of the btnZipcodeHeaderUpdate
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnZipcodeHeaderUpdate.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnZipcodeHeaderUpdate.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnZipcodeHeaderUpdate.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnZipcodeHeaderUpdate.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnZipcodeHeaderUpdate(){
		btnZipcodeHeaderUpdate.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='user_location_form']//button[@class='search__submit']")
	public static WebElement btnZipcodeHeaderSearch;

public void verify_btnZipcodeHeaderSearch_Status(String data){
		//Verifies the Status of the btnZipcodeHeaderSearch
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnZipcodeHeaderSearch.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnZipcodeHeaderSearch.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnZipcodeHeaderSearch.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnZipcodeHeaderSearch.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnZipcodeHeaderSearch(){
		btnZipcodeHeaderSearch.click();
}

@FindBy(how= How.ID, using = "btnSubmit")
	public static WebElement btnSubmit;

public void verify_btnSubmit_Status(String data){
		//Verifies the Status of the btnSubmit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnSubmit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnSubmit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnSubmit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnSubmit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnSubmit(){
		btnSubmit.click();
}

@FindBy(how= How.ID, using = "btnPriceRangeGo")
	public static WebElement btnPriceRangeGo;

public void verify_btnPriceRangeGo_Status(String data){
		//Verifies the Status of the btnPriceRangeGo
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnPriceRangeGo.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnPriceRangeGo.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnPriceRangeGo.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnPriceRangeGo.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnPriceRangeGo(){
		btnPriceRangeGo.click();
}

@FindBy(how= How.ID, using = "btnAddtoProjectlist")
	public static WebElement btnAddtoProjectlist;

public void verify_btnAddtoProjectlist_Status(String data){
		//Verifies the Status of the btnAddtoProjectlist
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnAddtoProjectlist.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnAddtoProjectlist.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnAddtoProjectlist.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnAddtoProjectlist.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnAddtoProjectlist(){
		btnAddtoProjectlist.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='product']/div[1]/div[2]/form/div/button/span")
	public static WebElement BtnAddtoCart;

public void verify_BtnAddtoCart_Status(String data){
		//Verifies the Status of the BtnAddtoCart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BtnAddtoCart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BtnAddtoCart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BtnAddtoCart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BtnAddtoCart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_BtnAddtoCart(){
		BtnAddtoCart.click();
}

@FindBy(how= How.ID, using = "lnkMyProjectList")
	public static WebElement lnkMyProjectList;

public void verify_lnkMyProjectList_Status(String data){
		//Verifies the Status of the lnkMyProjectList
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkMyProjectList.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkMyProjectList.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkMyProjectList.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkMyProjectList.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkMyProjectList(){
		lnkMyProjectList.click();
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

@FindBy(how= How.ID, using = "lnkLogout")
	public static WebElement lnkLogout;

public void verify_lnkLogout_Status(String data){
		//Verifies the Status of the lnkLogout
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkLogout.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkLogout.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkLogout.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkLogout.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkLogout(){
		lnkLogout.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")
	public static WebElement LnkIncreaseQuantityPDP;

public void verify_LnkIncreaseQuantityPDP_Status(String data){
		//Verifies the Status of the LnkIncreaseQuantityPDP
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkIncreaseQuantityPDP.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkIncreaseQuantityPDP.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkIncreaseQuantityPDP.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkIncreaseQuantityPDP.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkIncreaseQuantityPDP(){
		LnkIncreaseQuantityPDP.click();
}

@FindBy(how= How.ID, using = "LnkIncreaseQtyMiniCart")
	public static WebElement LnkIncreaseQtyMiniCart;

public void verify_LnkIncreaseQtyMiniCart_Status(String data){
		//Verifies the Status of the LnkIncreaseQtyMiniCart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkIncreaseQtyMiniCart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkIncreaseQtyMiniCart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkIncreaseQtyMiniCart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkIncreaseQtyMiniCart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkIncreaseQtyMiniCart(){
		LnkIncreaseQtyMiniCart.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[1]")
	public static WebElement LnkDecreaseQuantityPDP;

public void verify_LnkDecreaseQuantityPDP_Status(String data){
		//Verifies the Status of the LnkDecreaseQuantityPDP
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkDecreaseQuantityPDP.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkDecreaseQuantityPDP.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkDecreaseQuantityPDP.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkDecreaseQuantityPDP.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkDecreaseQuantityPDP(){
		LnkDecreaseQuantityPDP.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='minicart']/div/div[2]/div[1]/a[1]/span")
	public static WebElement LnkCheckout;

public void verify_LnkCheckout_Status(String data){
		//Verifies the Status of the LnkCheckout
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LnkCheckout.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LnkCheckout.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LnkCheckout.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LnkCheckout.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LnkCheckout(){
		LnkCheckout.click();
}

@FindBy(how= How.XPATH, using = "//*[@id='minicart']/div/div[2]/div[1]/a[2]/span")
	public static WebElement LinkViewCart;

public void verify_LinkViewCart_Status(String data){
		//Verifies the Status of the LinkViewCart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LinkViewCart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LinkViewCart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LinkViewCart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LinkViewCart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LinkViewCart(){
		LinkViewCart.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}