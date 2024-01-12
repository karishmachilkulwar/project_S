package coverFox_With_DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import misc.CommonlyUseMethodExcel;

public class CF_TC555_Validate_search_results_for_healthcare_policies2_UsingCommonMethods
{
	public static void main(String[] args) throws InterruptedException,EncryptedDocumentException, IOException
	{

	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.coverfox.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	CoverFoxHomePage home= new CoverFoxHomePage(driver);
	Thread.sleep(500);
	home.clickOnMaleButton();
	CoverFoxHealthPlanPage healthPlan= new CoverFoxHealthPlanPage(driver);
	Thread.sleep(500);
	healthPlan.clickOnNextButton();
	CoverFoxMemberDetailsPage membersDetails= new

	CoverFoxMemberDetailsPage(driver);
	Thread.sleep(1000);
	membersDetails.hanldeAgeDropDown(CommonlyUseMethodExcel.readDataFromExcel( 1, 0));

	Thread.sleep(1500);
	membersDetails.clickOnNextButton();
	CoverFoxAddressDetailsPage addressDetails= new

	CoverFoxAddressDetailsPage(driver);
	Thread.sleep(1500);

	addressDetails.enterPinCode(CommonlyUseMethodExcel.readDataFromExcel( 1, 1));

	Thread.sleep(1500);
	addressDetails.enterMobNum(CommonlyUseMethodExcel.readDataFromExcel( 1, 2));

	Thread.sleep(1500);
	addressDetails.clickOnContinueButton();
	CoverFoxHealthPlanResultsPage planResults= new

	CoverFoxHealthPlanResultsPage(driver);
	Thread.sleep(7000);
	planResults.validatePlanListWithResults();
	Thread.sleep(2000);
	driver.close();

	}
	}



