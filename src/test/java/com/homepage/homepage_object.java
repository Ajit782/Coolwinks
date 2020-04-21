package com.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homepage_object {

	
public homepage_object(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
     @FindBy(how=How.XPATH, using="//div[@class='menu menu-link1']")
     public WebElement Home_ManuLink;
     
     @FindBy(how=How.XPATH, using="//a[@href='/sunglasses/']")
     public WebElement Home_Manulink;
     @FindBy(how=How.XPATH, using="//a[@href='/sunglasses/frame-style/mirrored-sunglasses/']")
     public WebElement Home_Manulin;
   
     @FindBy(how=How.XPATH, using="//img[@class='owl-lazy']")
     public WebElement Home_Productselect;
     @FindBy(how=How.XPATH, using="//button[@class='det_btn_add_bag']")
     public WebElement Home_BuyButton;
     
}
