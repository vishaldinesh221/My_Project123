package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_p1 {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement bf1;
	@FindBy(id = "continue")
	private WebElement bg1;
	
	public Select_p1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getbutton1 () {
		return bf1;
	}
    public WebElement getcountinue() {
    	return bg1;
    }
}
