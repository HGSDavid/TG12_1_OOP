package E001_Assoziationen;

public class Person {
    
    //Objektvariable
    private String name;
    private Parkplatz derParkplatz;

    //Konstruktor
    public Person(String name, Parkplatz p) {
        this.name = name;
        this.derParkplatz = p;
    }

    //Delegationsmethode
    public String getParkplatzNr() {
        return derParkplatz.getNummer();
    }

        
}
