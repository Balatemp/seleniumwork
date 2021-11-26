package org.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Balachandar\\\\java & selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Ffeed%2F%3Ftrk%3Dnav_logo&trk=login_reg_redirect");
		
		driver.manage().window().maximize();
		
		//Implicity Wait
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		
		WebElement textUser = driver.findElement(By.name("email-or-phone"));
		textUser.sendKeys("bala123@gmail.com");
		
		// WebDriver Wait
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		WebElement until = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		until.sendKeys("bala@123");
		
		//Fluent Wait
		Wait w1=new FluentWait(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(Throwable.class);
		Object u = w1.until(ExpectedConditions.elementToBeClickable(By.id("join-form-submit")));
		WebElement p=(WebElement)u;
		p.click();
		
	}

}
