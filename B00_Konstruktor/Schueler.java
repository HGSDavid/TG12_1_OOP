package B00_Konstruktor;

public class Schueler {

    String name;
    String vorname;
    String email;

    //Konstruktor
    public Schueler() {
        Schueler s1 = new Schueler (String name, String vorname);
    }

    //Getter
    public String getName (){
        return name;
    }

    public String getVorname (){
        return vorname;
    }

    public String getEmail (){
        return email;
    }
}
