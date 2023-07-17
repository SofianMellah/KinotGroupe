@SeConnecterModifierProfil
Feature: SeConnecterModifierProfil

  @tagConnexionModifierProfil
  Scenario: Je me connecte au site Kinot et que je modifie mon profil
    Given J ai déjà un compte, je me connecte et je suis sur la page profil
    When Je clique sur l icone de modification du profil
    And Je modifie mon prénom
    And Je modifie mon nom
    And Je modifie mon adresse email
    And Je modifie ma date de naissance
    And Je modifie mon téléphone
    And Je modifie ma rue
    And Je modifie ma ville
    And Je modifie mon code postal
    And Je modifie mon pays
    And Je clique à nouveau sur l icone de modification du profil
    Then J'ai modifie mon profil
