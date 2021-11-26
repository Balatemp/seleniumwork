package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balachandar\\java & selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=13542685098785965860&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061904&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAjwzOqKBhAWEiwArQGwaGfnh4Aud6AmOpRt4fuefHOI222iHx2PWXrFCeLnoUCEO1DG_PcQVRoC2XEQAvD_BwE");
	
		driver.manage().window().fullscreen();
		
		
		//to fetch the title of the webpage
		String title= driver.getTitle();
		System.out.println(title);
		
		//to fetch url of the webpage
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to close the window
		driver.quit();
		
	}
	
	
}
