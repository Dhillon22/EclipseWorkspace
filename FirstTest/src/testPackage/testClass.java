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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import bsh.This;
import testPackage.constants;



public class testClass {
	static WebDriver driver;
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
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
	
/* excel reading
public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

}

public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

}
public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

		try{

			Row  = ExcelWSheet.getRow(RowNum);

		Cell = Row.getCell(ColNum);

		if (Cell == null) {

			Cell = Row.createCell(ColNum);

			Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(constants.Path_TestData + constants.File_TestData);

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}
@Test
public  void test() throws Exception {
	 
    //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

   setExcelFile(constants.Path_TestData + constants.File_TestData,"Sheet1");


    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get(constants.URL);

    Execute(driver);

    System.out.println("Login Successfully, now it is the time to Log Off buddy.");

//    Home_Page.lnk_LogOut(driver).click(); 

    driver.quit();

    //This is to send the PASS value to the Excel sheet in the result column.

    setCellData("Pass", 1, 3);

	}

public static void Execute(WebDriver driver) throws Exception{
	 
	//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

	String sUserName = getCellData(1, 1);

	String sPassword = getCellData(1, 2);
System.out.println(sUserName + sPassword);
	
//	Home_Page.lnk_MyAccount(driver).click();
//
//	LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
//
//	LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
//
//	LogIn_Page.btn_LogIn(driver).click();

}


*/


//WEbdriver window handler
/*
@Test
public void windowSwitch(){
	
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	driver.findElement(ByXPath.xpath(".//*[@id='button1']")).click();;
	String  handler= driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	System.out.println(windows);
	
	

	 Set handles = driver.getWindowHandles();

	String firstWinHandle = driver.getWindowHandle(); 
	 
	 handles.remove(firstWinHandle);

	 String winHandle=handles.iterator().next().toString();

	 if (winHandle!=firstWinHandle){

	 //To retrieve the handle of second window, extracting the handle which does not match to first window handle

	String  secondWinHandle=winHandle; //Storing handle of second window handle

	//Switch control to new window

	
	 driver.switchTo().window(secondWinHandle).close();

}}
*/

@Test
public void windowSwitch(){
	
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	driver.findElement(ByXPath.xpath(".//*[@id='alert']")).click();;
Alert alert = driver.switchTo().alert();
//alert.accept();
	

}
}

	

