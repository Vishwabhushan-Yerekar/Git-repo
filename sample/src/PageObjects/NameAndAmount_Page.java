package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class NameAndAmount_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "valid")
	public static WebElement valid;

public void verify_valid(String data){
		Assert.assertEquals(valid,valid);
}

public void enter_valid(String data){
		valid.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}