package pruebaJuzgado;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Clock;
import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class pruebaContribuyente {

	private WebDriver driver;
	By usernameLocator = By.id("F1:username");
	By btnsiguienteLocator = By.id("F1:btnSiguiente");
	By passwordLocator = By.id("F1:password");
	By btningresarLocator = By.id("F1:btnIngresar");
	By mis_serviciosLocator = By.cssSelector(".h6:nth-child(3) .web-only");
	By relicontribuyenteLocator = By.cssSelector(".col-lg-4:nth-child(16) .bold");
	//By falsoelseLocator = By.xpath("//a[@id='27363591715']/div/div[2]/h3");
	By falsoelseLocator = By.xpath("//*[@id='27363591715']/div/div[2]/h3");
	//By falsoelseLocator = By.cssSelector(".row:nth-child(3) .col:nth-child(3) .panel .media-body .text-uppercase");
	
	@Before
	public void setUp() throws Exception {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\Descargas\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://authhomo.afip.gob.ar/contribuyente_/login.xhtml");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	
	@Test
	
	public void openNewTabUsingJS() throws InterruptedException {
		
		((JavascriptExecutor)driver).executeScript("windows.open()");
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		
	driver.findElement(usernameLocator).sendKeys("20310607992");
	driver.findElement(btnsiguienteLocator).click();
	driver.findElement(passwordLocator).sendKeys("Mariano321");
	driver.findElement(btningresarLocator).click();
	Thread.sleep(2000);
	driver.findElement(mis_serviciosLocator).click();
	Thread.sleep(5000);
	driver.findElement(relicontribuyenteLocator).click();
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='27363591715']/div/div[2]/h3")));
	//driver.close();
	driver.get("https://srvrome.homo.afip.gob.ar/fiscalizacion/reli/app/SelectUsuario.aspx");
	Thread.sleep(2000);
	driver.findElement(falsoelseLocator).click();
	
		
		
		
	}

	
	
	
}
