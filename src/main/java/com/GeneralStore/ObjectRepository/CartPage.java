package com.GeneralStore.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	
	AndroidDriver driver;
	
	@FindBy(id = "com.androidsample.generalstore:id/productName")
	private WebElement pdtName;
	
	@FindBy(className = "android.widget.CheckBox")
	private WebElement checkBox;
	
	@FindBy(id = "com.androidsample.generalstore:id/btnProceed")
	private WebElement proceedBtn;
	
	public CartPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getPdtName() {
		return pdtName;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	
	public void clickOnCheckBox()
	{
		checkBox.click();	
	}
	public void clickOnProceedBtn()
	{
		proceedBtn.click();
	}

}
