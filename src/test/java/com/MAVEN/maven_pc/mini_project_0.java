package com.MAVEN.maven_pc;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.task.Base_Class;
import com.task.Detail_p1;
import com.task.Login_1;
import com.task.Page_Object_Manager;
import com.task.Payment_d1;
import com.task.Select_p1;

public class mini_project_0 extends Base_Class{
 public static WebDriver driver = browser_configuration("chrome");
 public static Page_Object_Manager pom = new Page_Object_Manager(driver);
 public static Logger log = Logger.getLogger(mini_project_0.class);
public static void main(String[] args) throws InterruptedException, IOException {
	PropertyConfigurator.configure("log4j.properties");


	           //  driver = browser_configuration("chrome");
	           geturl("https://adactinhotelapp.com/");
	           log.info("URL launch");
	            
	            String username = particular_data("C:\\Users\\vishal\\eclipse-workspace\\maven_pc\\Test  case Adactin booking.xlsx", 
	            		10, 5);
	            String pass = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
	    				11, 5);
	            
	            
	   //  Login_1 l1 = new Login_1(driver);
		passtheValueElement(pom.get_instance_l1().getusername(),username );
		passtheValueElement(pom.get_instance_l1().getpassword(), pass);
	    clickElement(pom.get_instance_l1().getlogin());
	    
	    log.info("USERNAME&PASS launch");
	    
	  //  Detail_p1 dp1 = new Detail_p1(driver);
	    String s1 = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			12	, 5);
	    String hotel = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			 13	, 5);
	    String types = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
		     14	, 5);
	    String rooms = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
		     15, 5);
	  	  selectbyDropdown("ByValue",pom.get_instance_dp1().getlocation(),s1);
	    selectbyDropdown("ByValue",pom.get_instance_dp1().gethotels(),hotel );
	    selectbyDropdown("ByVisibleText",pom.get_instance_dp1().getroom_type(),types);  
        selectbyDropdown("ByValue",pom.get_instance_dp1().getroom_nos(), rooms);
        
        log.info("HOTEL_DETAILS launch");
        
   	 Thread.sleep(3000);
   	 
   	String date = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
		     16, 5);
   	String out = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
		     17, 5);
	String adult = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
		     18, 5);
	String child = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
		     19, 5);
   	
	    passtheValueElement(pom.get_instance_dp1().getdatepick_in(), date);
	    passtheValueElement(pom.get_instance_dp1().getdatepick_out(), out);
	    selectbyDropdown("ByValue",pom.get_instance_dp1().getadult_room(),adult);
	    selectbyDropdown("byvisibletext",pom.get_instance_dp1().getchild_room(),child );
	    clickElement(pom.get_instance_dp1().getSubmit());
	    
	    log.info("BOOKINGTYPE launch");
	     Select_p1 sp1 = new Select_p1(driver);
	    
	    clickElement(pom.get_instance_sp1().getbutton1());
	     clickElement(pom.get_instance_sp1().getcountinue());
	    
	     Payment_d1 pd1 = new Payment_d1(driver);
	 	String chennai = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			     21, 5);
		String cc_num = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			     22, 5);
		String  cc_type= particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			     23, 5);
		String cc_exp_month = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			     24, 5);
		String cc_exp_year = particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			     24, 5);
		String cc_cvv= particular_data( "C:\\\\Users\\\\vishal\\\\eclipse-workspace\\\\maven_pc\\\\Test  case Adactin booking.xlsx",
			     25, 5);	    
	    
	    passtheValueElement(pom.get_instance_pd1().getfirst_name(), "vishal");
	    passtheValueElement(pom.get_instance_pd1().getlast_name(), "david1");
	    passtheValueElement(pom.get_instance_pd1().getaddress(),chennai );
	    passtheValueElement(pom.get_instance_pd1().getcc_num(), cc_num);
	    selectbyDropdown("ByValue", pom.get_instance_pd1().getcc_type(),cc_type);
	    selectbyDropdown("ByValue",pom.get_instance_pd1().getcc_exp_month(), cc_exp_month);
	    selectbyDropdown("ByValue", pom.get_instance_pd1().getcc_exp_year(),cc_exp_year);
	    passtheValueElement(pom.get_instance_pd1().getcc_cvv(), cc_cvv);
	    clickElement(pom.get_instance_pd1().getbook_now());
	    log.info("ACC DETAILS launch");
	    
	    Thread.sleep(3000);
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	     File SShot = ts.getScreenshotAs(OutputType.FILE);
	     File saved =new File("C:\\Users\\vishal\\eclipse-workspace\\selenium\\ScreensShot\\adatinhotel.png");
	     FileUtils.copyFile(SShot , saved);
   	     clickElement(pom.get_instance_pd1().getlogout());
	    
	    driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	}
}
