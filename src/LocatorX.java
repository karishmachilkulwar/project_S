import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorX {

	public static void main(String[] args) throws InterruptedException {
		
	


				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.com/b/?_encoding=UTF8&node=21439846011&pd_rd_w=ctA0v&content-id=amzn1.sym.9e577b23-6413-4ce7-a6dc-ab2006bd6834&pf_rd_p=9e577b23-6413-4ce7-a6dc-ab2006bd6834&pf_rd_r=61EHCXBN5G84NY6GS40V&pd_rd_wg=hvWQJ&pd_rd_r=4927600c-e1fa-480a-ae2c-69250e4f5a2f");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
			}

		}

	


