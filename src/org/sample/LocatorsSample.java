package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSample {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Ffeed%2F%3Ftrk%3Dnav_logo&trk=login_reg_redirect");
	
		driver.manage().window().maximize();
		

		
		WebElement textUser = driver.findElement(By.name("email-or-phone"));
		textUser.sendKeys("bala123@gmail.com");
		

		WebElement textPass = driver.findElement(By.id("password"));
		textPass.sendKeys("bala@123");
		
		WebElement loginButton = driver.findElement(By.id("join-form-submit"));
		loginButton.click();
		
	}
	
}





//WebElement textMob = driver.findElement(By.id("phoneNumber"));
//textMob.sendKeys("9047266498");
//
//
//WebElement textEmail = driver.findElement(By.id("otpEmail"));
//textEmail.sendKeys("bala123@gmail.com");