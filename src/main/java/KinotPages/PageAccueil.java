package KinotPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil {
	
	private WebDriver driver;
	
	public PageAccueil(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
	
	@FindBy (xpath = "/html/body/div/div/div[1]/div/a[3]/div")
	private WebElement accederPageProfil;
	
	
	public void accederPageProfil() {
		accederPageProfil.click();
	}
}
