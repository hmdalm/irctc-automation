package com.hammad.automation.irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Irctc_Test {
	public static WebDriver driver;
	 
	
	@BeforeClass
	public static void launchIrctc() throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"disha-banner-close\"]")).click();
	}
	@Test
	public void route_Selection() throws Exception{
		
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("DELHI - DLI");
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("BIKANER JN - BKN");
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[5]/td[4]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")).click();
		
	}
	@Test
	public void check_Availability() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div/div[2]")).click();
	Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[2]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[2]/div")).click();
	Thread.sleep(5000);
	}
	@Test
	public void login_Page() throws Exception{
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/div/label/button")).click();
		driver.findElement(By.id("1051816")).sendKeys("hmdalm143");
		driver.findElement(By.id("5750551")).sendKeys("Hmd786alm$");
		
	}
	
	
	@AfterClass
	public static void teardown() throws  Exception {
		Thread.sleep(15000);
		driver.close();
	}
	
}
