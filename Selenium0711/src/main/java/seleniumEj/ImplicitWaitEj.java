package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEj {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; //Seteand el Path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Identificando el .exe para driver
		WebDriver driver = new ChromeDriver();//Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://opensource-demo.orangehrmlive.com/");//Abriendo con la URL especificada
		driver.manage().window().maximize();//Maximizar Ventana
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Obteniendo objetos o webelements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		
		

	}

}
