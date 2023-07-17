package Definitions;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DefinitionProfil {
	@Given ("^J ai déjà un compte, je me connecte et je suis sur la page profil$")
	public void J_ai_déjà_un_compte_je_me_connecte_et_je_suis_sur_la_page_profil() {
		TestConfig.pagesFactory.pageconnexion.seConnecter("karambacissoko86@gmail.com", "Karamba.86@");
		TestConfig.pagesFactory.pageaccueil.accederPageProfil();
	}
		
	@When ("^Je clique sur l icone de modification du profil$")
	public void Je_clique_sur_l_icone_de_modification_du_profil() {
		TestConfig.pagesFactory.pageprofil.accederModificationProfil();
	}

	
	@And ("^Je modifie mon prénom")
	public void Je_modifie_mon_prenom() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputPrenom("Maxence");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie mon nom")
	public void Je_modifie_mon_nom() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputNom("COTTEL");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie mon adresse email")
	public void Je_modifie_mon_email() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputEmail("Maxence.Coco@evan.com");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie ma date de naissance")
	public void Je_modifie_ma_date_de_naissance() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputDateDeNaissance("20/01/2000");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie mon telephone")
	public void Je_modifie_mon_telephone() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputTelephone("0659595959");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie ma rue")
	public void Je_modifie_mon_rue() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputRue("Ebut");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie ma ville")
	public void Je_modifie_ma_ville() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputVille("Lille");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie mon code postal")
	public void Je_modifie_mon_code_postal() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputCodePostal("59000");
		Thread.sleep(1000);
	}
	
	@And ("^Je modifie mon pays")
	public void Je_modifie_mon_pays() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.modifierInputPays("France");
		Thread.sleep(1000);
	}
	
	@And ("^Je clique à nouveau sur l icone de modification du profil$")
	public void Je_clique_a_nouveau_sur_l_icone_de_modification_du_profil() throws InterruptedException {
		TestConfig.pagesFactory.pageprofil.accederModificationProfil();
		Thread.sleep(1000);
	}
	
	@Then ("^J'ai modifié mon profil")
	public void J_ai_modifie_mon_profil() {
		assertEquals(TestConfig.pagesFactory.pageprofil.inputPrenom.getText(), "Maxence");
	}
	
}
