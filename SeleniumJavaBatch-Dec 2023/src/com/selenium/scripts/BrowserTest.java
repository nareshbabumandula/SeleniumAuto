package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	static WebDriver driver;

	public static void launchBrowser(String browser) throws InterruptedException {
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "./browsers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser..!");
			break;
		}
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		Thread.sleep(3000);
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("EDGE");
		launchBrowser("Chrome ");
	}
}
