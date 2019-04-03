package com.org.pune.GoogleSearchTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramePracticeClass {
	 WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement frame1=driver.findElement(By.xpath("//frame[@src='overview-frame.html'][@name='packageListFrame']"));
	  driver.switchTo().frame(frame1);
	 WebElement link1=driver.findElement(By.xpath("//a[@href='com/thoughtworks/selenium/package-frame.html']"));
	 link1.click();
	 
	 WebElement frame2=driver.findElement(By.xpath("//frame[@src='allclasses-frame.html'][@name='packageFrame']"));
	 driver.switchTo().defaultContent();           //base html page
	 WebElement link2=driver.findElement(By.xpath("//span[text()='CommandProcessor']"));
	 link2.click();
	 
	  WebElement frame3=driver.findElement(By.xpath(" //frame[@src='overview-summary.html'][@name='classFrame']"));
	 driver.switchTo().defaultContent();
	 WebElement link3=driver.findElement(By.xpath("//a[text()='Deprecated']"));
	 link3.click();
	  
  }
  @BeforeTest
  public void Beforemethod() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	  
  }
  @AfterTest
  public void Aftermethod() {
	  driver.quit();
  }
}
