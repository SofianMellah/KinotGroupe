package Definitions;

import io.cucumber.java.en.Given;

public class DefinitionConnexion {
	@Given("^J ai déjà un compte$")
	public void J_ai_déjà_un_compte() {
		TestConfig.pagesFactory.pageconnexion.seConnecter("karambacissoko86@gmail.com", "Karamba.86@");
	}
}
