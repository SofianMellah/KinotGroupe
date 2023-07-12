package KinotPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageProfil {
	
private WebDriver driver;
	
	public PageProfil(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
	
	@FindBy (xpath = "/html/body/div/div/div[1]/div/a[3]/div")
	private WebElement accederPageProfil;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[1]/button/svg")
	private WebElement accederModifProfil;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[2]/input")
	private WebElement inputPrenom;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[3]/input")
	private WebElement inputNom;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[4]/input")
	private WebElement inputEmail;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[5]/input")
	private WebElement inputDateDeNaissance;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[6]/input")
	private WebElement inputTelephone;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[7]/input")
	private WebElement inputRue;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[8]/input")
	private WebElement inputVille;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[9]/input")
	private WebElement inputCodePostal;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[10]/input")
	private WebElement inputPays;
	
	
	
	
}
