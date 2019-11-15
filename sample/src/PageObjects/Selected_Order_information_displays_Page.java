package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Selected_Order_information_displays_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "//*[@id='ctl03_xmlStruct']/ul/li[6]")

	public static WebElement validate;

public void verify_validate(String data){
		Assert.assertEquals(validate,validate);
}

public void enter_validate(String data){
		validate.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}