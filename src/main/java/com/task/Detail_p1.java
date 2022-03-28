package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detail_p1 {
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement s1;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id ="room_type")
	private WebElement types;
	@FindBy(id = "room_nos")
	private WebElement rooms;
	@FindBy(name ="datepick_in")
	private WebElement date;
	@FindBy(id = "datepick_out")
	private WebElement out;
	@FindBy (id = "adult_room")
    private WebElement adult;
	
	@FindBy(id = "child_room")
	private WebElement child;
	@FindBy(id = "Submit")
	private WebElement sub;
	
	public Detail_p1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getlocation () {
		return s1;
	}
	public WebElement gethotels() {
		 return hotel;
	}
	public WebElement getroom_type() {
		return types;
	}
	public WebElement getroom_nos () {
		return rooms;
	}
	public WebElement getdatepick_in() {
		return date;
	}
	public WebElement getdatepick_out() {
		return out;
	}
	public WebElement getadult_room() {
		return adult;
	}
	public WebElement getchild_room() {
		return child;
	}
	public WebElement getSubmit() {
		return sub;
	}
}
