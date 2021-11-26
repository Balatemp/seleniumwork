package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().fullscreen();
		
//		WebElement textBox = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
//		textBox.sendKeys("Bala");
//		
//		WebElement textBox1 = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
//		textBox1.sendKeys("B");
//		
//		WebElement textBox2 = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
//		textBox2.sendKeys("no 23A, 1st main road, Ambal nagar");
//		
//		WebElement textBox3 = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
//		textBox3.sendKeys("bala123@gmail.com");
//		
//		WebElement textBox4 = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
//		textBox4.sendKeys("8807185471");
		
		WebElement radioButton5 = driver.findElement(By.xpath("//div[@id='heading20']"));
		radioButton5.click();
		
		WebElement checkBox = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		checkBox.click();
		
//		WebElement dropDown = driver.findElement(By.id("countries"));
//		dropDown.click();
//		
//		WebElement submitButton = driver.findElement(By.id("checkbox1"));
//		submitButton.click();
		

		
		
//		WebElement textBox6 = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
//		textBox6.sendKeys("bala123@gmail.com");

	
}


}
