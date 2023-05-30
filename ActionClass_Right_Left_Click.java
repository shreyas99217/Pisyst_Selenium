package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Right_Left_Click 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		try
		{
			WebDriver driver=null;
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments();
			WebDriverManager.chromedriver();
			System.setProperty("webdriver.http.factory","jdk-http-client");
			driver = new ChromeDriver();



			driver.get("https://demoqa.com/buttons");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			Actions act=new Actions(driver);

			WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
			act.contextClick(rightclick).perform();
			Thread.sleep(2000);

			WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
			act.doubleClick(doubleclick).perform();
			Thread.sleep(2000);

			driver.close();

		}
		catch(Exception e)
	     	{
			e.printStackTrace();		
			}


	}
}
