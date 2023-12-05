package com.GeneralStore.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeneralStore.GenericUtils.GestureUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	AndroidDriver driver;
	
	@FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryDropDown;
	
	@FindBy(xpath = "//android.widget.TextView[@text='India']")
	private WebElement selCountry;
	
	@FindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement nameTextField;
	
	@FindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private WebElement radioBtn;
	
	@FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsShopBtn;
	
	public LoginPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getSelCountry() {
		return selCountry;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getLetsShopBtn() {
		return letsShopBtn;
	}
	
	//business Logic
	public void loginSetup(String country,GestureUtility gUtil, String name)
	{
		countryDropDown.click();
		gUtil.scroll(country);
//		selCountry.click();
		nameTextField.sendKeys(name);
		radioBtn.click();
		letsShopBtn.click();
	}

}
