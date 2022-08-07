package com.uploadfile;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFileClass {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Descargas\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	@Test
	public void test() {
		
		File primer_file= new File("D:\\DATOS\\Laboral\\Funcional\\RELI\\CONTRATO1.pdf");
		
		String path = primer_file.getAbsolutePath();
		
		driver.get("https://srvrome.homo.afip.gob.ar/fiscalizacion/reli/app/contrato/DatosContrato.aspx");
		
		driver.findElement(By.id("btnAdjuntar")).sendKeys(path);
		
		
		
	}
}

