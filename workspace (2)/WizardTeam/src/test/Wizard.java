// author : Dinesh.k
// Date : 23-01-2018
// Version : Nura Cms 1.0

package test;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
//import org.testng.TestNGException;

public class Wizard extends Login{
	
	@Test(priority =3)
	public void AboutCompany() throws InterruptedException, AWTException
	{
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[5]/td[5]")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary ']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@class='form-control']")).clear();
////	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Complete step by step guide to Setup and Configure Jenkins with Selenium. Learn how to integrate Jenkins with Selenium and scheduling Jenkins job");
////	Thread.sleep(2000);
//	 WebElement element = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[2]/div/button[1]"));
//	 element.click();
//	 uploadFile("/home/developn51/Pictures/86f31e588a5d2287ca3a73e01e62449f.png");
//	 Thread.sleep(3000);
////	 WebElement element1 = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[3]/div/button[1]"));
////	 element1.click();
////	 uploadFile("/home/developn51/Pictures/pwc-real-estate-2020-building-the-future.pdf");
////	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//input[@class='form-control']")).clear();
//	 Thread.sleep(3000);
////	 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("https://www.youtube.com/embed/kY5P9sZqFas");
//////	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//	 Thread.sleep(3000);
////	 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[7]/div/button")).click();
////	 WebDriverWait wait = new WebDriverWait(driver, 60);
////	 WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-confirm-alert-button-group']")));
////	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[@class='react-confirm-alert']"));
//	 Thread.sleep(3000);
//     driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//     Thread.sleep(3000);
	}
