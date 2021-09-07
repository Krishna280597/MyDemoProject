package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Priya\\eclipse-workspace\\SeleniumInit\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement txt1 = driver.findElement(By.xpath("//button[text()='Log In']"));
String element1 = txt1.getText();
System.out.println(element1);
WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
username.sendKeys("Krishnapriya");
String myvalue = username.getAttribute("value");
System.out.println(myvalue);


	}
}
