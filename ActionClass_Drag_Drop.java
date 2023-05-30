package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Drag_Drop {

	public static void main(String[] args) {
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
			
			Actions act= new Actions(driver);
			
			WebElement Drag = driver.findElement(By.id("draggable"));
			
			WebElement Drop = driver.findElement(By.id("droppable"));
			Thread.sleep(2000);
			
			act.dragAndDrop(Drag, Drop).perform();	
			
			
		}
		catch(Exception e)
	     	{
			e.printStackTrace();		
			}


	}

}
