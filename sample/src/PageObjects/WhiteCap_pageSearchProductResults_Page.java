package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class WhiteCap_pageSearchProductResults_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "abs_y___abs_y")
	public static WebElement abs_y___abs_y;

public void verify_abs_y___abs_y(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(abs_y___abs_y.getAttribute("value"),data);
	}

}

public void verify_abs_y___abs_y_Status(String data){
		//Verifies the Status of the abs_y___abs_y
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(abs_y___abs_y.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(abs_y___abs_y.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!abs_y___abs_y.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!abs_y___abs_y.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_abs_y___abs_y(String data){
		if(abs_y___abs_y.isSelected());
			abs_y___abs_y.click();
}

@FindBy(how= How.ID, using = "class__filterid__item_checkmark")
	public static WebElement class__filterid__item_checkmark;

public void verify_class__filterid__item_checkmark(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(class__filterid__item_checkmark.getAttribute("value"),data);
	}

}

public void verify_class__filterid__item_checkmark_Status(String data){
		//Verifies the Status of the class__filterid__item_checkmark
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(class__filterid__item_checkmark.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(class__filterid__item_checkmark.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!class__filterid__item_checkmark.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!class__filterid__item_checkmark.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_class__filterid__item_checkmark(String data){
		if(class__filterid__item_checkmark.isSelected());
			class__filterid__item_checkmark.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}