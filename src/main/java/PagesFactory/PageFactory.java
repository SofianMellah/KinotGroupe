package PagesFactory;

import org.openqa.selenium.WebDriver;

import KinotPages.PageAccueil;
import KinotPages.PageConnexion;
import KinotPages.PageProfil;

public class PageFactory {
	
	public WebDriver driver;
	public PageAccueil pageaccueil;
	public PageProfil pageprofil;
	public PageConnexion pageconnexion;
	
	public PageFactory(WebDriver driver) {
		this.driver = driver;
		pageaccueil = new PageAccueil(driver);
		pageprofil = new PageProfil(driver);
		pageconnexion = new PageConnexion(driver);
		
	}
}
