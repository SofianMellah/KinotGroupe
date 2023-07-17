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
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[1]/button")
	private WebElement accederModifProfil;
	
	@FindBy (xpath = "/html/body/div/div/main/div/div[1]/form/div/div[2]/input")
	public WebElement inputPrenom;
	
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
	
	
	
	public void accederModificationProfil() {
		accederModifProfil.click();
	}

	public void modifierInputPrenom(String prenom) throws InterruptedException {
		Thread.sleep(1000);
		inputPrenom.clear();
		Thread.sleep(1000);
		inputPrenom.sendKeys(prenom);
	}
	
	public void modifierInputNom(String nom) {
		inputNom.clear();
		inputNom.sendKeys(nom);
	}
	
	public void modifierInputEmail(String email) {
		inputEmail.clear();
		inputEmail.sendKeys(email);
	}
	
	public void modifierInputDateDeNaissance(String dateDeNaissance) {
		inputDateDeNaissance.clear();
		inputDateDeNaissance.sendKeys(dateDeNaissance);
	}
	
	public void modifierInputTelephone(String telephone) {
		inputTelephone.clear();
		inputTelephone.sendKeys(telephone);
	}
	
	public void modifierInputRue(String rue) {
		inputRue.clear();
		inputRue.sendKeys(rue);
	}
	
	public void modifierInputVille(String ville) {
		inputVille.clear();
		inputVille.sendKeys(ville);
	}
	
	public void modifierInputCodePostal(String codePostal) {
		inputCodePostal.clear();
		inputCodePostal.sendKeys(codePostal);
	}
	
	public void modifierInputPays(String pays) {
		inputPays.clear();
		inputPays.sendKeys(pays);
	}
	
	
}
