package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

public class TC_03_Logout {
	
  //Declarar e inicializar un objeto del tipo WebDriver para usarlo en nuestra Test Class
  WebDriver driver = DriverSetup.setupDriver();
  
  //Login PageObject
  LoginPage login = new LoginPage(driver);
  DashboardPage dashboard = new DashboardPage(driver);
	  
  @BeforeTest
  public void startWebDriver() {
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
  }	
  
  @Test
  public void Tc_03() throws InterruptedException {
	  //Step 1: Login
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  
	  //Step 2: Logout
	  dashboard.logout();
  }
  
  @AfterTest
  public void closeDriver() {
	  CommonMethods.takeScreenshot(driver, "TC_03_Logout");
	  driver.quit();
  }
}
