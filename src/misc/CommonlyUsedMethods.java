package misc;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods {

	//reading data from excel
	//taking screenshot
	//scrolling
	//waiting
	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\HP\\ScreenShots\\"+fileName+".png");
	FileHandler.copy(src, dest);
	}

	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	implicitWait(driver, 10);
	js.executeScript("arguments[0].scrollIntoView();",element );
	}
	public static void implicitWait(WebDriver driver, int time)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

}
