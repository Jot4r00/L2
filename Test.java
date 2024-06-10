package market;

public class Test {
    public static void main(String[] args) {
    	
    	 Produit produit1 = new Produit("cereales", 500, 1000);
    	 Produit produit2 = new Produit("caviar", 50000, 500);
    	 Produit produit3 = new Produit("eau", 101, 1000);
    	 
    	 System.out.println(produit1);
    	 
    	 Panier pan1 = new Panier();
    	 Panier pan2 = new Panier();
    	 Panier pan3 = new Panier();
    	 pan1.ajoutProduit(produit1);
    	 pan1.ajoutProduit(produit2);
    	 pan2.ajoutProduit(produit3);
    	 
    	 System.out.println(pan1.getId());
    	 System.out.println(pan2.getId());
    	 System.out.println(pan3.getId());
    	 
    	 System.out.println(pan1);
    	 System.out.println(pan2);
    	 System.out.println(pan3);
    	 
    	 ProduitFrais frais = new ProduitFrais("Saumon", 1450, 800, "01-12-2022");
    	 System.out.println(frais);
    	 
    }
}
