package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTask1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Balachandar\\\\java & selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		
		System.out.println("Toatal no of Rows : "+tRows.size());
		for (WebElement row : tRows) {
			System.out.println(row.getText());
			

		}
		
	}

}
