package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class pageBrands_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "logo_wacker_neuson_jpg_Image")
	public static WebElement logo_wacker_neuson_jpg_Image;

public void verify_logo_wacker_neuson_jpg_Image_Status(String data){
		//Verifies the Status of the logo_wacker_neuson_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_wacker_neuson_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_wacker_neuson_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_wacker_neuson_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_wacker_neuson_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_wacker_neuson_jpg_Image(){
		logo_wacker_neuson_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Westcoat_jpg_Image")
	public static WebElement logo_Westcoat_jpg_Image;

public void verify_logo_Westcoat_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Westcoat_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Westcoat_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Westcoat_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Westcoat_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Westcoat_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Westcoat_jpg_Image(){
		logo_Westcoat_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Westchester_jpg_Image")
	public static WebElement logo_Westchester_jpg_Image;

public void verify_logo_Westchester_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Westchester_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Westchester_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Westchester_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Westchester_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Westchester_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Westchester_jpg_Image(){
		logo_Westchester_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_werner_jpg_Image")
	public static WebElement logo_werner_jpg_Image;

public void verify_logo_werner_jpg_Image_Status(String data){
		//Verifies the Status of the logo_werner_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_werner_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_werner_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_werner_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_werner_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_werner_jpg_Image(){
		logo_werner_jpg_Image.click();
}

@FindBy(how= How.ID, using = "LOGO_weatherguarD_jpg_Image")
	public static WebElement LOGO_weatherguarD_jpg_Image;

public void verify_LOGO_weatherguarD_jpg_Image_Status(String data){
		//Verifies the Status of the LOGO_weatherguarD_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LOGO_weatherguarD_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LOGO_weatherguarD_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LOGO_weatherguarD_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LOGO_weatherguarD_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LOGO_weatherguarD_jpg_Image(){
		LOGO_weatherguarD_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_uasait_jpg_Image")
	public static WebElement logo_uasait_jpg_Image;

public void verify_logo_uasait_jpg_Image_Status(String data){
		//Verifies the Status of the logo_uasait_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_uasait_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_uasait_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_uasait_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_uasait_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_uasait_jpg_Image(){
		logo_uasait_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_TenCate_Mirafi_jpg_Image")
	public static WebElement logo_TenCate_Mirafi_jpg_Image;

public void verify_logo_TenCate_Mirafi_jpg_Image_Status(String data){
		//Verifies the Status of the logo_TenCate_Mirafi_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_TenCate_Mirafi_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_TenCate_Mirafi_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_TenCate_Mirafi_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_TenCate_Mirafi_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_TenCate_Mirafi_jpg_Image(){
		logo_TenCate_Mirafi_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_SurfaceShields_jpg_Image")
	public static WebElement logo_SurfaceShields_jpg_Image;

public void verify_logo_SurfaceShields_jpg_Image_Status(String data){
		//Verifies the Status of the logo_SurfaceShields_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_SurfaceShields_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_SurfaceShields_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_SurfaceShields_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_SurfaceShields_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_SurfaceShields_jpg_Image(){
		logo_SurfaceShields_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_stabila_jpg_Image")
	public static WebElement logo_stabila_jpg_Image;

public void verify_logo_stabila_jpg_Image_Status(String data){
		//Verifies the Status of the logo_stabila_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_stabila_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_stabila_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_stabila_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_stabila_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_stabila_jpg_Image(){
		logo_stabila_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Sqwincher_jpg_Image")
	public static WebElement logo_Sqwincher_jpg_Image;

public void verify_logo_Sqwincher_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Sqwincher_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Sqwincher_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Sqwincher_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Sqwincher_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Sqwincher_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Sqwincher_jpg_Image(){
		logo_Sqwincher_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Spectra_jpg_Image")
	public static WebElement logo_Spectra_jpg_Image;

public void verify_logo_Spectra_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Spectra_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Spectra_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Spectra_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Spectra_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Spectra_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Spectra_jpg_Image(){
		logo_Spectra_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_SpecChem_jpg_Image")
	public static WebElement logo_SpecChem_jpg_Image;

public void verify_logo_SpecChem_jpg_Image_Status(String data){
		//Verifies the Status of the logo_SpecChem_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_SpecChem_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_SpecChem_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_SpecChem_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_SpecChem_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_SpecChem_jpg_Image(){
		logo_SpecChem_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Skil_jpg_Image")
	public static WebElement logo_Skil_jpg_Image;

public void verify_logo_Skil_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Skil_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Skil_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Skil_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Skil_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Skil_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Skil_jpg_Image(){
		logo_Skil_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Simpson_jpg_Image")
	public static WebElement logo_Simpson_jpg_Image;

public void verify_logo_Simpson_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Simpson_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Simpson_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Simpson_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Simpson_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Simpson_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Simpson_jpg_Image(){
		logo_Simpson_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Sika_jpg_Image")
	public static WebElement logo_Sika_jpg_Image;

public void verify_logo_Sika_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Sika_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Sika_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Sika_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Sika_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Sika_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Sika_jpg_Image(){
		logo_Sika_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_scofield_jpg_Image")
	public static WebElement logo_scofield_jpg_Image;

public void verify_logo_scofield_jpg_Image_Status(String data){
		//Verifies the Status of the logo_scofield_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_scofield_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_scofield_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_scofield_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_scofield_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_scofield_jpg_Image(){
		logo_scofield_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_ridgid_jpg_Image")
	public static WebElement logo_ridgid_jpg_Image;

public void verify_logo_ridgid_jpg_Image_Status(String data){
		//Verifies the Status of the logo_ridgid_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_ridgid_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_ridgid_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_ridgid_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_ridgid_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_ridgid_jpg_Image(){
		logo_ridgid_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Quikrete_jpg_Image")
	public static WebElement logo_Quikrete_jpg_Image;

public void verify_logo_Quikrete_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Quikrete_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Quikrete_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Quikrete_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Quikrete_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Quikrete_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Quikrete_jpg_Image(){
		logo_Quikrete_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Powers_jpg_Image")
	public static WebElement logo_Powers_jpg_Image;

public void verify_logo_Powers_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Powers_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Powers_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Powers_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Powers_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Powers_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Powers_jpg_Image(){
		logo_Powers_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_PLS_jpg_Image")
	public static WebElement logo_PLS_jpg_Image;

public void verify_logo_PLS_jpg_Image_Status(String data){
		//Verifies the Status of the logo_PLS_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_PLS_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_PLS_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_PLS_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_PLS_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_PLS_jpg_Image(){
		logo_PLS_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Multiquip_jpg_Image")
	public static WebElement logo_Multiquip_jpg_Image;

public void verify_logo_Multiquip_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Multiquip_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Multiquip_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Multiquip_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Multiquip_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Multiquip_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Multiquip_jpg_Image(){
		logo_Multiquip_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_motorola_jpg_Image")
	public static WebElement logo_motorola_jpg_Image;

public void verify_logo_motorola_jpg_Image_Status(String data){
		//Verifies the Status of the logo_motorola_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_motorola_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_motorola_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_motorola_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_motorola_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_motorola_jpg_Image(){
		logo_motorola_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Moldex_jpg_Image")
	public static WebElement logo_Moldex_jpg_Image;

public void verify_logo_Moldex_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Moldex_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Moldex_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Moldex_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Moldex_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Moldex_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Moldex_jpg_Image(){
		logo_Moldex_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_MLKishigo_jpg_Image")
	public static WebElement logo_MLKishigo_jpg_Image;

public void verify_logo_MLKishigo_jpg_Image_Status(String data){
		//Verifies the Status of the logo_MLKishigo_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_MLKishigo_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_MLKishigo_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_MLKishigo_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_MLKishigo_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_MLKishigo_jpg_Image(){
		logo_MLKishigo_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_mitm_jpg_Image")
	public static WebElement logo_mitm_jpg_Image;

public void verify_logo_mitm_jpg_Image_Status(String data){
		//Verifies the Status of the logo_mitm_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_mitm_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_mitm_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_mitm_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_mitm_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_mitm_jpg_Image(){
		logo_mitm_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Milwaukee_jpg_Image")
	public static WebElement logo_Milwaukee_jpg_Image;

public void verify_logo_Milwaukee_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Milwaukee_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Milwaukee_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Milwaukee_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Milwaukee_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Milwaukee_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Milwaukee_jpg_Image(){
		logo_Milwaukee_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Max_jpg_Image")
	public static WebElement logo_Max_jpg_Image;

public void verify_logo_Max_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Max_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Max_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Max_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Max_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Max_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Max_jpg_Image(){
		logo_Max_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Marshalltown_jpg_Image")
	public static WebElement logo_Marshalltown_jpg_Image;

public void verify_logo_Marshalltown_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Marshalltown_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Marshalltown_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Marshalltown_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Marshalltown_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Marshalltown_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Marshalltown_jpg_Image(){
		logo_Marshalltown_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Makita_jpg_Image")
	public static WebElement logo_Makita_jpg_Image;

public void verify_logo_Makita_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Makita_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Makita_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Makita_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Makita_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Makita_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Makita_jpg_Image(){
		logo_Makita_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Lift_All_jpg_Image")
	public static WebElement logo_Lift_All_jpg_Image;

public void verify_logo_Lift_All_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Lift_All_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Lift_All_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Lift_All_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Lift_All_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Lift_All_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Lift_All_jpg_Image(){
		logo_Lift_All_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Kraft_jpg_Image")
	public static WebElement logo_Kraft_jpg_Image;

public void verify_logo_Kraft_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Kraft_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Kraft_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Kraft_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Kraft_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Kraft_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Kraft_jpg_Image(){
		logo_Kraft_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_knaack_jpg_Image")
	public static WebElement logo_knaack_jpg_Image;

public void verify_logo_knaack_jpg_Image_Status(String data){
		//Verifies the Status of the logo_knaack_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_knaack_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_knaack_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_knaack_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_knaack_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_knaack_jpg_Image(){
		logo_knaack_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_kleintools_jpg_Image")
	public static WebElement logo_kleintools_jpg_Image;

public void verify_logo_kleintools_jpg_Image_Status(String data){
		//Verifies the Status of the logo_kleintools_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_kleintools_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_kleintools_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_kleintools_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_kleintools_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_kleintools_jpg_Image(){
		logo_kleintools_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Irwin_jpg_Image")
	public static WebElement logo_Irwin_jpg_Image;

public void verify_logo_Irwin_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Irwin_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Irwin_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Irwin_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Irwin_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Irwin_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Irwin_jpg_Image(){
		logo_Irwin_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Husqvarna_jpg_Image")
	public static WebElement logo_Husqvarna_jpg_Image;

public void verify_logo_Husqvarna_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Husqvarna_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Husqvarna_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Husqvarna_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Husqvarna_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Husqvarna_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Husqvarna_jpg_Image(){
		logo_Husqvarna_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Honda_jpg_Image")
	public static WebElement logo_Honda_jpg_Image;

public void verify_logo_Honda_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Honda_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Honda_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Honda_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Honda_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Honda_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Honda_jpg_Image(){
		logo_Honda_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Hitachi_jpg_Image")
	public static WebElement logo_Hitachi_jpg_Image;

public void verify_logo_Hitachi_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Hitachi_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Hitachi_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Hitachi_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Hitachi_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Hitachi_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Hitachi_jpg_Image(){
		logo_Hitachi_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Guardian_jpg_Image")
	public static WebElement logo_Guardian_jpg_Image;

public void verify_logo_Guardian_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Guardian_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Guardian_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Guardian_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Guardian_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Guardian_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Guardian_jpg_Image(){
		logo_Guardian_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Glasenseal_jpg_Image")
	public static WebElement logo_Glasenseal_jpg_Image;

public void verify_logo_Glasenseal_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Glasenseal_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Glasenseal_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Glasenseal_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Glasenseal_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Glasenseal_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Glasenseal_jpg_Image(){
		logo_Glasenseal_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Ergodyne_jpg_Image")
	public static WebElement logo_Ergodyne_jpg_Image;

public void verify_logo_Ergodyne_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Ergodyne_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Ergodyne_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Ergodyne_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Ergodyne_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Ergodyne_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Ergodyne_jpg_Image(){
		logo_Ergodyne_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_dixon_jpg_Image")
	public static WebElement logo_dixon_jpg_Image;

public void verify_logo_dixon_jpg_Image_Status(String data){
		//Verifies the Status of the logo_dixon_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_dixon_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_dixon_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_dixon_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_dixon_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_dixon_jpg_Image(){
		logo_dixon_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_diablo_jpg_Image")
	public static WebElement logo_diablo_jpg_Image;

public void verify_logo_diablo_jpg_Image_Status(String data){
		//Verifies the Status of the logo_diablo_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_diablo_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_diablo_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_diablo_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_diablo_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_diablo_jpg_Image(){
		logo_diablo_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_DeWalt_jpg_Image")
	public static WebElement logo_DeWalt_jpg_Image;

public void verify_logo_DeWalt_jpg_Image_Status(String data){
		//Verifies the Status of the logo_DeWalt_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_DeWalt_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_DeWalt_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_DeWalt_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_DeWalt_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_DeWalt_jpg_Image(){
		logo_DeWalt_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_DBI_Sala_jpg_Image")
	public static WebElement logo_DBI_Sala_jpg_Image;

public void verify_logo_DBI_Sala_jpg_Image_Status(String data){
		//Verifies the Status of the logo_DBI_Sala_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_DBI_Sala_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_DBI_Sala_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_DBI_Sala_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_DBI_Sala_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_DBI_Sala_jpg_Image(){
		logo_DBI_Sala_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Dayton_Superior_jpg_Image")
	public static WebElement logo_Dayton_Superior_jpg_Image;

public void verify_logo_Dayton_Superior_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Dayton_Superior_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Dayton_Superior_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Dayton_Superior_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Dayton_Superior_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Dayton_Superior_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Dayton_Superior_jpg_Image(){
		logo_Dayton_Superior_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Bosch_jpg_Image")
	public static WebElement logo_Bosch_jpg_Image;

public void verify_logo_Bosch_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Bosch_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Bosch_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Bosch_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Bosch_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Bosch_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Bosch_jpg_Image(){
		logo_Bosch_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_AtlasEPS_jpg_Image")
	public static WebElement logo_AtlasEPS_jpg_Image;

public void verify_logo_AtlasEPS_jpg_Image_Status(String data){
		//Verifies the Status of the logo_AtlasEPS_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_AtlasEPS_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_AtlasEPS_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_AtlasEPS_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_AtlasEPS_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_AtlasEPS_jpg_Image(){
		logo_AtlasEPS_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_Allen_jpg_Image")
	public static WebElement logo_Allen_jpg_Image;

public void verify_logo_Allen_jpg_Image_Status(String data){
		//Verifies the Status of the logo_Allen_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_Allen_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_Allen_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_Allen_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_Allen_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_Allen_jpg_Image(){
		logo_Allen_jpg_Image.click();
}

@FindBy(how= How.ID, using = "logo_3M_jpg_Image")
	public static WebElement logo_3M_jpg_Image;

public void verify_logo_3M_jpg_Image_Status(String data){
		//Verifies the Status of the logo_3M_jpg_Image
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(logo_3M_jpg_Image.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(logo_3M_jpg_Image.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!logo_3M_jpg_Image.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!logo_3M_jpg_Image.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_logo_3M_jpg_Image(){
		logo_3M_jpg_Image.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}