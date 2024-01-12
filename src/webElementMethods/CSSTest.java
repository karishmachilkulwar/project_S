package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//CSS selectors
		//Tag and ID-->css=tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("Test@123");
		//Tag and Class -->css=tag.class
		//driver.findElement(By.cssSelector("div._6ltj")).click();
		//Tag and Attribute -->css=tag[attribute=value]
		//driver.findElement(By.cssSelector("button[name=login]")).click();
		
		
	}

}
