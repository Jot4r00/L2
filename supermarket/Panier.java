package market;

import java.util.ArrayList;

public class Panier {
    private static int idCounter = 0;
    private int id;
    private ArrayList<Produit> articles;
    private int poidsTotal;
    private final int POIDS_MAX = 10000;

    public Panier() {
        id = ++idCounter;
        articles = new ArrayList<>();
        poidsTotal = 0;
    }

    
    public boolean ajoutProduit(Produit produit) {
        if (poidsTotal + produit.getPoids() > POIDS_MAX) {
            return false;
        }
        articles.add(produit);
        poidsTotal += produit.getPoids();
        return true;
    }

    
    public boolean supprimerProduit(Produit produit) {
        if (articles.remove(produit)) {
            poidsTotal -= produit.getPoids();
            return true; 
        }
        return false; 
    }

    
    public int nombreProduit() {
        return articles.size();
    }

    
    public long prixTotal() {
        long total = 0;
        for (Produit produit : articles) {
            total += produit.getPrix();
        }
        return total;
    }
    
    
    public int getId() {
    	return id;
    }

    
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Panier ").append(id).append(" [").append(articles.size()).append(" article(s)]").append("\n");
        for (Produit produit : articles) {
            sb.append(produit).append("\n");
        }
        return sb.toString();
    }
}