package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Drag_Drop_2 {

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
			
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//WebElement fra= driver.findElement(By.xpath("//*[@id='content']/iframe"));
			WebElement fra= driver.findElement(By.xpath("//iframe[@ class='demo-frame']"));
			driver.switchTo().frame(fra);
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			Thread.sleep(2000);
			
			Actions act=new Actions(driver);
			act.dragAndDrop(drag, drop).perform();

			
			
			
			
			
			
		}
		catch(Exception e)
	     	{
			e.printStackTrace();		
			}


	}

}
