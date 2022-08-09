package reliContribuyente;

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
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
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
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
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

public class D_Alquiler_Temporario_Inmuebles_Rural {

	private WebDriver driver;
	By usernameLocator = By.id("F1:username");
	By btnsiguienteLocator = By.id("F1:btnSiguiente");
	By passwordLocator = By.id("F1:password");
	By btningresarLocator = By.id("F1:btnIngresar");
	By mis_serviciosLocator = By.cssSelector(".h6:nth-child(3) .web-only");
	By relicontribuyenteLocator = By.cssSelector(".col-lg-4:nth-child(16) .bold");
	//By falsoelseLocator = By.xpath("//a[@id='27363591715']/div/div[2]/h3");
	By contribuyente0_Locator = By.xpath("//*[@id=\"ContentPlaceHolder1_divYoMismoSI\"]/a/div/div[2]/h2");
	By contribuyente1_Locator = By.xpath("//*[@id='27363591715']/div/div[2]/h3");
	By contribuyente2_Locator = By.xpath("//*[@id='20083666413']/div/div[2]/h3");
	By contribuyente3_Locator = By.xpath("//*[@id='20132118990']/div/div[2]/h3");
	By contribuyente4_Locator = By.xpath("//*[@id='20174314404']/div/div[2]/h3");
	
	//By falsoelseLocator = By.cssSelector(".row:nth-child(3) .col:nth-child(3) .panel .media-body .text-uppercase");
	By decla_contratoLocator = By.xpath("//*[@id=\"simple\"]");
	By btn_contrato_nuevoLocator = By.id("modalMensajeBtnOK");
	//By adjunto_pageLocator = By.xpath("//*[@id=\"tbArchivo\"]/tbody/tr/td[1]/div/a");
	By adjunto_pageLocator = By.xpath("//*[@id=\"btnAdjuntar\"]");
	By descargarLocator = By.xpath("//*[@id=\"btnDescargar\"]/a/span[2]");
	
	
	
