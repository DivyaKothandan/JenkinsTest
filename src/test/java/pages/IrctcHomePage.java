package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IrctcHomePage {

	 public static void loadURL(WebDriver wd, String url)
		{
			wd.get(url);
		}
		
		public static void enterUserName(WebDriver wd, String Username)
		{
			wd.findElement(By.xpath("id")).sendKeys(Username);
		}
		

	}


