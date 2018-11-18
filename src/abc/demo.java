package abc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class demo {
  WebDriver driver = new FirefoxDriver();
  
  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void f() {
	  
	  driver.get("http://stag.vievie-nurse.youthdev.net");
	  //
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
