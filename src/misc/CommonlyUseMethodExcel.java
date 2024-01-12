package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUseMethodExcel 
{
	//reading data from excel
	//taking screenshot
	//scrolling
	//waiting
	public static void takeScreenshot(WebDriver driver, String fileName) throws
	IOException
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

	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException,FileNotFoundException
	{
	//FileInputStream myFile= new FileInputStream("C:\\Users\\HP\\Desktop\\excel\\Book3.xlsx");
	FileInputStream myFile1= new FileInputStream("C:\\Users\\HP\\Desktop\\excel\\coverfoxdata.xlsx");


	//Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	Sheet mySheet1 = WorkbookFactory.create(myFile1).getSheet("coverfoxdata");
	String value = mySheet1.getRow(row).getCell(cell).getStringCellValue();
	return value;

	
	}


	

	
	}

