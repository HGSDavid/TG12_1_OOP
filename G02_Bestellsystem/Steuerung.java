package G02_Bestellsystem;

public class Steuerung {
    Tisch[] derTisch;
    Produkt[] dasProdukt;

    public Steuerung(){
        derTisch = new Tisch[10];
        dasProdukt = new Produkt[6];
    }

    public void bestellen(int tischNr, int persNr, int prodNr) {
        derTisch[tischNr].bestellen(persNr, dasProdukt[prodNr]);

        double preis = dasProdukt[prodNr].getPreis();
        String bezeichnung = dasProdukt[prodNr].getBezeichnung();
    }
    
}
