package com.oib.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class General  extends Global
{
	
	public void openApplication() 
	{
	
		System.setProperty("webdriver.gecko.driver","C:\\Testing Data\\geckodriver.exe");
	 driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginForm.jsp");
		System.out.println("Application Opened");
		
	}
		
	public void login1() 
	{
		driver.findElement(By.name(txtBoxuserName)).sendKeys(useid);
		driver.findElement(By.name(txtBoxPassword)).sendKeys(password);
		driver.findElement(By.name(btnsigin)).click();
	      System.out.println("login completed");
	}
	public void waitStmt() throws Exception{
		Thread.sleep(3000);
			}
	
	public void mouseoverAndClick() throws Exception 
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("link1"))).perform();
		System.out.println("Mouseover completed");
		Thread.sleep(2000);
	
	      // Click on submenu
	   ac.moveToElement(driver.findElement(By.id("menuItemHilite0"))).perform();
	    driver.findElement(By.id("menuItemHilite0")).click();
	    Thread.sleep(2000);
	}
	
	public void logout() {

		driver.findElement(By.className(linklogout)).click();
		System.out.println("logout Completed");
	}

	public void closeApplication() {
		driver.quit();
		System.out.println("Application Closed");
	
	}
}
	


