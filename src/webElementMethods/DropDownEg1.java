package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		//drop down
		//web element--> Interface
		//1.find element
		WebElement dropDownField = driver.findElement(By.id("dropdown-class-example"));
		//2.object creation
		Select s=new Select(dropDownField);//class
		//3.whatever value we want that value type in select
		s.selectByValue("option2");//method->non-static method
	}

}
