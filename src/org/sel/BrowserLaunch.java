package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Priya\\eclipse-workspace\\SeleniumInit\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension di = new Dimension(1366, 768);
		driver.manage().window().setSize(di);
		driver.get("https://www.facebook.com/");
		String tit = driver.getTitle();
		System.out.println(tit);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("krishnapriya");
		WebElement passwo = driver.findElement(By.name("pass"));
		passwo.sendKeys("12344jcljkjkhkh");
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
		
	}
}
