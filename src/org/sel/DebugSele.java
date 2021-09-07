package org.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DebugSele {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Priya\\eclipse-workspace\\SeleniumInit\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		WebElement fstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fstname.sendKeys("priya");
		
		
		
		
	}

}
