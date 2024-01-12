import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		//click on log in button using x path with text
		//syntax-//tagname[@attribute name='attribute value']
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//using x path by contain
		//storing error msg in string "the email ------ log in"
		//syntax-//tagname[contains(text(),'partialtextvalue')]
		String error_msg=driver.findElement(By.xpath("//div[contains(text(),'The email address')]")).getText();
		System.out.println(error_msg);
		//enter a email id using contain with attributes
		//syntax-//tagname[contains(@attribute name.'attribute value)]
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("xyz@gmail.com");
		//translating the facebook login page langiuage into hindi using x path by index
		//syntax-(//tagname[attribute name='attribute value'])[index2]
		driver.findElement(By.xpath("(//a[@class='_sv4'])[2]")).click();
		driver.quit();
		
		
				
		
	}

}
