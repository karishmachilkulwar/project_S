package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		//switching focus from main page to Iframe
		driver.switchTo().frame("singleframe");
		String myTest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();

		System.out.println("text is --> "+myTest);

		//to work on main page--> we need to switch selenium focus from iframe to main page
		driver.switchTo().defaultContent();

		Thread.sleep(1000);
		WebElement button2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));

		System.out.println("Display status for button 2 is --> "+button2.isDisplayed());
	
	}

}
