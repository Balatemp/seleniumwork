package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	


	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	
	//to maximize the window
	driver.manage().window().maximize();
	
	//inspecting the UserName textBox
	 WebElement textUser = driver.findElement(By.xpath("//input[@name='username']"));
	 
	 //Type casting
	 JavascriptExecutor executor= (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].setAttribute('value','Vicky')",textUser);
	 
	 //To print attribute value
	 Object object = executor.executeScript("return arguments[0].getAttribute('value')",textUser);
	
	 //type casting
	 String text=(String)object;
	 System.out.println(text);
	 
	 //inspecting the password textBox
	 WebElement textPass = driver.findElement(By.name("password"));
	 executor.executeScript("arguments[0].setAttribute('value','Facebook@1299')",textPass);
	 
	 Object object1 = executor.executeScript("return arguments[0].getAttribute('value')",textPass);
	 System.out.println(object1);
	 
	 //To inspect the login button
	 WebElement btnLogin = driver.findElement(By.xpath("//div[@class='sqdOP  L3NKy   y3zKF     ']"));
	 executor.executeScript("arguments[0].click()",btnLogin);

	}
}
