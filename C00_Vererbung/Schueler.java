package C00_Vererbung;

public class Schueler extends Person {                              //Klasse Schueler erbt von Person

    private String email;

    //Konstruktor
    public Schueler(String name, String vorname) {                  //erstellt mit der Glühbirne (generate constructors)
        super(name, vorname);                                       //super schaut in Oberklasse nach Constructor
        email = null;
    }

    //überladener Konstruktor
    public Schueler(String name, String vorname, String email) {    //erstellt mit der Glühbirne (generate constructors)
        super(name, vorname);
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + "Schueler email=" + email;
    }

}
