package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
     public WebDriver driver;
    
     private Login_1 l1;
     
     private Detail_p1 dp1;
     
     private Select_p1 sp1;
     
     private Payment_d1 pd1;
     
     public Page_Object_Manager(WebDriver driver2) {
    	 this.driver = driver2;
    	 PageFactory.initElements(driver, this);
     }
     public Login_1 get_instance_l1 () {
    	 l1 = new Login_1(driver);
    	 return l1;
     }
     public Detail_p1 get_instance_dp1 () {
    	 dp1 = new Detail_p1(driver);
    	 return dp1;
     } public Select_p1 get_instance_sp1 () {
    	 sp1 = new Select_p1(driver);
    	 return sp1;
     } public Payment_d1 get_instance_pd1 () {
    	 pd1 = new Payment_d1(driver);
    	 return pd1;
     }
}
