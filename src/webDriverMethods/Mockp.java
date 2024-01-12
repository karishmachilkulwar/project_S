package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mockp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//webdriver-interface with using webdriver interface
		driver.get("http://omayo.blogspot.com/");
		String code=driver.getPageSource();//return all code
		System.out.println(code);

	}

}
