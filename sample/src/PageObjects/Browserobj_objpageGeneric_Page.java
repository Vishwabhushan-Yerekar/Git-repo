package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Browserobj_objpageGeneric_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "url___strProductLink")
	public static WebElement url___strProductLink;

public void verify_url___strProductLink_Status(String data){
		//Verifies the Status of the url___strProductLink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(url___strProductLink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(url___strProductLink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!url___strProductLink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!url___strProductLink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_url___strProductLink(){
		url___strProductLink.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}