import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		//driver. findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		//driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai");
		
		//driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		//syntax-//tagname[@attribute name='attribute value']-> xpath by attribute
		//syntax-//tagname[text()='textvalue']-> xpath by text
		driver.findElement(By.xpath(("(//input[@type='text'])[2]"))).sendKeys("banglore");
		//syntax-//tagname[@attribute name='attribute value'])[2]-> xpath by index
		
	}

}
