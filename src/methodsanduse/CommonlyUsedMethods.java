package methodsanduse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class CommonlyUsedMethods {
	

		 //Create method which we used most 
		//reading data from excel
		//taking screenshot
		//scrolling
		//waiting
		
		//Will use static method : because if we use non-static method then I need to create object of that method each time 
		
		public static void takesScreenshot(WebDriver driver,String fileName) throws IOException
		{
			//Now for takesScreenshot method we need the driver to type caste
			//So will provide driver as a parameter to the method 
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Here we need to provide name to screenshot , so we know that screenshot name should not same 
			//That's why will pass Parameter String 
			File dest=new File("C:\\Users\\HP\\Desktop\\"+fileName+".png");
			FileHandler.copy(src, dest);
			
		}
		
		//Specific screenshot
		public static void takesScreenshot(WebDriver driver,String fileName,WebElement element) throws IOException
		{
			File src = element.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\HP\\Desktop\\Screenshots\\"+fileName+".png");
			FileHandler.copy(src, dest);
		}
		
		//fullScreenshot
		public static void takesScreenshot(String fileName,WebDriver driver1) throws IOException
		{
			File src = ((FirefoxDriver) driver1).getFullPageScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\HP\\Desktop\\Screenshots\\"+fileName+".png");
			FileHandler.copy(src, dest);
		}
		public static void scrolling(WebDriver driver, WebElement element)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			implicitlywait(driver, 5);
			js.executeScript("arguments[0].scrollIntoView();",element);
		}
		
		public static void implicitlywait(WebDriver driver,int time)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}
		
		 public static void solidborder(WebDriver driver,WebElement ele)
		 {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].style.border='3px solid green'", ele); 
		 }
		 public static void dottedborder(WebDriver driver,WebElement ele)
		 {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].style.border='3px dotted green'", ele); 
		 }
		 
		 //Excel data reading
		 
		 public static String exceldata(int row,int column) throws IOException
		 {
			 FileInputStream myFile=new FileInputStream("C:\\Users\\HP\\Desktop\\poi-bin-5.2.3-20220909.xlsx");
			 Sheet myWorkbook = WorkbookFactory.create(myFile).getSheet("Sheet1");
			 String data = myWorkbook.getRow(row).getCell(column).getStringCellValue();
			 return data;
			 
			 
		 }
		 //handle drop down
		 public static void selectdob(WebElement element,String visibleText)
		 {
			 Select s1=new Select(element);
			 s1.selectByVisibleText(visibleText);
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		//Excel handling
		public static void excels(String path, String sheet) throws IOException
		{
			FileInputStream fs=new FileInputStream(path);
			Sheet s1 = WorkbookFactory.create(fs).getSheet(sheet);
		    int r1 = s1.getLastRowNum();
		    short c1 = s1.getRow(0).getLastCellNum();
		    
		    for(int i=0;i<=r1;i++)
		    {
		    	for(int j=0;j<c1;j++)
		    	{
		    		CellType datatype=null;
		    		
		    		try {
		    			datatype = s1.getRow(i).getCell(j).getCellType();
						
						} 
		    		catch (Exception e) 
		    			{
						System.out.print("null");
						continue;   
		    			}
		    		switch (datatype)
		    		{
					case STRING: 
					{
						System.out.print(s1.getRow(i).getCell(j).getStringCellValue()+" ");
						break;
					}
					case NUMERIC:
					{
						System.out.print(s1.getRow(i).getCell(j).getNumericCellValue()+" ");
						break;
					}
					case BOOLEAN: 
					{
						System.out.print(s1.getRow(i).getCell(j).getBooleanCellValue()+" ");
						break;
					}
					}	
		    	}
		    	System.out.println();
		    }
		}
		
	}



