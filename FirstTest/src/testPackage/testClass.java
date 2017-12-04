package testPackage;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.awt.Frame;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class testClass {
	WebDriver driver;
	
	public testClass(){
		System.out.println("this is a default constructor");
	}
	
	
@BeforeTest
	public void preExecutionCall() {
	System.setProperty("webdriver.chrome.driver","/Users/infosysuser/Desktop/EclipseWorkspace/chromedriver");
	 driver = new ChromeDriver();
	//System.out.println("This is the begining of Test");
	}
//@Test
//	public  void testCaseToOpenGmail() {
//	
//	driver.get("https://www.google.com");
//	WebElement searchBox= driver.findElement(ById.id("lst-ib"));
//	searchBox.clear();
//	searchBox.sendKeys("gmail");
//	WebElement searchButton =  driver.findElement(ByName.name("btnK"));
//	searchButton.click();
//	driver.navigate().back();
//	driver.navigate().forward();
//	List<WebElement> element = driver.findElements(ByClassName.className("_NId"));
//	System.out.println(element.size());
//	WebElement element2 = element.get(0);
//	element2.click();
//	WebElement dElement =  element2.findElement(ByPartialLinkText.partialLinkText("Gmail - Google"));
//	dElement.click();
//	System.out.println();
//	System.out.println("This is sample test");
//
//}

//@Test
//public void demo1(){
//	driver.get("http://www.snapdeal.com/");
//	WebElement notNowButton = driver.findElement(ByXPath.xpath(".//*[@id='pushDenied']"));
//	if(notNowButton.isDisplayed()){
//		notNowButton.click();
//	}
//	WebElement inputTag = driver.findElement(ByXPath.xpath(".//*[@id='inputValEnter']"));
//inputTag.clear();
//inputTag.sendKeys("Boat Headphone");
//driver.findElement(ByXPath.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/button")).click();
//	WebElement sort = driver.findElement(ByXPath.xpath(".//*[@id='content_wrapper']/div[7]/div[4]/div[3]/div[1]/div/div[2]/div/div"));
//	//Actions action = new Actions(driver);
//	sort.click();
//	List<WebElement> ulList =  driver.findElements(ByXPath.xpath(".//*[@id='content_wrapper']/div[7]/div[4]/div[3]/div[1]/div/div[2]/ul/li"));
//	for (WebElement webElement : ulList) {
//		System.out.println(webElement);
//		webElement.click();
//		try {
//			Thread.sleep(8000);
//		} catch (Exception e) {
//			e.printStackTrace();// TODO: handle exception
//		}
//		sort.click();
//	}
//	
//Actions newActions = new Actions(driver);
//WebElement pricElement = driver.findElement(ByXPath.xpath(".//*[@id='content_wrapper']/div[7]/div[3]/div/div[1]/div[2]/div[3]/div[3]/div/div[4]/div/input"));
//pricElement.clear();
//pricElement.sendKeys("1500");
//
////newActions.moveToElement(target)
//}

//@Test
//public void waitTest(){
//	driver.get("http://www.snapdeal.com/");
//	Wait wait = new FluentWait(driver);
//	wait.until(ExpectedConditions.titleContains("snapdeal"));
//
//}
@AfterTest
public void postExecutionCall()
{
	//driver.quit();
	System.out.println("This is the End of Test");
}
	
//public void genericWait(String str){
//	
//	Wait wait = new FluentWait(driver);
//	wait.until(ExpectedConditions.titleContains(str));
//
//}

//@Test
//public void readProperties ()  {
//	File newFile = new File("/Users/infosysuser/Desktop/EclipseWorkspace/FirstTest/src/testPackage/testRead");
//	FileInputStream inputStream = null;
//	try {
//		inputStream = new FileInputStream(newFile);
//	} catch (FileNotFoundException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	Properties newProperties = new Properties();
//	try {
//		newProperties.load(inputStream);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//System.out.println(newProperties);
//	
//
//}

//@Test
//public void minimizeMaximize (){
//	driver.get("https://www.google.com");
//	driver.manage().window().maximize();
//	driver.manage().window().setPosition(new org.openqa.selenium.Point(200, 50));
//}
	
@Test
public void iFrameTest(){
	driver.get("http://www.naukri.com");
	Wait wait = new WebDriverWait(driver, 10);
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	//wait.until(ExpectedConditions.visibilityOf(iframeElements[0]));
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	
	driver.switchTo().frame("iframe#login-iframe.dspN");
	
}	
	
}
