package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFramesNew {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);

		String mainPageText1 = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();

		System.out.println("text on main page is "+mainPageText1);

		driver.switchTo().frame("frame1");
		//switching selenium focus from main page to frmae1(outer frame)

		//writing in text box present in outer frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Practice");
		Thread.sleep(1000);
		//switching focus from outer frame to inner frame
		driver.switchTo().frame("frame3");
		//checking check box
		Thread.sleep(1000);

		driver.findElement(By.id("a")).click();

		//clearing text from parent frame(outer frame/ frame1) textBox

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();

		//want to handle drop down from another frame
		// need to switch selenium focus outer frame to main page--> then main to another frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		WebElement animalsDropDown = driver.findElement(By.id("animals"));

		Select s= new Select(animalsDropDown);
		s.selectByIndex(1);

		driver.switchTo().defaultContent();// getting text from main page

		String mainPageText2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();

		System.out.println("Text on main page is "+mainPageText2);
		
	}

}
