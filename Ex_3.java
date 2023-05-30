package Pisyst_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		try
		{
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request.demo/");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		
		select.selectByValue("lavel1");
		
		select.selectByVisibleText("51 - 100 employees");
		
		select.deselectByIndex(5);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();		}
		
		

		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000); */
		
	}

}
