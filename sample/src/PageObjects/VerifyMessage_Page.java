package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class VerifyMessage_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Message")
	public static WebElement Message;

public void verify_Message(String data){
		Assert.assertEquals(Message,Message);
}

public void enter_Message(String data){
		Message.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}