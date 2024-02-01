package G02_Bestellsystem;

public class Steuerung {
    Tisch[] derTisch;
    Produkt[] dasProdukt;
    GUI dieGUI;

    public Steuerung(){
        derTisch = new Tisch[10];
        dasProdukt = new Produkt[6];

        dasProdukt[0] = new Produkt(1, 1, "Cola");

        dieGUI = new GUI(this);
    }

    public void bestellen(int tischNr, int persNr, int prodNr) {
        derTisch[tischNr].bestellen(persNr, dasProdukt[prodNr]);

        double preis = dasProdukt[prodNr].getPreis();
        String bezeichnung = dasProdukt[prodNr].getBezeichnung();

        dieGUI.anzeigenBestellposition(persNr, prodNr, bezeichnung, preis);
    }
    
}
