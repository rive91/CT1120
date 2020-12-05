package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosSelenium {

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
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(5000);
		
		//Metoddos del explorador
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//Validacion HomePage
		String urlDashboard = driver.getCurrentUrl();
		boolean loginCorrect = urlDashboard.contains("/dashboard");//Contains es un metodo de java que verifica si un Stiring contiene otro String y regresa booleano
		
		if(loginCorrect) {
			System.out.println("Login correcto");
		}else {
			System.out.println("Login incorrecto");
		}
		
		//Metodos de navegacion
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//Cerrar Navegador web
		driver.close();//Cierra la ventana actual que el webDriver esta utilizando
		driver.quit();//Cierra todas las ventanas del navegador que el webdriver ah abierto

	}

}
