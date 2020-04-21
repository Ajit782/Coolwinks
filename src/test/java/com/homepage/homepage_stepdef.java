package com.homepage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.baseclass;


import HTML_REPORTS.HTMLReportGenerator;
import HTML_REPORTS.TakeScreenShot;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class homepage_stepdef {
	
	static int count = 1;
	AppiumDriver<MobileElement> driver=null;
	//WebDriver driver=null;
	
	@Given("^Browse to the Home page$")
	public void browse_to_the_Home_page() throws Throwable {
	 
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "AndroidDevice");
		caps.setCapability("udid", "b28e6aea"); //Give Device ID of your mobile phone
	//	caps.setCapability("udid", "d11ade7c0703");
		//caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("browserName", "Chrome");
		
		
		
		try {
			
			System.out.println("@@@@@@@@@@@@@");
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println("&&&&&&&&&&"+e.getMessage());
		}
				
		//Open URL in Chrome Browser
		driver.get("https://www.coolwinks.com/");
		
		Thread.sleep(3000);
		
		HTMLReportGenerator.StepDetails("Pass", (count++) + "- Browse to the Home page", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
	
		Thread.sleep(4000);
		
		System.out.println("$$$$$$$$$$$$$$");

		Thread.sleep(4000);
		
		}
	@Then("^Click on the Sunglasses option\\.$")
	public void click_on_the_Sunglasses_option() throws Throwable {
		
		homepage_object vodahome = new homepage_object(driver);
		//	Meta_function fun1=new Meta_function();
			
	
			WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
		
			wait.until(ExpectedConditions.visibilityOfAllElements(vodahome.Home_ManuLink));
			
			vodahome.Home_ManuLink.click();
			
				
				System.out.println("Verify Home Page >> Header should display");
				
				
				HTMLReportGenerator.StepDetails("Pass", (count++) + "- Verify Home Page >> Header is displayed", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
				
		}catch(TimeoutException ex) {
		
			System.out.println("Locator not found issue");
			
			HTMLReportGenerator.StepDetails("Fail", (count++) + "- Locator not found issue", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
		  }
		Thread.sleep(1000);
		vodahome.Home_Manulink.click();
		Thread.sleep(100);
		vodahome.Home_Manulin.click();
	}

	@Then("^Select any sunglasses from the product listing Page$")
	public void select_any_sunglasses_from_the_product_listing_Page() throws Throwable {
		

		homepage_object vodahome = new homepage_object(driver);
	//	Meta_function fun1=new Meta_function();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

	try {
	
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfAllElements(vodahome.Home_Productselect));
		
		vodahome.Home_Productselect.click();
		
			System.out.println("Select any sunglasses from the product listing Page");
			
			
			HTMLReportGenerator.StepDetails("Pass", (count++) + "- Select any sunglasses from the product listing Page", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
	
			System.out.println("Select any sunglasses from the product not listing Page");
			
			HTMLReportGenerator.StepDetails("Fail", (count++) + "- Select any sunglasses from the product not listing Page", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
			
	}catch(TimeoutException ex) {
	
		System.out.println("Locator not found issue");
		
		HTMLReportGenerator.StepDetails("Fail", (count++) + "- Locator not found issue", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
	  }
	   	
	}

	@Then("^Click on the buy Now button$")
	public void click_on_the_buy_Now_button() throws Throwable {
		homepage_object vodahome = new homepage_object(driver);
		//	Meta_function fun1=new Meta_function();
			
			
			
			WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
		
			Thread.sleep(2000);

			wait.until(ExpectedConditions.visibilityOfAllElements(vodahome.Home_BuyButton));
			
			vodahome.Home_BuyButton.click();
			
				System.out.println("Click on the buy Now button");
				
				
				HTMLReportGenerator.StepDetails("Pass", (count++) + "- Click on the buy Now button", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
		
				System.out.println("Unable to click on the buy Now button");
				
				HTMLReportGenerator.StepDetails("Fail", (count++) + "- Unable to click on the buy Now button", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
				
		}catch(TimeoutException ex) {
		
			System.out.println("Locator not found issue");
			
			HTMLReportGenerator.StepDetails("Fail", (count++) + "- Locator not found issue", "",TakeScreenShot.TakeScreenShot(baseclass.Get_ImageFilePath(), driver));
		  }
			
	}
	
	
}
