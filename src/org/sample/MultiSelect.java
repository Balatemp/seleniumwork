package org.sample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Balachandar\\\\java & selenium\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement multiSelect = driver.findElement(By.id("fruits"));
		
		// To perform multiSelect
		Select s=new Select(multiSelect);
		s.selectByIndex(1);
		s.selectByVisibleText("Orange");
		s.selectByValue("banana");
		
		// To print the all Selected Options
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			
			WebElement x = options.get(i);
			String text = x.getText();
			System.out.println(text);
		}
		// To Print the first Selected Options
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);
		
		//To print all the options which available in Drop down
		List<WebElement> li = s.getOptions();
		for (int i = 0; i < li.size(); i++) {
			WebElement y = li.get(i);
			String text2 = y.getText();
			System.out.println(text2);
		}	
	}
}
