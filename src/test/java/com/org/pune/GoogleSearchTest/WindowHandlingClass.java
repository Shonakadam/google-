package com.org.pune.GoogleSearchTest;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlingClass {
	WebDriver driver;

	@Test
	public void f() {
		String mainwindow = driver.getWindowHandle();

		Set<String> multiplewindow = driver.getWindowHandles();
		System.out.println(multiplewindow);

		for (String myname : multiplewindow) {
			driver.switchTo().window(myname);
			String title = driver.getTitle();
			System.out.println(title);

			if (!myname.equals(mainwindow));
			
			driver.close();
		}
		
	}

	@BeforeTest
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void aftermethod() {
		driver.quit();

	}
}
