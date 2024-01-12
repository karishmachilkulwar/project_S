package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableDropDownPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//verify tag name of dropdown/listbox is ->select
		//Identify list box to be handled and store it in reference variable
		WebElement multiselect1 = driver.findElement(By.id("multiselect1"));
		//create an object of select class which will accept WebElement as argument
		Select s=new Select(multiselect1);
		System.out.println("can we select multiple option ?"+s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(100);
		s.selectByValue("swiftx");
		Thread.sleep(100);
		s.selectByVisibleText("Audi");
		Thread.sleep(100);
		//deselect method
//		s.deselectByVisibleText("Volvo");
//		s.deselectByValue("audix");
//		s.deselectByIndex(1);
//		//select
//		s.selectByIndex(0);
//		s.selectByValue("swiftx");
//		s.selectByVisibleText("Audi");
		//At last by using deselectAll method ,will deselect all selected option
		//s.deselectAll();
	}

}
