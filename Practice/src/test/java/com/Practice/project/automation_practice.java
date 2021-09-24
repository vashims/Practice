package com.Practice.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class automation_practice {
	public WebDriver driver;
	public JavascriptExecutor js;
	public Logger log;
	
//  @Test(priority = 1)
//  public void VolunteerSignUp() throws Exception {
//	  
//	     String title=driver.getTitle();     																			//get title 
//		 log.info(title);
//		 driver.switchTo().frame("frame-one1434677811");
//		 
//		 String Heading =driver.findElement(By.xpath("//h1[normalize-space()='Volunteer Sign Up']")).getText();			//get heading
//		 log.info(Heading);
//		 
//		 Thread.sleep(3000);
//		 WebElement Name=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));								//form filling 
//		 Name.sendKeys("Virat");
//		 log.info("First Name is:- "+ Name.getAttribute("value"));	
//		 
//		 WebElement lastname= driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
//		 lastname.sendKeys("Shahare");
//		  
//		 WebElement phone= driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']"));
//		 phone.sendKeys("0987654321");
//		 
//		 WebElement country= driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']"));
//		 country.sendKeys("INDIA");
//		 
//		 WebElement city= driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']"));
//		 city.sendKeys("Nagpur");
//		 
//		 WebElement email= driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']"));
//		 email.sendKeys("virat@tech.co.in");
//		 
//		 WebElement rediobtn1 = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
//		 WebElement rediobtn2 = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
//		 rediobtn2.click();
//		 if (rediobtn2.isSelected()) 
//		 {
//			 String male = driver.findElement(By.xpath("//label[normalize-space()='Male']")).getText();
//			 log.info(male);
//		 }
//		 else 
//		 {
//			 String female = driver.findElement(By.xpath("//label[normalize-space()='Female']")).getText();
//			 log.info(female);
//		 }
//		 
//		 WebElement sunday=driver.findElement(By.xpath("//label[normalize-space()='Sunday']"));
//		 
//		 WebElement monday=driver.findElement(By.xpath("//label[normalize-space()='Monday']"));
//		 
//		 WebElement Tuesday=driver.findElement(By.xpath("//label[normalize-space()='Tuesday']"));
//		 
//		 WebElement Wednesday=driver.findElement(By.xpath("//label[normalize-space()='Wednesday']"));
//		
//		 WebElement Thursday=driver.findElement(By.xpath("//label[normalize-space()='Thursday']"));
//	
//		 WebElement Friday=driver.findElement(By.xpath("//label[normalize-space()='Friday']"));
//		 	
//		 WebElement Saturday=driver.findElement(By.xpath("//label[normalize-space()='Saturday']"));
//		 sunday.click();
//		 monday.click();
//		 Thread.sleep(5000);
//		 if(sunday.isSelected())
//		 {
////			 sunday.click();
//			 String sundaytext = driver.findElement(By.xpath("//label[normalize-space()='Sunday']")).getText();
//			 log.info(sundaytext);
//			 
//			
//		 }
//		 else 
//		 {
//			 monday.click();
//			 String mondaytext = driver.findElement(By.xpath("//label[normalize-space()='Monday']")).getText();
//			 log.info(mondaytext);
//			 Tuesday.click();
//			 String Tuesdaytext = driver.findElement(By.xpath("//label[normalize-space()='Tuesday']")).getText();
//			 log.info(Tuesdaytext);
//					 
//		 }
////		 else 
////		 {
////			 Tuesday.click();
////			 String Tuesdaytext = driver.findElement(By.xpath("//label[normalize-space()='Tuesday']")).getText();
////			 log.info(Tuesdaytext);
////		 }
////		 else {
////			 
////			 String Wednesdaytext = driver.findElement(By.xpath("//label[normalize-space()='Wednesday']")).getText();
////			 log.info(Wednesdaytext);
////			 
////		 }
//	  
//  }
  @Test(priority = 1)
  public void table() {
	  WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
	  List<WebElement> columncount = table.findElements(By.tagName("td"));
	  int countc = columncount.size();
	  log.info(countc);
	  
	  List<WebElement> row = table.findElements(By.tagName("tr"));
	  int countr = row.size();
	  log.info(countr);
	  
	  for(WebElement rowcount :row) {
		  List<WebElement> column = rowcount.findElements(By.tagName("td"));
		  for(WebElement countcolumn: column) {
			  log.info(countcolumn.getText());
		  }
		  
		  
	  }
	  
		  
	  
//	  for(int i=0; i<countr;i++)
//	  {
//		  
//		  List<WebElement> column = row.get(i).findElements(By.tagName("td"));
//		  int column1 = column.size();
//		  for(int j=0; j<column1 ; j++)
//		  {
//			  
//			  log.info(column.get(j).getText());
//			  
//		  }
	  }
	  
	  
	  
//	  WebElement mytable = driver.findElement(By.xpath("//table[@name='BookTable']"));
//	   
//	   
//	  	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
//	  	int rows_count = rows_table.size();
//	  	for (int i = 0; i < rows_count; i++) {
//	  	    List < WebElement > Columns_row = rows_table.get(i).findElements(By.tagName("td"));
//	  	    int columns_count = Columns_row.size();
//	  	    for (int j = 0; j < columns_count; j++) {
//	  	        String celtext = Columns_row.get(j).getText();
//	  
//	  
 //}
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  js = (JavascriptExecutor)driver;
	  log = Logger.getLogger("automation_practice"); 
	  PropertyConfigurator.configure("log4j.properties");
	  driver.get("http://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();	  
	  
  }
  

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
