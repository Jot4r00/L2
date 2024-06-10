package market;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private List<Payable> listePayables;

    public Facture() {
        listePayables = new ArrayList<>();
    }

    public void ajout(Payable p) {
        listePayables.add(p);
    }
}
