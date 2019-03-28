package com.org.pune.GoogleSearchTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MainTestClass {
	 WebDriver driver;
  @Test
  public void singinmethod() {
	 
	  SignInClass obj= new SignInClass(driver);
	  obj.singinfuntion();
	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","Resoures/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	   
  }

}
