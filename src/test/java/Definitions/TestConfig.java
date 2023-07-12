package Definitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesFactory.PageFactory;
import io.cucumber.java.Before;

public class TestConfig {

	    public static WebDriver driver;
	    public static PageFactory pagesFactory;

	    @Before
	    public void setup() {
	        final String driverLocation = "src/main/resources/Drivers/chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", driverLocation);
	        driver = new ChromeDriver();
	        pagesFactory = new PageFactory(driver);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	        pagesFactory.pageconnexion.reachPage();
	    }
	    
}