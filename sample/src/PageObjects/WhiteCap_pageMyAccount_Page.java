package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class WhiteCap_pageMyAccount_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "innertext____")
	public static WebElement innertext____;

public void verify_innertext_____Status(String data){
		//Verifies the Status of the innertext____
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(innertext____.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(innertext____.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!innertext____.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!innertext____.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_innertext____(){
		innertext____.click();
}

@FindBy(how= How.ID, using = "name__Account_Review")
	public static WebElement name__Account_Review;

public void verify_name__Account_Review_Status(String data){
		//Verifies the Status of the name__Account_Review
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(name__Account_Review.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(name__Account_Review.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!name__Account_Review.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!name__Account_Review.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_name__Account_Review(){
		name__Account_Review.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}