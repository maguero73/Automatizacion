package pruebaJuzgado;

import java.time.Clock;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class WebDriverWait {

	  private static final long DEFAULT_SLEEP_TIMEOUT = 0;

	public WebDriverWait(WebDriver driver, Duration timeout) {
		    this(
		        driver,
		        timeout,
		        Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT),
		        Clock.systemDefaultZone(),
		        Sleeper.SYSTEM_SLEEPER);
		  }

	public WebDriverWait(WebDriver driver, Duration timeout, Duration ofMillis, Clock systemDefaultZone,
			Sleeper systemSleeper) {
		// TODO Auto-generated constructor stub
	}
	
}	
