package com.org.pune.GoogleSearchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameClass {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  WebElement frame1=driver.findElement(By.xpath("//frame[@src='overview-frame.html'][@name='packageListFrame']"));
	  driver.switchTo().frame(frame1);
	  
	  driver.findElement(By.xpath("//a[text='com.thoughtworks.selenium']")).click();
	  
	  
	  driver.findElement(By.xpath("//span[text()='CommandProcessor']")).click();
	  driver.findElement(By.xpath("//a[text()='Deprecated']")).click();
	  
	  
  }
  @BeforeTest
  public void beforemethod() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	  driver.manage().window().maximize();
	  
	  
  }
	  

  @AfterTest
  public void aftertest() {
	  driver.quit();
}
}