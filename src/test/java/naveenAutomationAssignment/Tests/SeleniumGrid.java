package naveenAutomationAssignment.Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 




  public class SeleniumGrid { 
	  WebDriver driver=null;
	  DesiredCapabilities capability;
	@BeforeMethod
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		//add argumrnt for chromeoptions
			options.addArguments("--incognito");
		 DesiredCapabilities capability = new DesiredCapabilities();
		 capability. setBrowserName("chrome");
		 capability.setPlatform(Platform.WINDOWS);
		options.merge(capability);
		 WebDriverManager.chromedriver().setup();
		// capability.setCapability(ChromeOptions.CAPABILITY, options);
		  try {
				driver = new RemoteWebDriver(new URL("http://192.168.1.64:4444"), capability);
	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
	
	} 
		
		
		
	
  
  
  @Test 
  public void Test1(){ 
	  
	
  driver.get("https://www.selenium.dev/documentation/grid/getting_started/");
  
  
  }
  @Test
  public void Test2() {
	  
	
driver.get("https://www.guru99.com/introduction-to-selenium-grid.html");


}
  @Test
  public void Test3() {
	  driver.get("https://www.simplilearn.com/tutorials/selenium-tutorial/what-is-selenium-webdriver#:~:text=Selenium%20is%20an%20open%2Dsource,Selenium%20Remote%20Control%20(RC)");
	  
  }
  @Test
  public void Test4() {
	  driver.get("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
	  
  }
  @Test
  public void Test5() {
	  driver.get("https://www.lambdatest.com/blog/selenium-grid-setup-tutorial/");
  }
  @Test
  public void Test6() {
	  driver.get("https://dev.java/learn/java-language-basics/");
	  
  }
  @Test
  public void Test7() {
	  driver.get("");
	  
  }
  @Test
  public void Test8() {
	  driver.get("");
	  
  }
  @Test
  public void Test9() {
	  driver.get("");
	  
  }
  @Test
  public void Test10() {
	  driver.get("");
	  
  }
 
  
  
  @AfterMethod
  
  public void afterTest() { 
	  driver.quit(); 
  }
  
  }
  