//@Test(priority = 4)
//public void awards() throws InterruptedException {
//driver.findElement(By.xpath("//i[contains(.,'event')]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[contains(.,'Add Awards & Events')]")).click();
//Thread.sleep(3000);
////driver.findElement(By.xpath("//input[@name='atitle']")).sendKeys("Acheievement");
////Thread.sleep(2000);
////driver.findElement(By.xpath("//input[@name='year']")).click();
////Thread.sleep(2000);
////driver.findElement(By.xpath("//td[@data-value='2010']")).click();
////Thread.sleep(2000);
////driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Best Entreprenur");
////Thread.sleep(5000);
////WebElement element2 = driver.findElement(By.xpath("//button[@class='btn btn-sm m-r-10 pull-left uploadBtn']"));
////element2.click();
////uploadFile("/home/developn51/Pictures/images.jpeg");
////Thread.sleep(3000);
////driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//div[@class='react-confirm-alert-button-group']")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//i[@class='fa fa-pencil pull-left']")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).clear();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Best Entreprenur award");
////Thread.sleep(3000);
////driver.findElement(By.name("year")).clear();
////Thread.sleep(3000);
////driver.findElement(By.name("year")).click();
////Thread.sleep(2000);
////driver.findElement(By.xpath("//td[@data-value='2010']")).click();
////Thread.sleep(2000);
//////driver.findElement(By.xpath("//textarea[@class='form-control']")).clear();
////Thread.sleep(5000);
////driver.findElement(By.name("adescr")).sendKeys("Best Entreprenur of the year");
////Thread.sleep(5000);
////driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//div[@class='react-confirm-alert-button-group']")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////driver.findElement(By.xpath("//button[contains(.,'Readmore')]")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//i[@value='6c180c4c-6187-4632-aeed-7e3ff1c896f3']")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//i[@class='fa fa-times-circle pull-right']")).click();
////Thread.sleep(3000);
////driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////Thread.sleep(3000);
//}
//@Test(dataProvider = "dp", priority = 5)
//public void Events(String a, String b) throws InterruptedException {
//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/label[2]/span")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Inauguration");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='dateTime']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[contains(.,'›')]")).click();
//	driver.findElement(By.xpath("//td[@data-value='24']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@name='descr']")).sendKeys("Inauguration Event");
//	Thread.sleep(2000);
//	WebElement element3 = driver.findElement(By.xpath("//button[contains(.,'Upload')]"));
//	element3.click();
//	uploadFile("/home/developn51/Pictures/Test.jpg");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//i[@class='fa fa-pencil pull-left']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@name='title']")).clear();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@name='title']")).sendKeys(a);
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//textarea[@name='descr']")).clear();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@name='descr']")).sendKeys(b);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//i[@class='fa fa-times-circle pull-right']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	Thread.sleep(3000);
//}
//@Test(priority = 6)
//public void Management() throws InterruptedException {
//	driver.findElement(By.xpath("//i[contains(.,'people')]")).click();
//	driver.findElement(By.xpath("//button[@class='btn btn-primary ']")).click();
////	driver.findElement(By.xpath("//input[@name='mtitle']")).sendKeys("Gupta");
////	Thread.sleep(3000);
////	driver.findElement(By.xpath("//input[@name='mdesignation']")).sendKeys("CEO");
////	Thread.sleep(3000);
////	driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("Gupta@gmail.com");
////	Thread.sleep(3000);
////	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("CEO of the Company");
////	Thread.sleep(3000);
////	WebElement element4 = driver.findElement(By.xpath("//button[contains(.,'Upload')]"));
////	element4.click();
////	uploadFile("/home/developn51/Pictures/images.jpeg");
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//i[@class='fa fa-pencil pull-left']")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//input[@name='mtitle']")).clear();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//input[@name='mtitle']")).sendKeys("Developer");
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).clear();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//i[@class='fa fa-times-circle pull-right']")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
////	Thread.sleep(3000);
//}
//@Test(priority = 7)
//public void Teams() throws InterruptedException {
//	driver.findElement(By.xpath("//label[@id='team']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Ram");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='designation']")).sendKeys("Marketing head");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ram@gmail.com");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("MR.ram Is a well versed in Marketing Department");
//	Thread.sleep(2000);
//	WebElement element = driver.findElement(By.xpath("//button[contains(.,'Upload')]"));
//	element.click();
//	uploadFile("/home/developn51/Pictures/Ram.jpeg");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	driver.findElement(By.xpath("//i[@class='fa fa-pencil pull-left']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='title']")).clear();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Ramanadhan");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='designation']")).clear();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='designation']")).sendKeys("Developer");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//i[@class='fa fa-times-circle pull-right']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
//	Thread.sleep(3000);
//	
//}
//public static void setClipboardData(String string) {
//	//StringSelection is a class that can be used for copy and paste operations.
//	   StringSelection stringSelection = new StringSelection(string);
//	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//	}
//public static void uploadFile(String fileLocation) {
//    try {
//    	//Setting clipboard with file location
//        setClipboardData(fileLocation);
//        //native key strokes for CTRL, V and ENTER keys
//        Robot robot = new Robot();
//
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//    } catch (Exception exp) {
//    	exp.printStackTrace();
//    }
//    }
//	public static void scroll() throws AWTException {
//		Robot robot1 = new Robot();
//		robot1.keyPress(KeyEvent.VK_DOWN);
//	}
//@Test(priority = 8)
//public void Contacts() throws InterruptedException {
//	{
//		driver.findElement(By.xpath("//i[contains(.,'perm_contact_calendar')]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary ']")).click();
//		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Realitindia.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Real@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='helpnumber']")).sendKeys("98545122212");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='btn btn- pull-right m-t-2']")).click();	
//	}
//}
////@Test(priority = 9)
////public void AddProject() throws InterruptedException {
////	{
////		driver.findElement(By.xpath("//i[contains(@class,'fa fa-building-o')]")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/input")).sendKeys("NITHYA");
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("//button[contains(.,'Go')]")).click();
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("//button[contains(.,'Ongoing Project')]")).click();
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("//button[@value='Apartment']")).click();
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("//input[@name='ApartmentName']")).sendKeys("NITHYA FLAT");
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("//input[@name='noofBlocks']")).sendKeys("20");
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/input")).sendKeys("20");
////	    Thread.sleep(3000);
////	    driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[5]/div[3]/div[2]/div/input")).click();
////	    Thread.sleep(3000);
////	}
//@DataProvider
//public Object[][] dp() {
//return new Object[][] {
//new Object[] {"Testing" ,"Best Event Award"}	
//};
//}

}

