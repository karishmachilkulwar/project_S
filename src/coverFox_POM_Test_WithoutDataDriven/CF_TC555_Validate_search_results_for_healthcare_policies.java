package coverFox_POM_Test_WithoutDataDriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CF_TC555_Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
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
		Thread.sleep(500);
		membersDetails.hanldeAgeDropDown();
		membersDetails.clickOnNextButton();
		CoverFoxAddressDetailsPage addressDetails= new

		CoverFoxAddressDetailsPage(driver);
		Thread.sleep(500);
		addressDetails.enterPinCode();
		addressDetails.enterMobNum();
		addressDetails.clickOnContinueButton();
		CoverFoxHealthPlanResultsPage planResults= new

		CoverFoxHealthPlanResultsPage(driver);
		Thread.sleep(7000);
		planResults.validatePlanListWithResults();
		Thread.sleep(2000);
		driver.close();
		

	}

}
