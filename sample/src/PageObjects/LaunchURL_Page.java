package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class LaunchURL_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "__")
	public static WebElement __;

public void verify___(String data){
		Assert.assertEquals(__,__);
}

public void verify____Status(String data){
		//Verifies the Status of the __
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(__.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(__.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!__.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!__.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "URL")
	public static WebElement URL;

public void verify_URL(String data){
		Assert.assertEquals(URL,URL);
}

public void enter_URL(String data){
		driver.get(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}