package com.gmail.test;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SampleTest1 {

	public static void main(String[] args) {

		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		
		//close the Login Window
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search for the Product
		driver.findElement(By.name("q")).sendKeys("iphone xr" ,Keys.ENTER);
		
		//click on Product , which open NEw Tab
		driver.findElement(By.linkText("Apple iPhone XR (Black, 128 GB)")).click();
		
		//click on buuton , available in new WINDOW/NEW TAB
		driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
		


		
		
		
		
		
		
	}

}
