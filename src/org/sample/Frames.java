package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Balachandar\\\\java & selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		WebElement frameSwitch = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frameSwitch);
		
		WebElement userId = driver.findElement(By.name("fldLoginUserId"));
		userId.sendKeys("86586635",Keys.ENTER);

		WebElement pass = driver.findElement(By.name("fldPassword"));
		pass.sendKeys("789456",Keys.ENTER);
	}

}
