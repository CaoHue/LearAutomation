package abc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class topic_checkEnvironment {
	
	// Khai bao mot cai dirver
	
	WebDriver webdriver;
	
			
  @BeforeTest
 public void beforeTest() {
		//  Khoi tao trinh duyet
		webdriver = new FirefoxDriver();
		
		
		//Wait cho page duoc load thanh cong
		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Maximine browser len full screen
		webdriver.manage().window().maximize();
		
		// Get url cua Web
		webdriver.get("https://stag.vievie-nurse.youthdev.net");
		
			  }
  @Test
  public void TC_01_CheckTitle() {
	  String homePageTitle = webdriver.getTitle();
	  Assert.assertEquals("VieVie Nurse", homePageTitle );
  }
  
  @Test
  public void TC_02_CheckUrl() {
	  String homePageUrl = webdriver.getCurrentUrl();
	  Assert.assertEquals("https://stag.vievie-nurse.youthdev.net/login", homePageUrl);
	  
	  //String 
	 // Assert.assertEquals("Username is required", webdriver.findElement(By.xpath("//*[@id="root"]/div/div/div/form/div[1]/div/p")));
	  
  }
 
  @AfterClass
  public void afterClass() {
	  webdriver.quit();
  }

}
