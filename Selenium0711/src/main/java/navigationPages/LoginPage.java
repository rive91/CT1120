package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicializiamos los webElement con PageFactory
											   //THIS es un keywoord con el que estamos indicando 
											   //que es la misma clase donde se inicializan los objetos
	}

	//Login PageObjects/WebElements
	@FindBy(id="txtUsername")
	private WebElement userNametxt;
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath="//*[@id=\"spanMessage\"]")
	private WebElement errorMessage;
	
	public void login(String user, String password) {
		userNametxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean incorrectLogin(String user, String password) {
		userNametxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		boolean msj = errorMessage.getText().contains("Invalid credentials");
		return msj;
	}
}
