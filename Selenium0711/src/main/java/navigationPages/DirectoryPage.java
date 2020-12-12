package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {

	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// DashboardObjects
	@FindBy(id = "searchDirectory_emp_name_empName")
	private WebElement inputEmployeeName;
	@FindBy(id = "searchDirectory_job_title")
	private WebElement drpDwnJobTitle;
	@FindBy(id = "searchDirectory_location")
	private WebElement drpDwnLocation;
	@FindBy(id = "searchBtn")
	private WebElement btnSearch;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement nameSearchResult;
	
	public void searchByName(String name) {
		inputEmployeeName.sendKeys(name);
	}
	
	public void selectJobTitle(String jobtitle) {
		Select oSelect = new Select(drpDwnJobTitle);
		oSelect.selectByVisibleText(jobtitle);
	}
	
	public void selectLocation(String location) {
		Select oSelect = new Select(drpDwnLocation);
		oSelect.selectByVisibleText(location);
	}
	
	public void clickSearchBtn() {
		btnSearch.click();
	}
	
	public boolean verifySearchNameResult(String expectedName) {
		return nameSearchResult.getText().contains(expectedName);
	}
}
