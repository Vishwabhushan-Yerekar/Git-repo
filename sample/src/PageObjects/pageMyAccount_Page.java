package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageMyAccount_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "lstAccountReview")
	public static WebElement lstAccountReview;

public void verify_lstAccountReview(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(lstAccountReview.getAttribute("value"),data);
	}

}

public void verify_lstAccountReview_Status(String data){
		//Verifies the Status of the lstAccountReview
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lstAccountReview.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lstAccountReview.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lstAccountReview.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lstAccountReview.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_lstAccountReview(String data){
		Select dropdown= new Select(lstAccountReview);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "eleYouhaveNoAccounts")
	public static WebElement eleYouhaveNoAccounts;

public void verify_eleYouhaveNoAccounts_Status(String data){
		//Verifies the Status of the eleYouhaveNoAccounts
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleYouhaveNoAccounts.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleYouhaveNoAccounts.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleYouhaveNoAccounts.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleYouhaveNoAccounts.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleYouhaveNoAccounts(){
		eleYouhaveNoAccounts.click();
}

@FindBy(how= How.ID, using = "eleTotalAmountOrderDetails")
	public static WebElement eleTotalAmountOrderDetails;

public void verify_eleTotalAmountOrderDetails_Status(String data){
		//Verifies the Status of the eleTotalAmountOrderDetails
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTotalAmountOrderDetails.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTotalAmountOrderDetails.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTotalAmountOrderDetails.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTotalAmountOrderDetails.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTotalAmountOrderDetails(){
		eleTotalAmountOrderDetails.click();
}

@FindBy(how= How.ID, using = "eleTitleProjectList")
	public static WebElement eleTitleProjectList;

public void verify_eleTitleProjectList_Status(String data){
		//Verifies the Status of the eleTitleProjectList
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTitleProjectList.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTitleProjectList.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTitleProjectList.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTitleProjectList.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTitleProjectList(){
		eleTitleProjectList.click();
}

@FindBy(how= How.ID, using = "eleTitleProfile")
	public static WebElement eleTitleProfile;

public void verify_eleTitleProfile_Status(String data){
		//Verifies the Status of the eleTitleProfile
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTitleProfile.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTitleProfile.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTitleProfile.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTitleProfile.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTitleProfile(){
		eleTitleProfile.click();
}

@FindBy(how= How.ID, using = "eleTitleOrderHistory")
	public static WebElement eleTitleOrderHistory;

public void verify_eleTitleOrderHistory_Status(String data){
		//Verifies the Status of the eleTitleOrderHistory
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTitleOrderHistory.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTitleOrderHistory.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTitleOrderHistory.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTitleOrderHistory.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTitleOrderHistory(){
		eleTitleOrderHistory.click();
}

@FindBy(how= How.ID, using = "eleTitleAccountReview")
	public static WebElement eleTitleAccountReview;

public void verify_eleTitleAccountReview_Status(String data){
		//Verifies the Status of the eleTitleAccountReview
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleTitleAccountReview.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleTitleAccountReview.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleTitleAccountReview.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleTitleAccountReview.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleTitleAccountReview(){
		eleTitleAccountReview.click();
}

@FindBy(how= How.ID, using = "eleQtyOrderDetails")
	public static WebElement eleQtyOrderDetails;

public void verify_eleQtyOrderDetails_Status(String data){
		//Verifies the Status of the eleQtyOrderDetails
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleQtyOrderDetails.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleQtyOrderDetails.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleQtyOrderDetails.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleQtyOrderDetails.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleQtyOrderDetails(){
		eleQtyOrderDetails.click();
}

@FindBy(how= How.ID, using = "eleprojectListCount")
	public static WebElement eleprojectListCount;

public void verify_eleprojectListCount_Status(String data){
		//Verifies the Status of the eleprojectListCount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleprojectListCount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleprojectListCount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleprojectListCount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleprojectListCount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleprojectListCount(){
		eleprojectListCount.click();
}

@FindBy(how= How.ID, using = "elePONumberOrderDetails")
	public static WebElement elePONumberOrderDetails;

public void verify_elePONumberOrderDetails_Status(String data){
		//Verifies the Status of the elePONumberOrderDetails
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(elePONumberOrderDetails.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(elePONumberOrderDetails.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!elePONumberOrderDetails.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!elePONumberOrderDetails.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_elePONumberOrderDetails(){
		elePONumberOrderDetails.click();
}

@FindBy(how= How.ID, using = "btnAddToCart")
	public static WebElement btnAddToCart;

public void verify_btnAddToCart_Status(String data){
		//Verifies the Status of the btnAddToCart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(btnAddToCart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(btnAddToCart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!btnAddToCart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!btnAddToCart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_btnAddToCart(){
		btnAddToCart.click();
}

@FindBy(how= How.ID, using = "lnkHomeAccountReview")
	public static WebElement lnkHomeAccountReview;

public void verify_lnkHomeAccountReview_Status(String data){
		//Verifies the Status of the lnkHomeAccountReview
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkHomeAccountReview.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkHomeAccountReview.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkHomeAccountReview.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkHomeAccountReview.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkHomeAccountReview(){
		lnkHomeAccountReview.click();
}

@FindBy(how= How.ID, using = "lnkAccountReview")
	public static WebElement lnkAccountReview;

public void verify_lnkAccountReview_Status(String data){
		//Verifies the Status of the lnkAccountReview
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(lnkAccountReview.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(lnkAccountReview.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!lnkAccountReview.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!lnkAccountReview.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_lnkAccountReview(){
		lnkAccountReview.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}