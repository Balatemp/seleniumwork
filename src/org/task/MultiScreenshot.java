package org.task;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiScreenshot {
	
	public static WebDriver driver;

	private static void screenShot(String name) throws IOException {
		
		TakesScreenshot tk= (TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Balachandar\\java & selenium\\Selenium\\ScreenShot\\"+name+".png");
		FileUtils.copyFile(scr,des);
	}
	public static void main(String[] args) throws InterruptedException, IOException,AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		screenShot("Launch");
		Thread.sleep(3000);
		
		WebElement textUser = driver.findElement(By.id("email"));
		textUser.sendKeys("greens123@gmail.com");
		
		screenShot("email");
		Thread.sleep(3000);

		WebElement textPass = driver.findElement(By.id("pass"));
		textPass.sendKeys("greens123");
		
		screenShot("pass");
		Thread.sleep(3000);
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
	}
}