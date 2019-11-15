package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ProductAddedToCart_Page extends PageObjectBase{
	@FindBy(how= How.XPATH, using = "//*[@id='minicart']/div/div[2]/div[1]/a[2]/span")
	public static WebElement added;

public void verify_added(String data){
		Assert.assertEquals(added,added);
}

public void enter_added(String data){
		added.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}