package market;


public class ProduitFrais extends Produit {
	private String dateLimiteConso;
	
	
	public ProduitFrais(String nom, long prix, int poids, String dateLimiteConso) {
		super(nom, prix, poids);
		this.dateLimiteConso = dateLimiteConso;
	}
	
	
	public String getDateLimiteConso() {
		return dateLimiteConso;
	}
	
	
	public String toString() {
		return "B:" + dateLimiteConso + " " + super.toString();
	}

}
