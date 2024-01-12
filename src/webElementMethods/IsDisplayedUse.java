package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//click on hide button
//		driver.findElement(By.id("hide-textbox")).click();
//		boolean result1 = driver.findElement(By.name("show-hide")).isDisplayed();
//		System.out.println("Displayed status is "+result1);
//		//Thread.sleep(2000);)
		//click on show button
		boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println("Displayed status is "+result);
		Thread.sleep(2000);
		//click on text box
		
		driver.findElement(By.name("show-hide")).sendKeys("good morning");
		
		
	}

}
