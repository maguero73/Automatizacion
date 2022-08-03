package pruebaJuzgado;
// Generated by Selenium IDE
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



public class pruebaJuzgado {
	
	By registrerLinkLocator=By.linkText("Mis Servicios");
	
	
@Before
  

  public void setUp() {
  
    System.setProperty("webdriver.chrome.driver", "D:\\Descargas\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--ignore-certificate-errors");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://authhomo.afip.gob.ar/contribuyente_/login.xhtml");

  }
  
  
  @After //después
  public void tearDown() {
   // driver.quit();
  }
 
  @Test
  
  
  public void reliConsulta() throws InterruptedException {
	  
	    driver.findElement(By.id("F1:username")).sendKeys("20310607992");
	    driver.findElement(By.id("F1:btnSiguiente")).click();
	    driver.findElement(By.id("F1:password")).sendKeys("Mariano321");
	    driver.findElement(By.id("F1:btnIngresar")).click();
	    driver.findElement(By.cssSelector(".h6:nth-child(3) .web-only")).click();
	    Thread.sleep(5000);
	    //driver.findElement(By.cssSelector("html")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".col-lg-4:nth-child(16) .bold")).click();
	   // driver.findElement(By.xpath("//div[@class='media-body media-middle']/h2")).click();
	   // driver.findElement(By.xpath("//div[@class='media-body media-middle']/h2")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	  if (driver.findElement(By.xpath("//img[@src='frameworkAFIP/v1/img/logo_afip.png']")).isDisplayed()) {
		  driver.findElement(By.xpath("//div[@class='media-body media-middle']h2")).click();
	  }
	  else {
		  System.out.println("La imagen no fue encontrada en el Sitio");
	  }
		  
/*
    driver.findElement(By.id("rbUrbano")).click();
    driver.findElement(By.cssSelector(".well > .row > .col-md-10")).click();
    driver.findElement(By.cssSelector(".well > .row > .col-md-10")).click();
    driver.findElement(By.id("rbUrbano")).click();
    driver.findElement(By.id("rbSubLocacionSi")).click();
    driver.findElement(By.id("rbSubLocacionSi")).click();
    driver.findElement(By.id("rbInquilino")).click();
    driver.findElement(By.id("rbInquilino")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.cssSelector(".fa-plus")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".fa-plus"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtCuitResidente")).sendKeys("20310607982");
    driver.findElement(By.id("txtCuitResidenteRZ")).click();
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtCuitResidente")).sendKeys("20310607992");
    {
      WebElement element = driver.findElement(By.cssSelector(".modal-body > .row:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer-wait"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".modal-lg .modal-body:nth-child(2)")).click();
    driver.findElement(By.id("txtCuitResidenteRZ")).click();
    driver.findElement(By.id("btnAgregarLocador")).click();
    {
      WebElement element = driver.findElement(By.id("btnAgregarLocador"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    {
      WebElement element = driver.findElement(By.id("btnSiguiente"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("modalMensajeBtnContinuar")).click();
    
    */
  }
  
  private WebDriver driver;


}
