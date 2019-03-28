package com.org.pune.GoogleSearchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInClass {
	WebDriver driver;
	public SignInClass(WebDriver driver2) {
		driver=driver2;
	}
	public void singinfuntion() {
		
		 
		  WebElement SignInButn=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		   SignInButn.click();
		   
		 WebElement UserId=driver.findElement(By.id("email"));
		 UserId.sendKeys("shonakadam123@gmail.com");
		 
		 WebElement password=driver.findElement(By.name("passwd"));
		 password.sendKeys("passwordshona");
		 
		 WebElement singupbut=driver.findElement(By.id("SubmitLogin"));
		 singupbut.click();
	}

}
