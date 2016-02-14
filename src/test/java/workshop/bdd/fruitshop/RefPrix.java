package workshop.bdd.fruitshop;

import java.util.HashMap;
import java.util.Map;

public class RefPrix {

	Map<String,Integer> catalogue;
	
	public RefPrix() {
		catalogue = new HashMap<String, Integer>();
	}

	public void mettreAJourPrixProduit(String nomProduit, int prixProduit) {
		catalogue.put(nomProduit, prixProduit);
	}

	
}
