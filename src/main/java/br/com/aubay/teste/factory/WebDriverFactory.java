package br.com.aubay.teste.factory;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverFactory {

	final static Logger log = LoggerFactory.getLogger(WebDriverFactory.class);

	public WebDriver getWebDriver(BrowserEnum browser) {
		WebDriver driver = null;

		switch (browser) {
		case Chrome:
			//HashMap<String, Object> chromePrefes = new HashMap<String, Object>();
			//chromePrefes.put("profile.default_content_settings.popups", 0);
			//chromePrefes.put("download.prompt_for_download", "true");
			//ChromeOptions chromeOptionsLocal = new ChromeOptions();
			//chromeOptionsLocal.setExperimentalOption("prefs", chromePrefes);
			//chromeOptionsLocal.addArguments("chrome.switches", "--disable-extensions");
			//chromeOptionsLocal.addArguments("--start-maximized");
			//chromeOptionsLocal.addArguments("disable-infobars");
			//chromeOptionsLocal.setHeadless(true);
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			//DesiredCapabilities cap = DesiredCapabilities.chrome();
			//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			//cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsLocal);
			//Analisar essa linha...esta dando erro para instanciar o driver do chrome
			//driver = new ChromeDriver(cap);
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			break;
		case Firefox:
			FirefoxOptions firefoxOptionsLocal = new FirefoxOptions();
			// firefoxOptions.setHeadless(true);
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			break;
		case InternetExplorer:
			System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			break;
		default:
			System.out.println("Browser Invalido!");
			break;
		}
		return driver;
	}
}