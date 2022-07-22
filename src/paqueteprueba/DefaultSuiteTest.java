package paqueteprueba;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
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
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
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
  public void iNQUILINO() {
    driver.get("https://authhomo.afip.gov.ar/contribuyente_/login.xhtml");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.id("F1:username")).sendKeys("20310607992");
    driver.findElement(By.id("F1:btnSiguiente")).click();
    driver.findElement(By.id("F1:password")).sendKeys("Mariano321");
    driver.findElement(By.id("F1:btnIngresar")).click();
    driver.findElement(By.linkText("Mis Servicios")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".col-lg-4:nth-child(16) .bold")).click();
    vars.put("win5108", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.findElement(By.cssSelector(".h6:nth-child(3) .web-only")).click();
    driver.switchTo().window(vars.get("win5108").toString());
    driver.findElement(By.cssSelector("#\\32 7363591715 .text-uppercase")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector("#divContratos .panel-heading")).click();
    driver.findElement(By.id("rbUrbano")).click();
    driver.findElement(By.id("modalMensajeBtnOK")).click();
    driver.findElement(By.id("rbUrbano")).click();
    driver.findElement(By.id("rbSubLocacionSi")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.id("rbLocador")).click();
    driver.findElement(By.id("rbEnNombrePropio")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.cssSelector("#btnNuevoAgregarLocador > .fa")).click();
    driver.findElement(By.id("rbResidenteNo")).click();
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtPorcLocacion")).sendKeys("100");
    driver.findElement(By.cssSelector("#footer-wait .col-md-12")).click();
    driver.findElement(By.id("btnAgregarLocador")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.cssSelector(".fa-plus")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.id("rbResidenteNo")).click();
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtCuitResidente")).sendKeys("27111141776");
    driver.findElement(By.id("btnAgregarInquilino")).click();
    driver.findElement(By.id("btnAgregarInquilino")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.id("txtCalle")).click();
    driver.findElement(By.id("txtCalle")).sendKeys("peron");
    driver.findElement(By.id("txtNumero")).sendKeys("777");
    driver.findElement(By.id("txtPiso")).sendKeys("6");
    driver.findElement(By.id("txtDepto")).sendKeys("C");
    driver.findElement(By.id("cboProvincia")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboProvincia"));
      dropdown.findElement(By.xpath("//option[. = 'BUENOS AIRES']")).click();
    }
    driver.findElement(By.id("cboPartido")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboPartido"));
      dropdown.findElement(By.xpath("//option[. = 'Lanus']")).click();
    }
    driver.findElement(By.id("cboLocalidad")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboLocalidad"));
      dropdown.findElement(By.xpath("//option[. = 'LANUS ESTE (1824)']")).click();
    }
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.id("rbMultipleDomicilioNo")).click();
    driver.findElement(By.id("cboTipoInmueble")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboTipoInmueble"));
      dropdown.findElement(By.xpath("//option[. = 'Casa']")).click();
    }
    driver.findElement(By.id("cboDestino")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboDestino"));
      dropdown.findElement(By.xpath("//option[. = 'Otros fines']")).click();
    }
    driver.findElement(By.id("btnSiguiente")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#dvFechaInicio .fa"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("dtpFechaFin")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) > .day:nth-child(5)")).click();
    driver.findElement(By.id("dtpFechaCelebracion")).click();
    driver.findElement(By.id("dtpFechaInicio")).click();
    driver.findElement(By.cssSelector(".fa-plus")).click();
    driver.findElement(By.id("rbModalidadDinero")).click();
    driver.findElement(By.id("cboFrecuenciaPago")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboFrecuenciaPago"));
      dropdown.findElement(By.xpath("//option[. = 'CUATRIMESTRAL']")).click();
    }
    driver.findElement(By.id("cboMedio")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboMedio"));
      dropdown.findElement(By.xpath("//option[. = 'EFECTIVO']")).click();
    }
    driver.findElement(By.id("cboTipoMoneda")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cboTipoMoneda"));
      dropdown.findElement(By.xpath("//option[. = 'Pesos Argentinos']")).click();
    }
    driver.findElement(By.id("txtValorMonedaElegida")).click();
    driver.findElement(By.id("txtValorMonedaElegida")).sendKeys("5000");
    driver.findElement(By.id("btnAgregarModalidad")).click();
    {
      WebElement element = driver.findElement(By.id("btnAdjuntar"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".col-md-4:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.id("btnAdjuntar"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("btnAdjuntar")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("btnAdjuntar")).click();
    driver.findElement(By.id("btnAdjuntar")).click();
    driver.findElement(By.id("btnAdjuntar")).sendKeys(Keys.ENTER);
    {
      WebElement element = driver.findElement(By.linkText("RELI_Creacion_contrato__Id_70320220610102033.pdf"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("files")).sendKeys(Keys.ENTER);
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.id("btnAdjuntar"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
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
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.cssSelector(".text-white:nth-child(2)")).click();
    driver.switchTo().window(vars.get("root").toString());
  }
}
