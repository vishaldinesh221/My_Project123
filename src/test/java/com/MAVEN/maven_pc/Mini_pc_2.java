package com.MAVEN.maven_pc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.task.Base_Class;

public class Mini_pc_2 extends Base_Class {
	public static WebDriver driver = browser_configuration("chrome");
    public static Logger log = Logger.getLogger(mini_project_0.class);
	public static void main(String[] args) throws IOException {
	//	driver = browser_configuration("chrome");
		PropertyConfigurator.configure("log4j.properties");
		
		geturl("http://automationpractice.com/index.php");
		log.info("Url launch");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//sign in
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickElement(signin);
		//login
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("visualdinesh664@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("boom@123");
		WebElement button1 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickElement(button1); 
		log.info("Credentials entered in field");
		// purchase
		WebElement dr1 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		clickElement(dr1);
		WebElement sh1 = driver.findElement(By.id("selectProductSort"));
		selectbyDropdown("bytext",sh1,"Price: Highest first");
		WebElement list = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
	    clickElement(list);
		WebElement more = driver.findElement(By.xpath("//a[@title='View']"));
	     clickElement(more);
	    WebElement cart = driver.findElement(By.name("Submit"));
	    clickElement(cart);
	    log.info("Added to cart");
	    WebElement proc = driver.findElement(By.xpath("//a[contains(@title,'Proceed')]"));
	    clickElement(proc);
		WebElement price = driver.findElement(By.id("total_price"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File saved = new File("C:\\Users\\vishal\\eclipse-workspace\\selenium\\ScreensShot\\price.png");
		FileUtils.copyFile(source, saved);
		log.info("Payment done successfully");
		
		driver.close();
		log.info("Close page");
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
