package testPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest01 {
	  @Test(priority = 0, groups = "GAGAN")

	  public void f() {
		  System.out.println("This is Test1 of 01 for Group GAGAN");
	  }
	  @Test(priority = 1, groups = "Amol")

	  public void f2() {
		  System.out.println("This is Test2 of 01 for Group Amol");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is beforeMethod of 01");

	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is afterMethod of 01");

	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is beforeClass of 01");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This is afterClass of 01");

	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This is beforeTest of 01");

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is afterTest of 01");

	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This is beforeSuite of 01");

	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This is afterSuite of 01");

	  }

}
