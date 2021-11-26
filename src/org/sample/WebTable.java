package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Balachandar\\\\java & selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();
		
	// To find the number to rows available in data
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
//	int size = tRows.size();
//	System.out.println(size);
//	
//	//No.of available data in table
//	List<WebElement> tData = driver.findElements(By.tagName("td"));	
//	int size2 = tData.size();
//	System.out.println(size2);
	
//	//Print all the available in table
//	for (int i = 0; i < tData.size(); i++) {
//		WebElement x = tData.get(i);
//		String text = x.getText();
//		System.out.println(text);
//	}
	
	//check data is available or not
//	for (int i = 0; i < tData.size(); i++) {
//		WebElement y = tData.get(i);
//		String text1 = y.getText();
//		if (text1.equals("Dubai")) {
//			System.out.println(text1);	
//		}
//		}
	
	//To print the row and column size
	for (int i = 0; i < tRows.size(); i++) {
	
	WebElement x = tRows.get(1);
	
	List<WebElement> tData = driver.findElements(By.tagName("td"));
	for (int j = 0; j < tData.size(); j++) {
		WebElement y = tData.get(j);
		String text1 = y.getText();
		
		if(text1.equals("Saudi Arabia")) {
		System.out.println("Number of Rows:"+(i+1));
		System.out.println("Number of Column:"+(j));
		}

	}
	}
	}
	
}
