package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_1 {
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
    public Login_1(WebDriver driver2) {
    	this.driver = driver2 ;
    			PageFactory.initElements(driver,this);
    			}
    public WebElement getusername() {
    	return username ;
    }
    public WebElement getpassword() {
    	return pass;
    }
    public WebElement getlogin() {
    	return login;
    }
    @FindBy(name = "pass")
    private WebElement pass;
    @FindBy(xpath="login")
    private WebElement login;
    
    
    
    
    
}

