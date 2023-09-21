package B00_Konstruktor;

public class Schueler {

    String nachname;
    String vorname;
    String email;

    //Konstruktor
    public Schueler(String name, String vorname) {
        
        this.nachname = name;
        this.vorname = vorname;
        this.email = null;
    }

    public Schueler(String nachname, String vorname, String email) {
        this(nachname,vorname);     //Aufruf des Konstruktors mit 2 String Übergabeparametern
        this.email = email;
    }

    @Override
    public String toString() {
        return vorname +" "+ nachname +"\nEmail: "+ email;
    }
}
