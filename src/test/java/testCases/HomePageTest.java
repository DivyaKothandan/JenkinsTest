package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.IrctcHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTest {

		
		 WebDriver wd;
			
			@Given ("^Open Browser$")
			public void openBrowser()
			{
				System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
					wd=new ChromeDriver();
					
			}
			
			@Then ("^Enter Url$")
			public void EnterUrl()
			{
				//IrctcHomePage.loadURL(wd, url);
				
				wd.get("http://www.irctc.com/");
				
			}
			
			@Then("^validating the home page$")
			public void Validation() {
				wd.quit();
				System.out.println("Test Case Ended");
			}
			
			@Then("^validtion part$")
			public void validation2() {
				System.out.println("Testing");
			}

	}

