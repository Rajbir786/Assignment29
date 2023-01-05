package naveenAutomationAssignment.Base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;
import naveenAutoMationAssignmnetBrowser.Browser;

public class TestBase {
	
	public static WebDriver driver;
	 public Browser DEFAULT_BROWSER=Browser.GOOGLE_CHROME;
	
		Actions action;



		public void launchBrowser() {
	
			
			switch(DEFAULT_BROWSER.getName())
			{
			case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
				
				
				break;
			case "edge":
				WebDriverManager.firefoxdriver().setup();
				driver=new EdgeDriver();
				
				break;
			case "firefox":
				WebDriverManager.edgedriver().setup();
				driver=new FirefoxDriver();
				
				break;
				default:
					System.out.println("invalid browser");
					break;
					
					// load webpage
				// navigation to page

		
		
			}
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajbir\\drivers\\chromedriver.exe");
			// intialise webdriver instance.
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			
			//Manage the page load timeout
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			//Manage the script load timeout
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

			// load webpage
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");// navigation to page

		}

		public void quitBrowser() {
			// closing the browser
			driver.close();
		}

	}



