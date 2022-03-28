package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_d1 {
	public WebDriver driver;
	public Payment_d1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}
	@FindBy(id = "first_name")
	private WebElement re1;
	@FindBy(id = "last_name")
	private WebElement er1;
	@FindBy(id = "address")
	private WebElement add;
	@FindBy(id = "cc_num")
	private WebElement num;
	@FindBy(name = "cc_type")
	private WebElement type;
	@FindBy(id = "cc_exp_month")
	private WebElement exp;
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement book;
	@FindBy (id = "logout")
	private WebElement out2;
	
	public WebElement getfirst_name() {
		return re1;
	}
    public WebElement getlast_name() {
		return er1;
	}
	public WebElement getaddress() {
		return add;
	}
	public WebElement getcc_num() {
		return num;
	}
	public WebElement getcc_type() {
		return type;
	}
	public WebElement getcc_exp_month() {
		return exp;
	}
	public WebElement getcc_exp_year() {
		return year;
	}
	public WebElement getcc_cvv() {
		return cvv;
	}
	public WebElement getbook_now() {
		return book;
	}
	public WebElement getlogout() {
		return out2;
	}

}
