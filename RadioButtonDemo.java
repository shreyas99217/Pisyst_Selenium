package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

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
		driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));
		WebElement radio1 = driver.findElement(By.id("bookFlights"));
		
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		
		
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();		}
	}

}
