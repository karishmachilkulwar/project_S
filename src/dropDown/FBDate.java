package dropDown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBDate {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		//locator-->link text
		// driver.findElement(By.linkText("Create new account")).click();
		//locator-->partial link text
		driver.findElement(By.partialLinkText("new account")).click();
		Thread.sleep(1000);
		//How to handle drop down
		//selecting Date
		//1. Identify list box to be handled and store it in reference variable
		WebElement date = driver.findElement(By.id("day"));
		// 2. Create an object of Select class which will accept WebElement as argument
	    Select sDay= new Select(date);
		// 3. By using one of the select class methods we can select values form list box like
		//sDay.selectByIndex(4);
		//sDay.selectByValue("15");

		sDay.selectByVisibleText("15");
		System.out.println("=================for each ====================");

		List<WebElement> dates = sDay.getOptions();

		for(WebElement d:dates)
		{
		System.out.println(d.getText());
		}
		System.out.println("================= iterator ====================");
		Iterator<WebElement> itd = dates.iterator();
		while(itd.hasNext())
		{
		System.out.println(itd.next().getText());
		}

		System.out.println("================= List-iterator ====================");

		ListIterator<WebElement> li = dates.listIterator();

		while(li.hasNext())
		{
		System.out.println(li.next().getText());
		}
		System.out.println("================= for loop ====================");

		for(int i=0;i<=dates.size()-1;i++)
		{
		System.out.println(dates.get(i).getText());
		}

		System.out.println("=====================================");
		//selecting Month
		WebElement month = driver.findElement(By.id("month"));
		Select sMonth= new Select(month);
		sMonth.selectByIndex(7);
		//Selecting year
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sYear= new Select(year);
		sYear.selectByValue("1947");
		//to verify dropDown/List box is multiple select-able or not
		boolean result = sYear.isMultiple();
		System.out.println("Year multiple seletable status"+result);
	}

}
