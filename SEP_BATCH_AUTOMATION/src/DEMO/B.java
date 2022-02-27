package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();\
		driver.get("");
		
		//ul[@class="nav navbar-nav"]/li[3]
	}

}
