package testsuite;

import org.testng.annotations.Test;

import PageObjects.*;
import utilities.PageObjectBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.Configurations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

import utilities.TestReport;

import java.io.IOException;

import org.testng.Reporter;

import utilities.DataUtil;

/**
 * Conformiq generated test case EE001
 */
public class EE001 extends PageObjectBase {

	public EE001() {
	}

	private TestReport testReport = new TestReport();

	private StringBuilder overallTestData = new StringBuilder();

	@Test(dataProvider = "TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_2_MYLOCATION_HYPERLINK_Status,
			final String Step_2_eleMyAccountDropDown_HYPERLINK_Status,
			final String Step_2_eleMy_Account_HYPERLINK_Status, final String Step_2_eleHomePageHeader_HYPERLINK_Status,
			final String Step_2_editHomepageSearch_TEXTBOX_Status,
			final String Step_2_editHomepageSearch_TEXTBOX_Verification, final String Step_2_Submit_BUTTON_Status,
			final String Step_2_lnkMy_Profile_HYPERLINK_Status, final String Step_2_lnkLoginNow_HYPERLINK_Status,
			final String Step_2_lnkGetanAccount_HYPERLINK_Status, final String Step_2_lnkBRANDS_HYPERLINK_Status,
			final String Step_3_editHomepageSearch_TEXTBOX, final String Step_5_eleproductTitle_HYPERLINK_Status,
			final String Step_5_eleproductCount_HYPERLINK_Status,
			final String Step_5_eleproduct_listing_HYPERLINK_Status, final String Step_5_eleminicart_HYPERLINK_Status,
			final String Step_5_eleLocationDropDown_HYPERLINK_Status,
			final String Step_5_txtsearchZipCodeHeader_TEXTBOX_Status,
			final String Step_5_txtsearchZipCodeHeader_TEXTBOX_Verification,
			final String Step_5_editProductSearch_TEXTBOX_Status,
			final String Step_5_editProductSearch_TEXTBOX_Verification,
			final String Step_5_btnZipcodeHeaderUpdate_BUTTON_Status,
			final String Step_5_btnZipcodeHeaderSearch_BUTTON_Status, final String Step_5_btnSubmit_BUTTON_Status,
			final String Step_5_btnPriceRangeGo_BUTTON_Status, final String Step_5_btnAddtoProjectlist_BUTTON_Status,
			final String Step_5_BtnAddtoCart_BUTTON_Status, final String Step_5_lnkMyProjectList_HYPERLINK_Status,
			final String Step_5_lnkMyOrderHistory_HYPERLINK_Status, final String Step_5_lnkLogout_HYPERLINK_Status,
			final String Step_5_LnkIncreaseQuantityPDP_HYPERLINK_Status,
			final String Step_5_LnkIncreaseQtyMiniCart_HYPERLINK_Status,
			final String Step_5_LnkDecreaseQuantityPDP_HYPERLINK_Status,
			final String Step_5_LnkCheckout_HYPERLINK_Status, final String Step_5_LinkViewCart_HYPERLINK_Status,
			final String Step_20_added_FIELD, final String Step_23_txtsearchZipCodeHeader_TEXTBOX,
			final String Step_23_editProductSearch_TEXTBOX, final String Step_27_listState_DROPDOWN_Status,
			final String Step_27_listState_DROPDOWN_Verification, final String Step_27_listBillingState_DROPDOWN_Status,
			final String Step_27_listBillingState_DROPDOWN_Verification,
			final String Step_27_radioPayByAccount_HYPERLINK_Status,
			final String Step_27_eleUPSGround2_HYPERLINK_Status, final String Step_27_eleUPSGround_HYPERLINK_Status,
			final String Step_27_eleUPS2Day2_HYPERLINK_Status, final String Step_27_eleUPS2Day_HYPERLINK_Status,
			final String Step_27_eleShippingBilling_HYPERLINK_Status,
			final String Step_27_eleShippingAdressAmericanDream_HYPERLINK_Status,
			final String Step_27_eleShippingAddressRiverSide_HYPERLINK_Status,
			final String Step_27_eleShippingAddressLash_HYPERLINK_Status,
			final String Step_27_eleShippingAddressEastQuarry_HYPERLINK_Status,
			final String Step_27_eleShippingAddressAulani_HYPERLINK_Status,
			final String Step_27_eleOrderSummaryTab_HYPERLINK_Status,
			final String Step_27_eleNextDayAir2_HYPERLINK_Status, final String Step_27_eleNextDayAir_HYPERLINK_Status,
			final String Step_27_eleMillerRoad_HYPERLINK_Status, final String Step_27_eleLittleYork_HYPERLINK_Status,
			final String Step_27_eleBillingAddressSameAsShippingAddress_HYPERLINK_Status,
			final String Step_27_txtTaxExemptID_TEXTBOX_Status,
			final String Step_27_txtTaxExemptID_TEXTBOX_Verification,
			final String Step_27_txtReceiverContactName_TEXTBOX_Status,
			final String Step_27_txtReceiverContactName_TEXTBOX_Verification,
			final String Step_27_txtPONumber_TEXTBOX_Status, final String Step_27_txtPONumber_TEXTBOX_Verification,
			final String Step_27_txtNameonCard_TEXTBOX_Status, final String Step_27_txtNameonCard_TEXTBOX_Verification,
			final String Step_27_txtjobCode_TEXTBOX_Status, final String Step_27_txtjobCode_TEXTBOX_Verification,
			final String Step_27_txtExpiryDate_TEXTBOX_Status, final String Step_27_txtExpiryDate_TEXTBOX_Verification,
			final String Step_27_txtEnterCardNumber_TEXTBOX_Status,
			final String Step_27_txtEnterCardNumber_TEXTBOX_Verification, final String Step_27_txtCVV_TEXTBOX_Status,
			final String Step_27_txtCVV_TEXTBOX_Verification, final String Step_27_txtCheckoutZipCode_TEXTBOX_Status,
			final String Step_27_txtCheckoutZipCode_TEXTBOX_Verification,
			final String Step_27_txtCheckoutphoneNumber_TEXTBOX_Status,
			final String Step_27_txtCheckoutphoneNumber_TEXTBOX_Verification,
			final String Step_27_txtCheckoutLastName_TEXTBOX_Status,
			final String Step_27_txtCheckoutLastName_TEXTBOX_Verification,
			final String Step_27_txtCheckoutFirstName_TEXTBOX_Status,
			final String Step_27_txtCheckoutFirstName_TEXTBOX_Verification,
			final String Step_27_txtCheckoutEmailAddress_TEXTBOX_Status,
			final String Step_27_txtCheckoutEmailAddress_TEXTBOX_Verification,
			final String Step_27_txtCheckoutCity_TEXTBOX_Status,
			final String Step_27_txtCheckoutCity_TEXTBOX_Verification,
			final String Step_27_txtCheckoutAddressLine_TEXTBOX_Status,
			final String Step_27_txtCheckoutAddressLine_TEXTBOX_Verification,
			final String Step_27_txtBillingzipcode_TEXTBOX_Status,
			final String Step_27_txtBillingzipcode_TEXTBOX_Verification,
			final String Step_27_txtBillingphoneNumber_TEXTBOX_Status,
			final String Step_27_txtBillingphoneNumber_TEXTBOX_Verification,
			final String Step_27_txtBillingLastName_TEXTBOX_Status,
			final String Step_27_txtBillingLastName_TEXTBOX_Verification,
			final String Step_27_txtBillingFirstName_TEXTBOX_Status,
			final String Step_27_txtBillingFirstName_TEXTBOX_Verification,
			final String Step_27_txtBillingCity_TEXTBOX_Status,
			final String Step_27_txtBillingCity_TEXTBOX_Verification,
			final String Step_27_txtBillingAddressLine_TEXTBOX_Status,
			final String Step_27_txtBillingAddressLine_TEXTBOX_Verification,
			final String Step_27_cvv_number_TEXTBOX_Status, final String Step_27_cvv_number_TEXTBOX_Verification,
			final String Step_27_btnPlaceOrder_BUTTON_Status, final String Step_27_btnContinueAsGuest_BUTTON_Status,
			final String Step_27_btnCheckoutSaveAndContinue_BUTTON_Status,
			final String Step_27_lnkNewShippingAddress_HYPERLINK_Status,
			final String Step_27_lnkChangeBillingAddress_HYPERLINK_Status, final String Step_28_listState_DROPDOWN,
			final String Step_28_listBillingState_DROPDOWN, final String Step_28_txtTaxExemptID_TEXTBOX,
			final String Step_28_txtReceiverContactName_TEXTBOX, final String Step_28_txtPONumber_TEXTBOX,
			final String Step_28_txtNameonCard_TEXTBOX, final String Step_28_txtjobCode_TEXTBOX,
			final String Step_28_txtExpiryDate_TEXTBOX, final String Step_28_txtEnterCardNumber_TEXTBOX,
			final String Step_28_txtCVV_TEXTBOX, final String Step_28_txtCheckoutZipCode_TEXTBOX,
			final String Step_28_txtCheckoutphoneNumber_TEXTBOX, final String Step_28_txtCheckoutLastName_TEXTBOX,
			final String Step_28_txtCheckoutFirstName_TEXTBOX, final String Step_28_txtCheckoutEmailAddress_TEXTBOX,
			final String Step_28_txtCheckoutCity_TEXTBOX, final String Step_28_txtCheckoutAddressLine_TEXTBOX,
			final String Step_28_txtBillingzipcode_TEXTBOX, final String Step_28_txtBillingphoneNumber_TEXTBOX,
			final String Step_28_txtBillingLastName_TEXTBOX, final String Step_28_txtBillingFirstName_TEXTBOX,
			final String Step_28_txtBillingCity_TEXTBOX, final String Step_28_txtBillingAddressLine_TEXTBOX,
			final String Step_28_cvv_number_TEXTBOX, final String Step_30_listState_DROPDOWN,
			final String Step_30_listBillingState_DROPDOWN, final String Step_30_txtTaxExemptID_TEXTBOX,
			final String Step_30_txtReceiverContactName_TEXTBOX, final String Step_30_txtPONumber_TEXTBOX,
			final String Step_30_txtNameonCard_TEXTBOX, final String Step_30_txtjobCode_TEXTBOX,
			final String Step_30_txtExpiryDate_TEXTBOX, final String Step_30_txtEnterCardNumber_TEXTBOX,
			final String Step_30_txtCVV_TEXTBOX, final String Step_30_txtCheckoutZipCode_TEXTBOX,
			final String Step_30_txtCheckoutphoneNumber_TEXTBOX, final String Step_30_txtCheckoutLastName_TEXTBOX,
			final String Step_30_txtCheckoutFirstName_TEXTBOX, final String Step_30_txtCheckoutEmailAddress_TEXTBOX,
			final String Step_30_txtCheckoutCity_TEXTBOX, final String Step_30_txtCheckoutAddressLine_TEXTBOX,
			final String Step_30_txtBillingzipcode_TEXTBOX, final String Step_30_txtBillingphoneNumber_TEXTBOX,
			final String Step_30_txtBillingLastName_TEXTBOX, final String Step_30_txtBillingFirstName_TEXTBOX,
			final String Step_30_txtBillingCity_TEXTBOX, final String Step_30_txtBillingAddressLine_TEXTBOX,
			final String Step_30_cvv_number_TEXTBOX, final String Step_32_listState_DROPDOWN,
			final String Step_32_listBillingState_DROPDOWN, final String Step_32_txtTaxExemptID_TEXTBOX,
			final String Step_32_txtReceiverContactName_TEXTBOX, final String Step_32_txtPONumber_TEXTBOX,
			final String Step_32_txtNameonCard_TEXTBOX, final String Step_32_txtjobCode_TEXTBOX,
			final String Step_32_txtExpiryDate_TEXTBOX, final String Step_32_txtEnterCardNumber_TEXTBOX,
			final String Step_32_txtCVV_TEXTBOX, final String Step_32_txtCheckoutZipCode_TEXTBOX,
			final String Step_32_txtCheckoutphoneNumber_TEXTBOX, final String Step_32_txtCheckoutLastName_TEXTBOX,
			final String Step_32_txtCheckoutFirstName_TEXTBOX, final String Step_32_txtCheckoutEmailAddress_TEXTBOX,
			final String Step_32_txtCheckoutCity_TEXTBOX, final String Step_32_txtCheckoutAddressLine_TEXTBOX,
			final String Step_32_txtBillingzipcode_TEXTBOX, final String Step_32_txtBillingphoneNumber_TEXTBOX,
			final String Step_32_txtBillingLastName_TEXTBOX, final String Step_32_txtBillingFirstName_TEXTBOX,
			final String Step_32_txtBillingCity_TEXTBOX, final String Step_32_txtBillingAddressLine_TEXTBOX,
			final String Step_32_cvv_number_TEXTBOX, final String Step_34_listState_DROPDOWN,
			final String Step_34_listBillingState_DROPDOWN, final String Step_34_txtTaxExemptID_TEXTBOX,
			final String Step_34_txtReceiverContactName_TEXTBOX, final String Step_34_txtPONumber_TEXTBOX,
			final String Step_34_txtNameonCard_TEXTBOX, final String Step_34_txtjobCode_TEXTBOX,
			final String Step_34_txtExpiryDate_TEXTBOX, final String Step_34_txtEnterCardNumber_TEXTBOX,
			final String Step_34_txtCVV_TEXTBOX, final String Step_34_txtCheckoutZipCode_TEXTBOX,
			final String Step_34_txtCheckoutphoneNumber_TEXTBOX, final String Step_34_txtCheckoutLastName_TEXTBOX,
			final String Step_34_txtCheckoutFirstName_TEXTBOX, final String Step_34_txtCheckoutEmailAddress_TEXTBOX,
			final String Step_34_txtCheckoutCity_TEXTBOX, final String Step_34_txtCheckoutAddressLine_TEXTBOX,
			final String Step_34_txtBillingzipcode_TEXTBOX, final String Step_34_txtBillingphoneNumber_TEXTBOX,
			final String Step_34_txtBillingLastName_TEXTBOX, final String Step_34_txtBillingFirstName_TEXTBOX,
			final String Step_34_txtBillingCity_TEXTBOX, final String Step_34_txtBillingAddressLine_TEXTBOX,
			final String Step_34_cvv_number_TEXTBOX, final String Step_37_eleTaxExemptID_HYPERLINK_Status,
			final String Step_37_eleTaxAmnt_HYPERLINK_Status, final String Step_37_eleSubTotal_HYPERLINK_Status,
			final String Step_37_eleSkuAmnt2_HYPERLINK_Status, final String Step_37_eleSkuAmnt_HYPERLINK_Status,
			final String Step_37_eleSku2_HYPERLINK_Status, final String Step_37_eleSku_HYPERLINK_Status,
			final String Step_37_eleShippingfee_HYPERLINK_Status,
			final String Step_37_eleShippingAddress_HYPERLINK_Status, final String Step_37_elePoNumber_HYPERLINK_Status,
			final String Step_37_eleOrderTotal_HYPERLINK_Status,
			final String Step_37_eleOrderQuantity2_HYPERLINK_Status,
			final String Step_37_eleOrderQuantity_HYPERLINK_Status,
			final String Step_37_eleOrderNumber_HYPERLINK_Status, final String Step_37_eleOrderDate__HYPERLINK_Status,
			final String Step_37_eleOrderConfirmation_HYPERLINK_Status,
			final String Step_37_eleDeliveryZip_HYPERLINK_Status,
			final String Step_37_eleBillingAddress_HYPERLINK_Status,
			final String Step_37_lnkMyOrderHistory_HYPERLINK_Status, final String Step_38_url_FIELD,
			final String Step_39_editUserName_TEXTBOX_Status, final String Step_39_editUserName_TEXTBOX_Verification,
			final String Step_39_editPassword_TEXTBOX_Status, final String Step_39_editPassword_TEXTBOX_Verification,
			final String Step_39_btnSignin_BUTTON_Status, final String Step_40_editUserName_TEXTBOX,
			final String Step_40_editPassword_TEXTBOX, final String Step_42_eleWelcome_HYPERLINK_Status,
			final String Step_42_eleToday_HYPERLINK_Status, final String Step_42_lnkSignOut_HYPERLINK_Status,
			final String Step_42_LnkPurchaseOrders_HYPERLINK_Status, final String Step_42_lnkContacts_HYPERLINK_Status,
			final String Step_42_LnkOrderManagement_HYPERLINK_Status, final String Step_42_TabPayment_HYPERLINK_Status,
			final String Step_45_text_PONumber_HYPERLINK_Status, final String Step_47_validate_FIELD,
			final String Step_49_valid_FIELD) throws Exception

