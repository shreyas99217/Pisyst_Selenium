package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdownDemo {

	public static void main(String[] args) 
	{
		
		try
		{
		WebDriver driver=null;
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments();
		WebDriverManager.chromedriver();
		System.setProperty("webdriver.http.factory","jdk-http-client");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("span[text()='From']")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		
	//	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
	//	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	//	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		from.sendKeys("Sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();		}

	}

}
