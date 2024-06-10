package market;

public class Produit {
	private final String nom;
    private final long prix;
    private final int poids;

   
    public Produit(String nom, long prix, int poids) {
        this.nom = nom;
        this.prix = prix;
        this.poids = poids;
    }

   
    public String getNom() {
        return nom;
    }

   
    public long getPrix() {
        return prix;
    }
    
    
    public int getPoids() {
    	return poids;
    }
    
    public String toString() {
        double prixEnEuros = prix / 100.0;
        return String.format("%s: %.2f €", nom, prixEnEuros);
    }

}