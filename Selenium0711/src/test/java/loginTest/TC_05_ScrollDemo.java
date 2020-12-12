package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_05_ScrollDemo {
	// Declarar e inicializar un objeto del tipo WebDriver para usarlo en nuestra
	// Test Class
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_05() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		dashboard.scrollToLastLeaveRequest(driver);
		
	}

	@AfterTest
	public void closeDriver() {
		//driver.quit();
	}
}
