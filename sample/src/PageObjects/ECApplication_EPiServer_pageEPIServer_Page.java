package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ECApplication_EPiServer_pageEPIServer_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "ctl03_MyListView_MainListView_ctl12_0_HyperLink1_0")
	public static WebElement text__PONumber;

public void verify_text__PONumber_Status(String data){
		//Verifies the Status of the text__PONumber
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(text__PONumber.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(text__PONumber.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!text__PONumber.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!text__PONumber.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_text__PONumber(){
		text__PONumber.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}