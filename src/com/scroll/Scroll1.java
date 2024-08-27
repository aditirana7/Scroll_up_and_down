package com.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll1 {
	
	String URL="https://www.spicejet.com";
	@Test
	public void Scrollup() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	((JavascriptExecutor) driver).executeScript("window.scroll(0,1200)");
	Thread.sleep(6000);
	((JavascriptExecutor)driver).executeScript("window.scroll(0,-1400)");
	driver.quit();
}
}