	{

		LaunchURL_Page launchurl_page_init = PageFactory.initElements(driver, LaunchURL_Page.class);

		VerifyMessage_Page verifymessage_page_init = PageFactory.initElements(driver, VerifyMessage_Page.class);

		LaunchEPIserverApplication_Page launchepiserverapplication_page_init = PageFactory.initElements(driver,
				LaunchEPIserverApplication_Page.class);

		Selected_Order_information_displays_Page selected_order_information_displays_page_init = PageFactory
				.initElements(driver, Selected_Order_information_displays_Page.class);

		NameAndAmount_Page nameandamount_page_init = PageFactory.initElements(driver, NameAndAmount_Page.class);

		ProductAddedToCart_Page productaddedtocart_page_init = PageFactory.initElements(driver,
				ProductAddedToCart_Page.class);

		WhiteCap_pageHome_Page whitecap_pagehome_page_init = PageFactory.initElements(driver,
				WhiteCap_pageHome_Page.class);

		ECApplication_EPiServer_pageEPIServer_Page ecapplication_episerver_pageepiserver_page_init = PageFactory
				.initElements(driver, ECApplication_EPiServer_pageEPIServer_Page.class);

		Browserobj_objpageGeneric_Page browserobj_objpagegeneric_page_init = PageFactory.initElements(driver,
				Browserobj_objpageGeneric_Page.class);

		WhiteCap_pageSearchProductResults_Page whitecap_pagesearchproductresults_page_init = PageFactory
				.initElements(driver, WhiteCap_pageSearchProductResults_Page.class);

		WhiteCap_PageGeneric_Page whitecap_pagegeneric_page_init = PageFactory.initElements(driver,
				WhiteCap_PageGeneric_Page.class);

		WhiteCap_pageMyAccount_Page whitecap_pagemyaccount_page_init = PageFactory.initElements(driver,
				WhiteCap_pageMyAccount_Page.class);

		Verify_Account_PageVerifyAccount_Page verify_account_pageverifyaccount_page_init = PageFactory
				.initElements(driver, Verify_Account_PageVerifyAccount_Page.class);

		pageEPIServer_Page pageepiserver_page_init = PageFactory.initElements(driver, pageEPIServer_Page.class);

		Frameright_Page frameright_page_init = PageFactory.initElements(driver, Frameright_Page.class);

		Google_Chrome_Page google_chrome_page_init = PageFactory.initElements(driver, Google_Chrome_Page.class);

		// PageVerifyAccount_Page
		// pageverifyaccount_page_init=PageFactory.initElements(driver,
		// PageVerifyAccount_Page.class);

		pageVerifyAccount_Page pageverifyaccount_page_init = PageFactory.initElements(driver,
				pageVerifyAccount_Page.class);

		pageSearchProductResults_Page pagesearchproductresults_page_init = PageFactory.initElements(driver,
				pageSearchProductResults_Page.class);

		PageOrderConfirmation_Page pageorderconfirmation_page_init = PageFactory.initElements(driver,
				PageOrderConfirmation_Page.class);

		pageMyAccount_Page pagemyaccount_page_init = PageFactory.initElements(driver, pageMyAccount_Page.class);

		pageHome_Page pagehome_page_init = PageFactory.initElements(driver, pageHome_Page.class);

		PageGeneric_Page pagegeneric_page_init = PageFactory.initElements(driver, PageGeneric_Page.class);

		pageCheckout_Page pagecheckout_page_init = PageFactory.initElements(driver, pageCheckout_Page.class);

		PageCart_Page pagecart_page_init = PageFactory.initElements(driver, PageCart_Page.class);

		pageBrands_Page pagebrands_page_init = PageFactory.initElements(driver, pageBrands_Page.class);

		testReport.createTesthtmlHeader(overallTestData);

		testReport.createHead(overallTestData);

		testReport.putLogo(overallTestData);

		float ne = (float) 0.0;

		testReport.generateGeneralInfo(overallTestData, "EE001", "TC_EE001", "", ne);

		testReport.createStepHeader();

		// External Circumstances

		Reporter.log("Step - 1- Perform LaunchURL Action");

		testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

		launchurl_page_init.enter_URL(Step_1_URL_FIELD);

		Reporter.log("Step - 2- verify pageHome screen");

		testReport.fillTableStep("Step 2", "verify pageHome screen");

		pagehome_page_init.verify_MYLOCATION_Status(Step_2_MYLOCATION_HYPERLINK_Status);

		pagehome_page_init.verify_eleMyAccountDropDown_Status(Step_2_eleMyAccountDropDown_HYPERLINK_Status);

		pagehome_page_init.verify_eleMy_Account_Status(Step_2_eleMy_Account_HYPERLINK_Status);

		pagehome_page_init.verify_eleHomePageHeader_Status(Step_2_eleHomePageHeader_HYPERLINK_Status);

		pagehome_page_init.verify_editHomepageSearch_Status(Step_2_editHomepageSearch_TEXTBOX_Status);

		pagehome_page_init.verify_editHomepageSearch(Step_2_editHomepageSearch_TEXTBOX_Verification);
		pagehome_page_init.verify_Submit_Status(Step_2_Submit_BUTTON_Status);

		pagehome_page_init.verify_lnkMy_Profile_Status(Step_2_lnkMy_Profile_HYPERLINK_Status);

		pagehome_page_init.verify_lnkLoginNow_Status(Step_2_lnkLoginNow_HYPERLINK_Status);

		pagehome_page_init.verify_lnkGetanAccount_Status(Step_2_lnkGetanAccount_HYPERLINK_Status);

		pagehome_page_init.verify_lnkBRANDS_Status(Step_2_lnkBRANDS_HYPERLINK_Status);

		getScreenshot(driver, Configurations.screenshotLocation, "EE001", "Step_2");

		Reporter.log("Step - 3- Fill pageHome form pageHome screen");
System.out.println("done");
		/*
		 * testReport.fillTableStep("Step 3", "Fill pageHome form pageHome screen");
		 * 
		 * pagehome_page_init.set_editHomepageSearch(Step_3_editHomepageSearch_TEXTBOX);
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_3");
		 * 
		 * Reporter.log("Step - 4- click Submit button pageHome screen pageHome form");
		 * 
		 * testReport.fillTableStep("Step 4",
		 * "click Submit button pageHome screen pageHome form");
		 * 
		 * pagehome_page_init.click_Submit();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_4");
		 * 
		 * Reporter.log("Step - 5- verify PageGeneric screen");
		 * 
		 * testReport.fillTableStep("Step 5", "verify PageGeneric screen");
		 * 
		 * pagegeneric_page_init.verify_eleproductTitle_Status(
		 * Step_5_eleproductTitle_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_eleproductCount_Status(
		 * Step_5_eleproductCount_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_eleproduct_listing_Status(
		 * Step_5_eleproduct_listing_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_eleminicart_Status(
		 * Step_5_eleminicart_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_eleLocationDropDown_Status(
		 * Step_5_eleLocationDropDown_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_txtsearchZipCodeHeader_Status(
		 * Step_5_txtsearchZipCodeHeader_TEXTBOX_Status);
		 * 
		 * pagegeneric_page_init.verify_txtsearchZipCodeHeader(
		 * Step_5_txtsearchZipCodeHeader_TEXTBOX_Verification);
		 * pagegeneric_page_init.verify_editProductSearch_Status(
		 * Step_5_editProductSearch_TEXTBOX_Status);
		 * 
		 * pagegeneric_page_init.verify_editProductSearch(
		 * Step_5_editProductSearch_TEXTBOX_Verification);
		 * pagegeneric_page_init.verify_btnZipcodeHeaderUpdate_Status(
		 * Step_5_btnZipcodeHeaderUpdate_BUTTON_Status);
		 * 
		 * pagegeneric_page_init.verify_btnZipcodeHeaderSearch_Status(
		 * Step_5_btnZipcodeHeaderSearch_BUTTON_Status);
		 * 
		 * pagegeneric_page_init.verify_btnSubmit_Status(Step_5_btnSubmit_BUTTON_Status)
		 * ;
		 * 
		 * pagegeneric_page_init.verify_btnPriceRangeGo_Status(
		 * Step_5_btnPriceRangeGo_BUTTON_Status);
		 * 
		 * pagegeneric_page_init.verify_btnAddtoProjectlist_Status(
		 * Step_5_btnAddtoProjectlist_BUTTON_Status);
		 * 
		 * pagegeneric_page_init.verify_BtnAddtoCart_Status(
		 * Step_5_BtnAddtoCart_BUTTON_Status);
		 * 
		 * pagegeneric_page_init.verify_lnkMyProjectList_Status(
		 * Step_5_lnkMyProjectList_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_lnkMyOrderHistory_Status(
		 * Step_5_lnkMyOrderHistory_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_lnkLogout_Status(
		 * Step_5_lnkLogout_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_LnkIncreaseQuantityPDP_Status(
		 * Step_5_LnkIncreaseQuantityPDP_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_LnkIncreaseQtyMiniCart_Status(
		 * Step_5_LnkIncreaseQtyMiniCart_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_LnkDecreaseQuantityPDP_Status(
		 * Step_5_LnkDecreaseQuantityPDP_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_LnkCheckout_Status(
		 * Step_5_LnkCheckout_HYPERLINK_Status);
		 * 
		 * pagegeneric_page_init.verify_LinkViewCart_Status(
		 * Step_5_LinkViewCart_HYPERLINK_Status);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_5");
		 * Thread.sleep(4000); Reporter.
		 * log("Step - 6- click elePriceFilter hyperlink pageSearchProductResults screen"
		 * );
		 * 
		 * testReport.fillTableStep("Step 6",
		 * "click elePriceFilter hyperlink pageSearchProductResults screen");
		 * 
		 * pagesearchproductresults_page_init.click_elePriceFilter();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_6");
		 * Thread.sleep(5000); Reporter.
		 * log("Step - 7- click eleproduct listing hyperlink pageSearchProductResults screen"
		 * );
		 * 
		 * testReport.fillTableStep("Step 7",
		 * "click eleproduct listing hyperlink pageSearchProductResults screen");
		 * 
		 * pagesearchproductresults_page_init.click_eleproduct_listing();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_7");
		 * Thread.sleep(5000); Reporter.
		 * log("Step - 8- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 8",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_8");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 9- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 9",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_9");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 10- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 10",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_10");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 11- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 11",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_11");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 12- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 12",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_12");
		 * 
		 * Reporter.
		 * log("Step - 13- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 13",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_13");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 14- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 14",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_14");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 15- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 15",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_15");
		 * 
		 * Reporter.
		 * log("Step - 16- click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 16",
		 * "click LnkIncreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkIncreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_16");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 17- click LnkDecreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 17",
		 * "click LnkDecreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkDecreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_17");
		 * 
		 * Reporter.
		 * log("Step - 18- click LnkDecreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 18",
		 * "click LnkDecreaseQuantityPDP hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * pagegeneric_page_init.click_LnkDecreaseQuantityPDP();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_18");
		 * 
		 * Reporter.
		 * log("Step - 19- click BtnAddtoCart button PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 19",
		 * "click BtnAddtoCart button PageGeneric screen PageGeneric form");
		 * 
		 * pagegeneric_page_init.click_BtnAddtoCart();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_19");
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 20- Verify ProductAddedToCart Action");
		 * 
		 * testReport.fillTableStep("Step 20", "Verify ProductAddedToCart Action");
		 * 
		 * //productaddedtocart_page_init.enter_added(Step_20_added_FIELD);
		 * 
		 * 
		 * Reporter.
		 * log("Step - 21- click LinkViewCart hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 21",
		 * "click LinkViewCart hyperlink PageGeneric screen PageGeneric form");
		 * 
		 * pagegeneric_page_init.click_LinkViewCart();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_21");
		 * 
		 * Reporter.
		 * log("Step - 22- click eleLocationDropDown hyperlink PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 22",
		 * "click eleLocationDropDown hyperlink PageGeneric screen PageGeneric form");
		 * 
		 * pagegeneric_page_init.click_eleLocationDropDown();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_22");
		 * 
		 * Reporter.log("Step - 23- Fill PageGeneric form PageGeneric screen");
		 * 
		 * testReport.fillTableStep("Step 23",
		 * "Fill PageGeneric form PageGeneric screen");
		 * 
		 * pagegeneric_page_init.set_txtsearchZipCodeHeader(
		 * Step_23_txtsearchZipCodeHeader_TEXTBOX);
		 * pagegeneric_page_init.set_editProductSearch(Step_23_editProductSearch_TEXTBOX
		 * ); getScreenshot(driver,Configurations.screenshotLocation ,
		 * "EE001","Step_23"); Thread.sleep(2000); Reporter.
		 * log("Step - 24- click btnZipcodeHeaderSearch button PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 24",
		 * "click btnZipcodeHeaderSearch button PageGeneric screen PageGeneric form");
		 * 
		 * pagegeneric_page_init.click_btnZipcodeHeaderSearch();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_24");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 25- click btnZipcodeHeaderUpdate button PageGeneric screen PageGeneric form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 25",
		 * "click btnZipcodeHeaderUpdate button PageGeneric screen PageGeneric form");
		 * 
		 * pagegeneric_page_init.click_btnZipcodeHeaderUpdate();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_25");
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 26- click LnkCheckoutCartpage hyperlink PageCart screen"
		 * );
		 * 
		 * testReport.fillTableStep("Step 26",
		 * "click LnkCheckoutCartpage hyperlink PageCart screen");
		 * 
		 * pagecart_page_init.click_LnkCheckoutCartpage();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_26");
		 * 
		 * Reporter.log("Step - 27- verify pageCheckout screen");
		 * 
		 * testReport.fillTableStep("Step 27", "verify pageCheckout screen");
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutEmailAddress(
		 * Step_27_txtCheckoutEmailAddress_TEXTBOX_Verification);
		 * 
		 * pagecheckout_page_init.verify_listState_Status(
		 * Step_27_listState_DROPDOWN_Status);
		 * 
		 * pagecheckout_page_init.verify_listState(
		 * Step_27_listState_DROPDOWN_Verification);
		 * pagecheckout_page_init.verify_listBillingState_Status(
		 * Step_27_listBillingState_DROPDOWN_Status);
		 * 
		 * pagecheckout_page_init.verify_listBillingState(
		 * Step_27_listBillingState_DROPDOWN_Verification);
		 * pagecheckout_page_init.verify_radioPayByAccount_Status(
		 * Step_27_radioPayByAccount_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleUPSGround2_Status(
		 * Step_27_eleUPSGround2_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleUPSGround_Status(
		 * Step_27_eleUPSGround_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleUPS2Day2_Status(
		 * Step_27_eleUPS2Day2_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleUPS2Day_Status(
		 * Step_27_eleUPS2Day_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleShippingBilling_Status(
		 * Step_27_eleShippingBilling_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleShippingAdressAmericanDream_Status(
		 * Step_27_eleShippingAdressAmericanDream_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleShippingAddressRiverSide_Status(
		 * Step_27_eleShippingAddressRiverSide_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleShippingAddressLash_Status(
		 * Step_27_eleShippingAddressLash_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleShippingAddressEastQuarry_Status(
		 * Step_27_eleShippingAddressEastQuarry_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleShippingAddressAulani_Status(
		 * Step_27_eleShippingAddressAulani_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleOrderSummaryTab_Status(
		 * Step_27_eleOrderSummaryTab_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleNextDayAir2_Status(
		 * Step_27_eleNextDayAir2_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleNextDayAir_Status(
		 * Step_27_eleNextDayAir_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleMillerRoad_Status(
		 * Step_27_eleMillerRoad_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleLittleYork_Status(
		 * Step_27_eleLittleYork_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_eleBillingAddressSameAsShippingAddress_Status(
		 * Step_27_eleBillingAddressSameAsShippingAddress_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_txtTaxExemptID_Status(
		 * Step_27_txtTaxExemptID_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtTaxExemptID(
		 * Step_27_txtTaxExemptID_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtReceiverContactName_Status(
		 * Step_27_txtReceiverContactName_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtReceiverContactName(
		 * Step_27_txtReceiverContactName_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtPONumber_Status(
		 * Step_27_txtPONumber_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtPONumber(
		 * Step_27_txtPONumber_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtNameonCard_Status(
		 * Step_27_txtNameonCard_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtNameonCard(
		 * Step_27_txtNameonCard_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtjobCode_Status(
		 * Step_27_txtjobCode_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtjobCode(
		 * Step_27_txtjobCode_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtExpiryDate_Status(
		 * Step_27_txtExpiryDate_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtExpiryDate(
		 * Step_27_txtExpiryDate_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtEnterCardNumber_Status(
		 * Step_27_txtEnterCardNumber_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtEnterCardNumber(
		 * Step_27_txtEnterCardNumber_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCVV_Status(Step_27_txtCVV_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCVV(Step_27_txtCVV_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCheckoutZipCode_Status(
		 * Step_27_txtCheckoutZipCode_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutZipCode(
		 * Step_27_txtCheckoutZipCode_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCheckoutphoneNumber_Status(
		 * Step_27_txtCheckoutphoneNumber_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutphoneNumber(
		 * Step_27_txtCheckoutphoneNumber_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCheckoutLastName_Status(
		 * Step_27_txtCheckoutLastName_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutLastName(
		 * Step_27_txtCheckoutLastName_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCheckoutFirstName_Status(
		 * Step_27_txtCheckoutFirstName_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutFirstName(
		 * Step_27_txtCheckoutFirstName_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCheckoutEmailAddress_Status(
		 * Step_27_txtCheckoutEmailAddress_TEXTBOX_Status);
		 * 
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutCity_Status(
		 * Step_27_txtCheckoutCity_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutCity(
		 * Step_27_txtCheckoutCity_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtCheckoutAddressLine_Status(
		 * Step_27_txtCheckoutAddressLine_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtCheckoutAddressLine(
		 * Step_27_txtCheckoutAddressLine_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtBillingzipcode_Status(
		 * Step_27_txtBillingzipcode_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtBillingzipcode(
		 * Step_27_txtBillingzipcode_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtBillingphoneNumber_Status(
		 * Step_27_txtBillingphoneNumber_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtBillingphoneNumber(
		 * Step_27_txtBillingphoneNumber_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtBillingLastName_Status(
		 * Step_27_txtBillingLastName_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtBillingLastName(
		 * Step_27_txtBillingLastName_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtBillingFirstName_Status(
		 * Step_27_txtBillingFirstName_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtBillingFirstName(
		 * Step_27_txtBillingFirstName_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtBillingCity_Status(
		 * Step_27_txtBillingCity_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtBillingCity(
		 * Step_27_txtBillingCity_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_txtBillingAddressLine_Status(
		 * Step_27_txtBillingAddressLine_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_txtBillingAddressLine(
		 * Step_27_txtBillingAddressLine_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_cvv_number_Status(
		 * Step_27_cvv_number_TEXTBOX_Status);
		 * 
		 * pagecheckout_page_init.verify_cvv_number(
		 * Step_27_cvv_number_TEXTBOX_Verification);
		 * pagecheckout_page_init.verify_btnPlaceOrder_Status(
		 * Step_27_btnPlaceOrder_BUTTON_Status);
		 * 
		 * pagecheckout_page_init.verify_btnContinueAsGuest_Status(
		 * Step_27_btnContinueAsGuest_BUTTON_Status);
		 * 
		 * pagecheckout_page_init.verify_btnCheckoutSaveAndContinue_Status(
		 * Step_27_btnCheckoutSaveAndContinue_BUTTON_Status);
		 * 
		 * pagecheckout_page_init.verify_lnkNewShippingAddress_Status(
		 * Step_27_lnkNewShippingAddress_HYPERLINK_Status);
		 * 
		 * pagecheckout_page_init.verify_lnkChangeBillingAddress_Status(
		 * Step_27_lnkChangeBillingAddress_HYPERLINK_Status);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_27");
		 * 
		 * Reporter.log("Step - 28- Fill pageCheckout form pageCheckout screen");
		 * 
		 * testReport.fillTableStep("Step 28",
		 * "Fill pageCheckout form pageCheckout screen");
		 * pagecheckout_page_init.set_txtCheckoutEmailAddress(
		 * Step_28_txtCheckoutEmailAddress_TEXTBOX);
		 * 
		 * pagecheckout_page_init.select_listState(Step_28_listState_DROPDOWN);
		 * pagecheckout_page_init.select_listBillingState(
		 * Step_28_listBillingState_DROPDOWN);
		 * pagecheckout_page_init.set_txtTaxExemptID(Step_28_txtTaxExemptID_TEXTBOX);
		 * pagecheckout_page_init.set_txtReceiverContactName(
		 * Step_28_txtReceiverContactName_TEXTBOX);
		 * pagecheckout_page_init.set_txtPONumber(Step_28_txtPONumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtNameonCard(Step_28_txtNameonCard_TEXTBOX);
		 * pagecheckout_page_init.set_txtjobCode(Step_28_txtjobCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtExpiryDate(Step_28_txtExpiryDate_TEXTBOX);
		 * pagecheckout_page_init.set_txtEnterCardNumber(
		 * Step_28_txtEnterCardNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtCVV(Step_28_txtCVV_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutZipCode(
		 * Step_28_txtCheckoutZipCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutphoneNumber(
		 * Step_28_txtCheckoutphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutLastName(
		 * Step_28_txtCheckoutLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutFirstName(
		 * Step_28_txtCheckoutFirstName_TEXTBOX);
		 * 
		 * pagecheckout_page_init.set_txtCheckoutCity(Step_28_txtCheckoutCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutAddressLine(
		 * Step_28_txtCheckoutAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingzipcode(
		 * Step_28_txtBillingzipcode_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingphoneNumber(
		 * Step_28_txtBillingphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingLastName(
		 * Step_28_txtBillingLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingFirstName(
		 * Step_28_txtBillingFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingCity(Step_28_txtBillingCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingAddressLine(
		 * Step_28_txtBillingAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_cvv_number(Step_28_cvv_number_TEXTBOX);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_28");
		 * 
		 * Reporter.
		 * log("Step - 29- click btnContinueAsGuest button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 29",
		 * "click btnContinueAsGuest button pageCheckout screen pageCheckout form");
		 * 
		 * pagecheckout_page_init.click_btnContinueAsGuest();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_29");
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 30- Fill pageCheckout form pageCheckout screen");
		 * 
		 * testReport.fillTableStep("Step 30",
		 * "Fill pageCheckout form pageCheckout screen");
		 * 
		 * pagecheckout_page_init.set_txtCheckoutFirstName(
		 * Step_30_txtCheckoutFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutLastName(
		 * Step_30_txtCheckoutLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutAddressLine(
		 * Step_30_txtCheckoutAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutCity(Step_30_txtCheckoutCity_TEXTBOX);
		 * Thread.sleep(2000);
		 * pagecheckout_page_init.select_listState(Step_30_listState_DROPDOWN);
		 * pagecheckout_page_init.set_txtCheckoutZipCode(
		 * Step_30_txtCheckoutZipCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutphoneNumber(
		 * Step_30_txtCheckoutphoneNumber_TEXTBOX);
		 * 
		 * pagecheckout_page_init.select_listBillingState(
		 * Step_30_listBillingState_DROPDOWN);
		 * pagecheckout_page_init.set_txtTaxExemptID(Step_30_txtTaxExemptID_TEXTBOX);
		 * pagecheckout_page_init.set_txtReceiverContactName(
		 * Step_30_txtReceiverContactName_TEXTBOX);
		 * pagecheckout_page_init.set_txtPONumber(Step_30_txtPONumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtNameonCard(Step_30_txtNameonCard_TEXTBOX);
		 * pagecheckout_page_init.set_txtjobCode(Step_30_txtjobCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtExpiryDate(Step_30_txtExpiryDate_TEXTBOX);
		 * pagecheckout_page_init.set_txtEnterCardNumber(
		 * Step_30_txtEnterCardNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtCVV(Step_30_txtCVV_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutZipCode(
		 * Step_30_txtCheckoutZipCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutEmailAddress(
		 * Step_30_txtCheckoutEmailAddress_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingzipcode(
		 * Step_30_txtBillingzipcode_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingphoneNumber(
		 * Step_30_txtBillingphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingLastName(
		 * Step_30_txtBillingLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingFirstName(
		 * Step_30_txtBillingFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingCity(Step_30_txtBillingCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingAddressLine(
		 * Step_30_txtBillingAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_cvv_number(Step_30_cvv_number_TEXTBOX);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_30");
		 * Thread.sleep(2000); Reporter.
		 * log("Step - 31- click btnCheckoutSaveAndContinue button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 31",
		 * "click btnCheckoutSaveAndContinue button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * pagecheckout_page_init.click_btnCheckoutSaveAndContinue();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_31");
		 * Thread.sleep(3000);
		 * Reporter.log("Step - 32- Fill pageCheckout form pageCheckout screen");
		 * 
		 * testReport.fillTableStep("Step 32",
		 * "Fill pageCheckout form pageCheckout screen");
		 * 
		 * pagecheckout_page_init.set_txtReceiverContactName(
		 * Step_32_txtReceiverContactName_TEXTBOX);
		 * 
		 * pagecheckout_page_init.select_listState(Step_32_listState_DROPDOWN);
		 * pagecheckout_page_init.select_listBillingState(
		 * Step_32_listBillingState_DROPDOWN);
		 * pagecheckout_page_init.set_txtTaxExemptID(Step_32_txtTaxExemptID_TEXTBOX);
		 * pagecheckout_page_init.set_txtPONumber(Step_32_txtPONumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtNameonCard(Step_32_txtNameonCard_TEXTBOX);
		 * pagecheckout_page_init.set_txtjobCode(Step_32_txtjobCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtExpiryDate(Step_32_txtExpiryDate_TEXTBOX);
		 * pagecheckout_page_init.set_txtEnterCardNumber(
		 * Step_32_txtEnterCardNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtCVV(Step_32_txtCVV_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutZipCode(
		 * Step_32_txtCheckoutZipCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutphoneNumber(
		 * Step_32_txtCheckoutphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutLastName(
		 * Step_32_txtCheckoutLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutFirstName(
		 * Step_32_txtCheckoutFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutEmailAddress(
		 * Step_32_txtCheckoutEmailAddress_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutCity(Step_32_txtCheckoutCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutAddressLine(
		 * Step_32_txtCheckoutAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingzipcode(
		 * Step_32_txtBillingzipcode_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingphoneNumber(
		 * Step_32_txtBillingphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingLastName(
		 * Step_32_txtBillingLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingFirstName(
		 * Step_32_txtBillingFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingCity(Step_32_txtBillingCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingAddressLine(
		 * Step_32_txtBillingAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_cvv_number(Step_32_cvv_number_TEXTBOX);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_32");
		 * 
		 * Reporter.
		 * log("Step - 33- click btnCheckoutSaveAndContinue button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 33",
		 * "click btnCheckoutSaveAndContinue button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * pagecheckout_page_init.click_btnCheckoutSaveAndContinue();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_33");
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 34- Fill pageCheckout form pageCheckout screen");
		 * 
		 * testReport.fillTableStep("Step 34",
		 * "Fill pageCheckout form pageCheckout screen");
		 * pagecheckout_page_init.set_txtjobCode(Step_34_txtjobCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtPONumber(Step_34_txtPONumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtTaxExemptID(Step_34_txtTaxExemptID_TEXTBOX);
		 * //Frame using WebElement
		 * f1=driver.findElement(By.id("first-data-payment-field-card"));
		 * driver.switchTo().frame(f1); pagecheckout_page_init.set_txtEnterCardNumber(
		 * Step_34_txtEnterCardNumber_TEXTBOX); driver.switchTo().parentFrame();
		 * WebElement f2=driver.findElement(By.id("first-data-payment-field-exp"));
		 * driver.switchTo().frame(f2);
		 * pagecheckout_page_init.set_txtExpiryDate(Step_34_txtExpiryDate_TEXTBOX);
		 * driver.switchTo().parentFrame(); WebElement
		 * f3=driver.findElement(By.id("first-data-payment-field-cvv"));
		 * driver.switchTo().frame(f3);
		 * pagecheckout_page_init.set_cvv_number(Step_34_cvv_number_TEXTBOX);
		 * driver.switchTo().parentFrame(); WebElement
		 * f4=driver.findElement(By.id("first-data-payment-field-name"));
		 * driver.switchTo().frame(f4);
		 * pagecheckout_page_init.set_txtNameonCard(Step_34_txtNameonCard_TEXTBOX);
		 * driver.switchTo().parentFrame();
		 * 
		 * 
		 * 
		 * pagecheckout_page_init.select_listState(Step_34_listState_DROPDOWN);
		 * pagecheckout_page_init.select_listBillingState(
		 * Step_34_listBillingState_DROPDOWN);
		 * pagecheckout_page_init.set_txtReceiverContactName(
		 * Step_34_txtReceiverContactName_TEXTBOX);
		 * pagecheckout_page_init.set_txtExpiryDate(Step_34_txtExpiryDate_TEXTBOX);
		 * pagecheckout_page_init.set_txtCVV(Step_34_txtCVV_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutZipCode(
		 * Step_34_txtCheckoutZipCode_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutphoneNumber(
		 * Step_34_txtCheckoutphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutLastName(
		 * Step_34_txtCheckoutLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutFirstName(
		 * Step_34_txtCheckoutFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutEmailAddress(
		 * Step_34_txtCheckoutEmailAddress_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutCity(Step_34_txtCheckoutCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtCheckoutAddressLine(
		 * Step_34_txtCheckoutAddressLine_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingzipcode(
		 * Step_34_txtBillingzipcode_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingphoneNumber(
		 * Step_34_txtBillingphoneNumber_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingLastName(
		 * Step_34_txtBillingLastName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingFirstName(
		 * Step_34_txtBillingFirstName_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingCity(Step_34_txtBillingCity_TEXTBOX);
		 * pagecheckout_page_init.set_txtBillingAddressLine(
		 * Step_34_txtBillingAddressLine_TEXTBOX);
		 * 
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_34");
		 * Thread.sleep(4000); Reporter.
		 * log("Step - 35- click btnCheckoutSaveAndContinue button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 35",
		 * "click btnCheckoutSaveAndContinue button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * pagecheckout_page_init.click_btnCheckoutSaveAndContinue();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_35");
		 * Thread.sleep(20000); Reporter.
		 * log("Step - 36- click btnPlaceOrder button pageCheckout screen pageCheckout form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 36",
		 * "click btnPlaceOrder button pageCheckout screen pageCheckout form");
		 * 
		 * pagecheckout_page_init.click_btnPlaceOrder();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_36");
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 37- verify PageOrderConfirmation screen");
		 * 
		 * testReport.fillTableStep("Step 37", "verify PageOrderConfirmation screen");
		 * 
		 * pageorderconfirmation_page_init.verify_eleTaxExemptID_Status(
		 * Step_37_eleTaxExemptID_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleTaxAmnt_Status(
		 * Step_37_eleTaxAmnt_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleSubTotal_Status(
		 * Step_37_eleSubTotal_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleSkuAmnt2_Status(
		 * Step_37_eleSkuAmnt2_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleSkuAmnt_Status(
		 * Step_37_eleSkuAmnt_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleSku2_Status(
		 * Step_37_eleSku2_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleSku_Status(
		 * Step_37_eleSku_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleShippingfee_Status(
		 * Step_37_eleShippingfee_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleShippingAddress_Status(
		 * Step_37_eleShippingAddress_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_elePoNumber_Status(
		 * Step_37_elePoNumber_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleOrderTotal_Status(
		 * Step_37_eleOrderTotal_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleOrderQuantity2_Status(
		 * Step_37_eleOrderQuantity2_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleOrderQuantity_Status(
		 * Step_37_eleOrderQuantity_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleOrderNumber_Status(
		 * Step_37_eleOrderNumber_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleOrderDate__Status(
		 * Step_37_eleOrderDate__HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleOrderConfirmation_Status(
		 * Step_37_eleOrderConfirmation_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleDeliveryZip_Status(
		 * Step_37_eleDeliveryZip_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_eleBillingAddress_Status(
		 * Step_37_eleBillingAddress_HYPERLINK_Status);
		 * 
		 * pageorderconfirmation_page_init.verify_lnkMyOrderHistory_Status(
		 * Step_37_lnkMyOrderHistory_HYPERLINK_Status);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_37");
		 * Thread.sleep(10000);
		 * 
		 * Reporter.log("Step - 38- Perform LaunchEPIserverApplication Action");
		 * 
		 * testReport.fillTableStep("Step 38",
		 * "Perform LaunchEPIserverApplication Action");
		 * 
		 * launchepiserverapplication_page_init.OpenEPIApp(Step_38_url_FIELD);
		 * 
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 39- verify pageVerifyAccount screen");
		 * 
		 * testReport.fillTableStep("Step 39", "verify pageVerifyAccount screen");
		 * 
		 * pageverifyaccount_page_init.verify_editUserName_Status(
		 * Step_39_editUserName_TEXTBOX_Status);
		 * 
		 * pageverifyaccount_page_init.verify_editUserName(
		 * Step_39_editUserName_TEXTBOX_Verification);
		 * pageverifyaccount_page_init.verify_editPassword_Status(
		 * Step_39_editPassword_TEXTBOX_Status);
		 * 
		 * pageverifyaccount_page_init.verify_editPassword(
		 * Step_39_editPassword_TEXTBOX_Verification);
		 * pageverifyaccount_page_init.verify_btnSignin_Status(
		 * Step_39_btnSignin_BUTTON_Status);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_39");
		 * 
		 * Reporter.
		 * log("Step - 40- Fill pageVerifyAccount form pageVerifyAccount screen");
		 * 
		 * testReport.fillTableStep("Step 40",
		 * "Fill pageVerifyAccount form pageVerifyAccount screen");
		 * 
		 * pageverifyaccount_page_init.set_editUserName(Step_40_editUserName_TEXTBOX);
		 * pageverifyaccount_page_init.set_editPassword(Step_40_editPassword_TEXTBOX);
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_40");
		 * 
		 * Reporter.
		 * log("Step - 41- click btnSignin button pageVerifyAccount screen pageVerifyAccount form"
		 * );
		 * 
		 * testReport.fillTableStep("Step 41",
		 * "click btnSignin button pageVerifyAccount screen pageVerifyAccount form");
		 * 
		 * pageverifyaccount_page_init.click_btnSignin();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_41");
		 * Thread.sleep(2000); Reporter.log("Step - 42- verify pageEPIServer screen");
		 * 
		 * testReport.fillTableStep("Step 42", "verify pageEPIServer screen");
		 * pageepiserver_page_init.verify_LnkOrderManagement_Status(
		 * Step_42_LnkOrderManagement_HYPERLINK_Status);
		 * 
		 * pageepiserver_page_init.verify_eleWelcome_Status(
		 * Step_42_eleWelcome_HYPERLINK_Status);
		 * 
		 * pageepiserver_page_init.verify_eleToday_Status(
		 * Step_42_eleToday_HYPERLINK_Status);
		 * 
		 * pageepiserver_page_init.verify_lnkSignOut_Status(
		 * Step_42_lnkSignOut_HYPERLINK_Status);
		 * 
		 * pageepiserver_page_init.verify_LnkPurchaseOrders_Status(
		 * Step_42_LnkPurchaseOrders_HYPERLINK_Status);
		 * 
		 * pageepiserver_page_init.verify_lnkContacts_Status(
		 * Step_42_lnkContacts_HYPERLINK_Status);
		 * 
		 * 
		 * 
		 * pageepiserver_page_init.verify_TabPayment_Status(
		 * Step_42_TabPayment_HYPERLINK_Status);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_42");
		 * 
		 * Reporter.
		 * log("Step - 43- click LnkOrderManagement hyperlink pageEPIServer screen");
		 * 
		 * testReport.fillTableStep("Step 43",
		 * "click LnkOrderManagement hyperlink pageEPIServer screen");
		 * 
		 * pageepiserver_page_init.click_LnkOrderManagement();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_43");
		 * Thread.sleep(2000);
		 * Reporter.log("Step - 44- click eleToday hyperlink pageEPIServer screen");
		 * 
		 * testReport.fillTableStep("Step 44",
		 * "click eleToday hyperlink pageEPIServer screen");
		 * 
		 * pageepiserver_page_init.click_eleToday();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_44");
		 * 
		 * Reporter.log("Step - 45- verify ECApplication EPiServer pageEPIServer screen"
		 * );
		 * 
		 * testReport.fillTableStep("Step 45",
		 * "verify ECApplication EPiServer pageEPIServer screen");
		 * 
		 * //ecapplication_episerver_pageepiserver_page_init.verify_text_PONumber_Status
		 * (Step_45_text_PONumber_HYPERLINK_Status);
		 * 
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_45");
		 * //frame WebElement fM1=driver.findElement(By.xpath("//*[@id='right']"));
		 * driver.switchTo().frame(fM1); Reporter.
		 * log("Step - 46- click text  PONumber hyperlink ECApplication EPiServer pageEPIServer screen"
		 * );
		 * 
		 * testReport.fillTableStep("Step 46",
		 * "click text  PONumber hyperlink ECApplication EPiServer pageEPIServer screen"
		 * );
		 * 
		 * ecapplication_episerver_pageepiserver_page_init.click_text__PONumber();
		 * driver.switchTo().parentFrame();
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_46");
		 * 
		 * Reporter.log("Step - 47- Verify Selected Order information displays Action");
		 * 
		 * testReport.fillTableStep("Step 47",
		 * "Verify Selected Order information displays Action");
		 * 
		 * //selected_order_information_displays_page_init.enter_validate(
		 * Step_47_validate_FIELD);
		 * 
		 * WebElement fM2=driver.findElement(By.xpath("//*[@id='right']"));
		 * driver.switchTo().frame(fM2);
		 * Reporter.log("Step - 48- click TabPayment hyperlink pageEPIServer screen");
		 * 
		 * testReport.fillTableStep("Step 48",
		 * "click TabPayment hyperlink pageEPIServer screen");
		 * 
		 * pageepiserver_page_init.click_TabPayment(); Thread.sleep(3000);
		 * getScreenshot(driver,Configurations.screenshotLocation , "EE001","Step_48");
		 * driver.switchTo().parentFrame();
		 * Reporter.log("Step - 49- Verify NameAndAmount Action");
		 * 
		 * testReport.fillTableStep("Step 49", "Verify NameAndAmount Action");
		 * 
		 * //nameandamount_page_init.enter_valid(Step_49_valid_FIELD);
		 */
	}

	@DataProvider(name = "TestData")
	public Object[][] getData() {
		return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_1");
	}

	@AfterTest
	public void export() {
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.quit();
		try {
			testReport.writeTestReporthtml(overallTestData, "EE001");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
