package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageSearchProductResults_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "eleSkuNumber")
	public static WebElement eleSkuNumber;

public void verify_eleSkuNumber_Status(String data){
		//Verifies the Status of the eleSkuNumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleSkuNumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleSkuNumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleSkuNumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleSkuNumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleSkuNumber(){
		eleSkuNumber.click();
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

@FindBy(how= How.XPATH, using = "//*[@id='product_listing']/div[2]/section/div[2]/div/div[1]/form/div/h3/a")
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

@FindBy(how= How.XPATH, using = "//*[@id='product_listing']/div[2]/aside/section[3]/div/ul/li[3]/label/span[1]")
	public static WebElement elePriceFilter;

public void verify_elePriceFilter_Status(String data){
		//Verifies the Status of the elePriceFilter
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(elePriceFilter.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(elePriceFilter.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!elePriceFilter.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!elePriceFilter.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_elePriceFilter(){
		elePriceFilter.click();
}

@FindBy(how= How.ID, using = "eleBrandFilter")
	public static WebElement eleBrandFilter;

public void verify_eleBrandFilter_Status(String data){
		//Verifies the Status of the eleBrandFilter
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(eleBrandFilter.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(eleBrandFilter.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!eleBrandFilter.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!eleBrandFilter.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_eleBrandFilter(){
		eleBrandFilter.click();
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

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}