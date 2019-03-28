package com.org.pune.GoogleSearchTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eclipse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.eclipse.org/m2e/");
		driver.manage().window().maximize();
		driver.quit();

	}

}
