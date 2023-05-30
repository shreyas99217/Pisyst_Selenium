package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo {

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
		driver.get("https://www.sugarcrm.com/request.demo/");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.id("doi0"));
		Actions actions = Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		driver.findElement(By.name("interest_market_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("interest_market_c")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();		}

	}

	private static Actions Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
