package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {


	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		
		driver.manage().window().maximize();
		
		WebElement screenShot = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		screenShot.click();
		
		TakesScreenshot Pic = (TakesScreenshot)driver;
		
		File f = screenShot.getScreenshotAs(OutputType.FILE);
		File s = new File("C:\\Users\\Balachandar\\Pictures\\seleniumSnap\\MoneyControl.png");
		
		FileUtils.copyFile(f,s);
	
		
	}

}
