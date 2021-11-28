package org.sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone11",Keys.ENTER);
		
		WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));  
		iphone.click();
		WebElement iphone1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[7]"));  
		iphone1.click();
		WebElement iphone2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));  
		iphone2.click();
		
		//To collect the parent window
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//To collect the all windows id
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String x : allwindows) {
			if(!x.equals(parent)) {
				driver.switchTo().window(x);
				String text = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();}
		}
		
		//Switch to parent windows 2 options
		driver.switchTo().defaultContent();
//		driver.switchTo().window(parent);
		
		List<String> li=new ArrayList<>();
		li.addAll(allwindows);
		
		//Switch to child2 windows
		driver.switchTo().window(li.get(2));
	}
	private void sampleUpload() {

	}
}
