package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.chrome.ChromeDriver;
 
public class Ejemplo_Selenium {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver(); // si requiere navegador Edge escribir EdgeDriver y darle Importar
		
		// Agregando espacio entre lineas
		driver.get("https://www.saucedemo.com/");
		
		//Obteniendo los objetos/WebElementes de la pagina Web
		WebElement userName =driver.findElement(By.id("user-name"));
		WebElement password =driver.findElement(By.id("password"));
		WebElement loginBtn =driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		Thread.sleep(2000); // retrasar la ejecución
		password.sendKeys("secret_sauce");
		Thread.sleep(2000); // retrasar la ejecución
		loginBtn.click();
		
		//Metodos del Explorador
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es:" + title);
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("La url actual es " + actualUrl);
		
		//Metodos de navegacion
		//driver.navigate().back();
		//Thread.sleep(2000); // retrasar la ejecución
		//driver.navigate().forward();
		//Thread.sleep(2000); // retrasar la ejecución
		//driver.navigate().refresh();
		
		
		//Verificar elemento desplegado en la pagina
		boolean isItemDisplayed = driver.findElement(By.xpath("//*[@class = 'inventory_item']")).isDisplayed();
		
		if(isItemDisplayed) {
			System.out.println("El elemento esta desplegado");
		}
		
		//Verificar el texto de un WebElement	
		String itemText = driver.findElement(By.className("inventory_item_name")).getText();
		
		if(itemText.contains("Sauce Labs Backpack")) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("ERROR el nombre del producto es incorrecto");
		}
		//>DropDowns
		Select prodCont = new Select(driver.findElement(By.className("product_sort_container")));
		prodCont.selectByValue("lohi");
		
		//FindElements
		List<WebElement> prodList = driver.findElements(By.className("inventory_item_name"));
		
		System.out.println("Numero de Elementos: " + prodList.size());
		
		String primerProd = prodList.get(0).getText();
		System.out.println(primerProd);
		
		driver.close(); // Cerrar la ultima ventana o pestañacon las que el driver interactuo
		//driver.quit(); //Cierra todas las ventanaas o pestañas que el driver abrio
	}

}
