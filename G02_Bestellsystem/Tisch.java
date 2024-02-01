package G02_Bestellsystem;

import java.util.ArrayList;
import java.util.List;

public class Tisch {
    List<Bestellposition> dieBestellpositionen;

    public Tisch(){
        dieBestellpositionen = new ArrayList<>();
    }

    public void bestellen(int persNr, Produkt produkt) {
        dieBestellpositionen.add(new Bestellposition(persNr, produkt));
    }
}
