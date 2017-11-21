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
	@Test
	  public void f() {
		  System.out.println("This is Test of 02");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is beforeMethod of 02");

	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is afterMethod of 02");

	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is beforeClass of 02");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This is afterClass of 02");

	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This is beforeTest of 02");

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is afterTest of 02");

	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This is beforeSuite of 02");

	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This is afterSuite of 02");

	  }

}
