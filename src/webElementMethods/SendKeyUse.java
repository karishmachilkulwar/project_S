package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velocity@vctcpune.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velocity123@vctcpune.com");
		
		//locator--> id
		//driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		//locator-->
		//driver.findElement(By.name("email")).sendKeys("Testing@gmail.com");
		//Thread.sleep(1000);
		//driver.findElement(By.name("email")).clear();
		}
		
	
		
	}


