package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class WhiteCap_PageGeneric_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "class__filter__link")
	public static WebElement class__filter__link;

public void verify_class__filter__link_Status(String data){
		//Verifies the Status of the class__filter__link
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(class__filter__link.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(class__filter__link.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!class__filter__link.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!class__filter__link.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_class__filter__link(){
		class__filter__link.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}