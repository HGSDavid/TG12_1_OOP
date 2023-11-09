package D01WdHVererbung;

public class Filme {
    //Objektattribute
    private String titel;
    private int dauer;
    
    //Constructor
    public Filme(String pTitel) {
        titel = pTitel;
    }

    //Getter and Setter
    public String getTitel() {
        return titel;
    }
        //Es wird überprüft, ob der Titel lang genug ist und sonst eine Felermeldung erzeugt
    public void setTitel(String neuerTitel) throws FilmtitelzukurzException {
        if (neuerTitel.length()>2) {
            this.titel = neuerTitel;
        }
        else{
            //Fehlermeldung erzeugen
            throw new FilmtitelzukurzException();
        }
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
    
}
