package E002_UebungAssoziationen;

public class Film {

    Regisseur derRegisseur;

    //Objektattribute
    private int id;
    private String titel;
    private int dauer;
    private int fsk;

    //Klassenattribute
    private static int anzahlerzeugterFilme = 0;
    private static int anzahlgelöschterFilme = 0;

    //Constructor
    public Film(String titel, Regisseur r) {
        this.titel = titel;
        
        //Parkplätze zählen
        anzahlerzeugterFilme ++;
        id = anzahlerzeugterFilme;
    }

    //Getter und Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getDauer() {
        return dauer;
    }
    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public int getFsk() {
        return fsk;
    }
    public void setFsk(int fsk) {
        this.fsk = fsk;
    }

    public static int getAnzahlerzeugterFilme() {
        return anzahlerzeugterFilme;
    }
    
    public static int getAnzahlgelöschterFilme() {
        return anzahlgelöschterFilme;
    }
    
    public static int getAnzahlFilme() {
        return anzahlerzeugterFilme - anzahlgelöschterFilme;
    }
    
    @Override
    public String toString() {
        return "Film [titel=" + titel + ", dauer=" + dauer + ", fsk=" + fsk + "]";
    }

    
    @Override
    protected void finalize() throws Throwable {
        anzahlgelöschterFilme++;
        System.out.println("Film gulasch");
    }

    public Regisseur getRegisseur() {
        return derRegisseur;
    }
}