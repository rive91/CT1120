package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ResolucionEjercicio {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; //Seteand el Path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Identificando el .exe para driver
		WebDriver driver = new ChromeDriver();//Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://opensource-demo.orangehrmlive.com/");//Abriendo con la URL especificada
		driver.manage().window().maximize();//Maximizar Ventana
		
		//Obteniendo objetos o webelements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(3000);
		
		//Click en Directory
		WebElement directoryMenu = driver.findElement(By.id("menu_directory_viewDirectory"));
		directoryMenu.click();
		
		//Buscar "Nathan"
		WebElement nameTxtbox = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		nameTxtbox.sendKeys("Nathan");
		
		//Seleccionar Job title
		Select jobTitleDrpDwn = new Select(driver.findElement(By.id("searchDirectory_job_title")));
		jobTitleDrpDwn.selectByVisibleText("Sales Representative");
		
		//Seleccionar location
		Select locationDrpDwn = new Select(driver.findElement(By.id("searchDirectory_location")));
		locationDrpDwn.selectByVisibleText("  United States");
		
		//Click en Search
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		
		//Verificacion el nombre
		String nameSearchResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
		boolean nameEquals = nameSearchResult.equals("Nathan Elliot");
		
		if (nameEquals) {
			System.out.println("Expected name is present");
		}else {
			System.out.println("Expected name is NOT present");

		}


	}

}
