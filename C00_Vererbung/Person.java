package C00_Vererbung;

/**
 * Person
 */
public class Person {

    private String name;
    private String vorname;                         //erstellt mit alt + shift + pfeilnachunten
    protected int id;

    public Person(String name, String vorname) {    //erstellt mit str + . (generate Constructors)
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {                       //erstellt mit str + . (generate Getter)
        return name;
    }

    @Override                                       //erstellt mit str + . (generate toString)
    public String toString() {
        return "name=" + name + ", vorname=" + vorname + ", id=" + id;
    }

    
}