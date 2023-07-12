package KinotPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageConnexion {
	
	private WebDriver driver;
	
	public PageConnexion(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
	
	@FindBy (xpath = "/html/body/div/div/main/div/div/div[2]/div/form/div[1]/div[1]/input")
	private WebElement connexionEmail;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div/div[2]/div/form/div[1]/div[2]/input")
	private WebElement connexionMDP;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div/div[2]/div/form/div[3]/button")
	private WebElement seConnecter;
	
	
	
	public void seConnecter(String email, String mdp){
		connexionEmail.sendKeys(email);
		connexionMDP.sendKeys(mdp);
		seConnecter.click();
	}
	
	public void reachPage() {
        driver.get("https://kinot-test.insy2s.com/login");
    }
}
