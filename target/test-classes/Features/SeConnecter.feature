
@SeConnecter
Feature: SeConnecter

  @tagConnexion
  Scenario: Je me connecte au site Kinot
    Given J ai déjà un compte
    And Je me connecte
    When Quand je renseigne un email valide et un mot de passe valide
    And Que je clique sur sign in
    Then Je suis connecté
