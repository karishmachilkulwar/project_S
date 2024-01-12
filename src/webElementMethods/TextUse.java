package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.naukri.com/");
		//Thread.sleep(100);
		//String expResult="Find your dream job now";
		//String actualResult = driver.findElement(By.className("qsb-title")).getText();
		//System.out.println(actualResult);
		// WebElement myElement = driver.findElement(By.className("qsb-title"));
//		if(expResult.equals(actualResult))
//		{
//		System.out.println("Text is matching, TC is passed");
//		}
//		else {
//		System.out.println("Text is not matching, TC is failed");
//		}
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String expResult="Facebook helps you connect and share with the people in your life.";
		String actualResult=driver.findElement(By.className("_8eso")).getText();
		System.out.println(actualResult);
	    WebElement myElement = driver.findElement(By.className("_8eso"));
		if(expResult.equals(actualResult))
		{
		System.out.println("Text is matching, TC is passed");
		}
		else {
		System.out.println("Text is not matching, TC is failed");
		}
		
		
		
		
		
		
		

	
	}

	
		


	}

