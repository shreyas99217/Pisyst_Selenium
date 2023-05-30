package Pisyst_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex_2 {

	public static void main(String[] args)
	{
		try
		{
	    WebDriver driver=null;
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory","jdk-http-client");
		driver = new ChromeDriver();
		driver.get ("https://www.flipkart.com/");
		}
		catch(Exception e)
		{
			e.printStackTrace();		}
	}

}