	@Before
	public void setUp() throws Exception {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\Descargas\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.navigate().to("https://authhomo.afip.gob.ar/contribuyente_/login.xhtml");     
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.keyPress(KeyEvent.VK_T);
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		//robot.keyRelease(KeyEvent.VK_T);

	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	
	@Test
	public void test() throws InterruptedException {
	
	//URL	
	driver.get("https://authhomo.afip.gov.ar/contribuyente_/login.xhtml");	
	
	///////////////////////////////////////////////////////////
	//Datos de Seguridad AFIP Mis Servicios
	driver.findElement(usernameLocator).sendKeys("20310607992");
	driver.findElement(btnsiguienteLocator).click();
	driver.findElement(passwordLocator).sendKeys("Mariano321");
	driver.findElement(btningresarLocator).click();
	Thread.sleep(2000);
	driver.findElement(mis_serviciosLocator).click();
	Thread.sleep(2000);
	driver.findElement(relicontribuyenteLocator).click();
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='27363591715']/div/div[2]/h3")));
	//driver.close();
	driver.get("https://srvrome.homo.afip.gob.ar/fiscalizacion/reli/app/SelectUsuario.aspx");
	Thread.sleep(2000);
	
	/////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	
	//CAMBIO DE FOCO DE TABS CHROME
	
    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    driver.close();
    driver.switchTo().window(tabs2.get(0));
	
    /*
	((JavascriptExecutor)driver).executeScript("alert('Test')");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
	Thread.sleep(2000);
	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
	driver.findElement(By.linkText("https://srvrome.homo.afip.gob.ar/fiscalizacion/reli/app/SelectUsuario.aspx")).sendKeys(selectLinkOpeninNewTab);
	*/
    
    //INGRESO CON CUIT CONTRIBUYENTE HOMO 
	driver.findElement(contribuyente0_Locator).click();
	Thread.sleep(2000);
	driver.get("https://srvrome.homo.afip.gob.ar/fiscalizacion/reli/app/contrato/DeclaracionContrato.aspx");
	Thread.sleep(2000);
	driver.findElement(decla_contratoLocator).click();
	Thread.sleep(2000);
	if(driver.findElement(btn_contrato_nuevoLocator).isDisplayed())
	driver.findElement(btn_contrato_nuevoLocator).click();
	else
	Thread.sleep(500);
	
	//Alquiler temporario de bienes Inmuebles Rurales o Urbanos
	driver.findElement(By.id("rbTuristico")).click();
   // driver.findElement(By.id("modalMensajeBtnOK")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("rbTuristicoRural")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("rbSubLocacionSi")).click();
    Thread.sleep(1000);
   // driver.findElement(By.id("btnSiguiente")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("rbLocador")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("rbEnNombrePropio")).click();
    driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.cssSelector("#btnNuevoAgregarLocador > .fa")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("rbResidenteNo")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("txtCuitResidente")).click();
    Thread.sleep(1000);
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
  //  driver.findElement(By.id("btnSiguiente")).click();
    driver.findElement(By.id("rbResidenteNo")).click();
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtCuitResidente")).click();
    driver.findElement(By.id("txtCuitResidente")).sendKeys("27111141776");
    driver.findElement(By.id("btnAgregarInquilino")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("btnAgregarInquilino")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("btnSiguiente")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("btnSiguiente")).click();
    Thread.sleep(2000);
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
      Thread.sleep(1000);
    }
    driver.findElement(By.id("btnSiguiente")).click();
    Thread.sleep(1000);
 
    driver.findElement(By.id("rbAfectadoProduccionAgricolaSi")).click();
    
    {
      WebElement element = driver.findElement(By.cssSelector("#dvFechaInicio .fa"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(1000);
   // driver.findElement(By.id("dtpFechaFin")).click();
   // Thread.sleep(1000);
   // driver.findElement(By.cssSelector("tr:nth-child(4) > .day:nth-child(5)")).click();
    driver.findElement(By.id("dtpFechaCelebracion")).click();
    driver.findElement(By.id("dtpFechaInicio")).click();
    driver.findElement(By.id("txtDuracionDias")).sendKeys("60");
    driver.findElement(By.cssSelector(".fa-plus")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("rbModalidadDinero")).click();
    Thread.sleep(1000);
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
    Thread.sleep(1000);
    
    driver.findElement(By.id("btnAgregarModalidad")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("btnAgregarModalidad")).click();
    
    
   // driver.findElement(By.cssSelector(".col-md-4:nth-child(2)")).click();
    Thread.sleep(1000);

    
///////////////////////// UPLOAD FILE ////////////////////////////////    
		//File primer_file= new File("D:\\DATOS\\Laboral\\Funcional\\RELI\\RELI_Modificacion_Adenda2__Id_22720210319115339.pdf");
    
		
		//upload_file.sendKeys("D:\\DATOS\\Laboral\\Funcional\\RELI\\RELI_Modificacion_Adenda2__Id_22720210319115339.pdf");
  //HACE CLIC EN BOTON ADJUNTAR
    WebElement upload = driver.findElement(adjunto_pageLocator);
    upload.click();
    Thread.sleep(1000);
  
  //AUTOCOMPLETAMOS CON PATH Y ENTER VENTANA EMERGENTE DE WINDOWS UPLOAD  
    try {
    	String[] commands = new String[]{}; // Location of the autoit executable
    	commands = new String[] {"D:\\DATOS\\PhotoUpload.exe"};
    	Runtime.getRuntime().exec(commands);
    	}
    catch (IOException e) {}
    

    
    
    /*
        remoteWebDriver.setFileDetector(new LocalFileDetector());
        wd = remoteWebDriver;
		
		String currPath = System.getProperty("user.dir");
		File imgFile = new File(currPath + "D:\\DATOS\\Laboral\\Funcional\\RELI\\RELI_Modificacion_Adenda2__Id_22720210319115339.pdf");
		upload.sendKeys(imgFile.getAbsolutePath());
		
	*/	
		System.out.println("File is Uploaded Successfully");
		/*
		try {
			Runtime.getRuntime().exec("D:\\DATOS\\AutoUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		//driver.get("https://the-internet.herokuapp.com/upload");
	   // Thread.sleep(1000);
		
		
	//	driver.findElement(By.id("file-upload")).sendKeys(path);
		//driver.findElement(By.id("file-submit")).click();
		
		
		Thread.sleep(3000);
		
////////////////////////////// ///////////////////////////////		
	//	String text = driver.findElement(By.id("uploaded-files")).getText();
	//	assertEquals("RELI_Modificacion_Adenda2__Id_22720210319115339.pdf", text);		
		
//if (driver.findElement(adjunto_pageLocator).isDisplayed()){
	
//	System.out.println("El fichero se adjunto correctamente");
//}
		



   // driver.findElement(By.id("btnSiguiente")).click();
    //Thread.sleep(1000);
	
    driver.findElement(By.id("btnSiguiente")).click();
    Thread.sleep(3000);
    //driver.findElement(By.cssSelector(".text-white:nth-child(2)")).click();
   // driver.switchTo().window(vars.get("root").toString());
    
    driver.findElement(By.id("btnSiguiente")).click();
    Thread.sleep(2000);
    driver.findElement(descargarLocator).click();
    
  }

		
}		
		


	
	

