package market;

public class Ticket implements Payable {
    private String reference;
    private long prix;
    private final long TAUX_TAXE = 2500;

    public Ticket(String reference, long prix) {
        this.reference = reference;
        this.prix = prix;
    }

    public String label() {
        return reference;
    }

    public long cout() {
        return prix;
    }

    public long taxe() {
        return (prix * TAUX_TAXE) / 10000;
    }
}