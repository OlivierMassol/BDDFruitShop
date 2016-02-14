package workshop.bdd.fruitshop;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	private List<String> contenuPanier;
	private RefPrix referentiel;
	
	public Panier() {
		contenuPanier = new ArrayList<String>();
	}

	public int getPrixTotal() {
		int prixTotal = 0;
		for (String article : contenuPanier) {
			prixTotal+=referentiel.catalogue.get(article);
		}
		return prixTotal;
	}

	public void setReferentiel(RefPrix referentiel) {
		this.referentiel = referentiel;
	}

	public void ajouterArticle(String nomArticle, int nbLot) {
		for(int i =0; i<nbLot; i++)
		{
			this.contenuPanier.add(nomArticle);
		}
	}

}
