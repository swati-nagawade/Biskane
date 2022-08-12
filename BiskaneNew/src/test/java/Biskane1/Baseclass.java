package Biskane1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver = null;
	@BeforeTest
	public void OpenBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://qa.biskane.com/login");
	}
	@AfterTest
	public void ClosingBrowser() {
		driver.quit();
	}
}
