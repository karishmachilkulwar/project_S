package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
				
		driver.manage().window().maximize();
	//	driver.get("https://auth.discoveryplus.in/login");
//		Thread.sleep(1000);
//		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
//		boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
//		System.out.println("get OTP button status is "+result);

		driver.get("https://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
		Thread.sleep(1000);
		driver.findElement(By.id("inputPnrNo")).sendKeys("8109542991");
		//boolean result1 = driver.findElement(By.xpath("(//input[@type='button'])[2]")).isEnabled();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		//System.out.println("get submit button status is "+result1);
		
		//enable disable button click hota hai ya nahi check krt hai..if button clicked i.e. enable or not 
		//i.e disable if button is disable that tym we have to type somthing and thrn perform action
		

	
		
		
	}

}
