package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSample {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	
		driver.manage().window().maximize();
		
		WebElement textUser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		textUser.sendKeys("bala123@gmail.com");
		

		WebElement textPass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		textPass.sendKeys("bala@123");
		
//		WebElement loginButton = driver.findElement(By.id("join-form-submit"));
//		loginButton.click();
//		
	}
	
	
}
