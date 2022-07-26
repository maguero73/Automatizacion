package reliConsultaTest;
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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;



public class reliConsultaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  int segundosAEsperar = 10;
  JavascriptExecutor js;
  @Before
  public void setUp() {
  
    //js = (JavascriptExecutor) driver;
    //vars = new HashMap<String, Object>();
    System.setProperty("webdriver.chrome.driver", "/home/mariano/Downloads/Selenium Libraries/chromedriver");
    driver = new ChromeDriver();
  }
  @After
  public void tearDown() {
   // driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void reliConsulta() throws InterruptedException {
    driver.get("https://auth.afip.gob.ar/contribuyente_/login.xhtml");
    driver.manage().window().setSize(new Dimension(1294, 741));
    driver.findElement(By.id("F1:username")).sendKeys("20310607992");
    driver.findElement(By.id("F1:btnSiguiente")).click();
    driver.findElement(By.id("F1:password")).sendKeys("M4r14n0w23");
    driver.findElement(By.id("F1:btnIngresar")).click();
    driver.findElement(By.xpath("//span[contains(.,' Mis Servicios')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//h4[contains(.,\'RELI-CONTRIBUYENTE\')]")).click();
    vars.put("win272", waitForWindow(2000));
    driver.switchTo().window(vars.get("win272").toString());
    driver.findElement(By.cssSelector("#divContratos .panel-heading")).click();
    driver.findElement(By.id("modalMensajeBtnOK")).click();
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
  }
}
