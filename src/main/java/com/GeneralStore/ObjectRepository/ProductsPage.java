package com.GeneralStore.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductsPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")
	private WebElement addToCartBtn;
	
	@FindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Products']")
	private WebElement productsName;
	
	public ProductsPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getProductsName() {
		return productsName;
	}
	
	public void clickOnAddToCart()
	{
		addToCartBtn.click();
	}
	
	public void ClickOnCartBtn()
	{
		cartBtn.click();
	}

}
