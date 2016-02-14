package workshop.bdd.fruitshop;

import static org.assertj.core.api.Assertions.assertThat;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FruitShopSteps {

	private int prixDuPanier;
	private Panier panier;
	private RefPrix referentiel;
	
	
	@Given("^le prix des pommes est (\\d+)$")
	public void le_prix_des_pommes_est(int prixPourUnLotDePommes) {
		this.referentiel = new RefPrix();
		this.referentiel.mettreAJourPrixProduit("Pommes", prixPourUnLotDePommes);
	}

	@Given("^le client prend (\\d+) lot de pommes$")
	public void le_client_prend_lot_de_pommes(int nbLotsPris) {
	    this.panier = new Panier();
	    this.panier.ajouterArticle("Pommes", nbLotsPris);
	}

	@Given("^le prix des bannanes est (\\d+)$")
	public void le_prix_des_bannanes_est(int prixPourUnLotDeBannanes) {
		this.referentiel.mettreAJourPrixProduit("Bannanes", prixPourUnLotDeBannanes);
	}
	
	@Given("^le client prend (\\d+) lot de bannanes$")
	public void le_client_prend_lot_de_bannanes(int nbLotsPris) throws Throwable {
		this.panier.ajouterArticle("Bannanes", nbLotsPris);
	}
		
	
	@When("^le client passe a la caisse$")
	public void le_client_passe_a_la_caisse() {
		panier.setReferentiel(referentiel);
		prixDuPanier = panier.getPrixTotal();
	}
	
	@Then("^il paye (\\d+)$")
	public void il_paye(int prixEstime) {
		assertThat(prixDuPanier).isEqualTo(prixEstime);
	}



}
