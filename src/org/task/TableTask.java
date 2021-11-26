package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Balachandar\\\\java & selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			
		// To find the number to rows available in data
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		System.out.println("**********print the Odd values***********");
		for (int i = 0; i < tData.size(); i+=2) {
			WebElement x = tData.get(i);
			String text1 = x.getText();
			System.out.println(text1);
		}
		
		
		System.out.println("***********print the Even vaules***********");
		for (int j = 0; j < tData.size(); j+=2) {
			WebElement y = tData.get(j);
			String text1 = y.getText();
			System.out.println(text1);
		}
	}
}
