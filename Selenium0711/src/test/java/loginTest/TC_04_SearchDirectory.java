package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_04_SearchDirectory {

	// Declarar e inicializar un objeto del tipo WebDriver para usarlo en nuestra
	// Test Class
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_04() {
		//Step 1: Login
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		
		//Step 2: Click En Directory
		dashboard.clickMenuDirectory();
		
		//Step 3: Fill name
		directory.searchByName("Nathan");
		
		//Step 4: Select Job title
		directory.selectJobTitle("Sales Representative");
		
		//Step 5: Select Location
		directory.selectLocation("  United States");
		
		//Step 6: Click Search
		directory.clickSearchBtn();
		
		//Validacion
		boolean isUserPresent = directory.verifySearchNameResult("Nathan");
		Assert.assertTrue(isUserPresent);
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
