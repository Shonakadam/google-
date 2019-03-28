package com.org.pune.GoogleSearchTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class seleniumtestng {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.eclipse.org/m2e/");
		driver.manage().window().maximize();
		driver.quit();

  }

  @AfterTest
  public void afterTest() {
  }

}
