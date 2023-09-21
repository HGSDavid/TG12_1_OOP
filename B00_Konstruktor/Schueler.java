package B00_Konstruktor;

public class Schueler {

    String name;
    String vorname;
    String email;

    //Konstruktor
    public Schueler(String name, String vorname, String email) {
        
        this.name = name;
        this.vorname = vorname;
        this.email = email;
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
