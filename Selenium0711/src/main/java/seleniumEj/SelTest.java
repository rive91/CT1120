package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		System.out.println("prueba");
		
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; //Seteand el Path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Identificando el .exe para driver
		WebDriver driver = new ChromeDriver();//Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//Abriendo con la URL especificada

	}

}
