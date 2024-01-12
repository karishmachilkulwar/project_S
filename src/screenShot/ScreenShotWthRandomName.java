package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWthRandomName {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);

		RandomString s= new RandomString();
		String rs = s.make(4);
		File dest= new File("C:\\Users\\HP\\screenshot10100221911562389770"+rs+".png");

		FileHandler.copy(source, dest);
		

	}

}
