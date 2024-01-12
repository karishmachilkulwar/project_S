package fileuploading;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement click1 = driver.findElement(By.id("file-upload"));
		Actions a=new Actions(driver);
		a.moveToElement(click1).click().build().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\FileUpload.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		

	}

}
