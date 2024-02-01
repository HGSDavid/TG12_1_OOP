package G02_Bestellsystem;

import java.util.ArrayList;

public class GUI {
    Steuerung dieSteuerung;

    public GUI(Steuerung pSteuerung){
        dieSteuerung = pSteuerung;

        clickBestellen();
    }

    public void clickBestellen(){
        //Lesen eingegebener Werte
        int tischNr = 1;
        int persNr = 1;
        int prodNr = 1;

        dieSteuerung.bestellen(tischNr, persNr, prodNr);
    }

    public void anzeigenBestellposition(int persNr, int prodNr, String bezeichnung, double preis) {
        System.out.println("Bestellposition anzeigen");
    }
    
}