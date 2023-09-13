package A00_ÜbungKlasse;

public class Lehrer {
    
    //Objektattribute
    private String kuerzel;
    private String name;
    private int alter;

    public Lehrer(){
        name = "Mustermann";
        setKuerzel("mm");
    }

    //Setter

    public void setKuerzel(String neuesKuerzel) {

        if (neuesKuerzel.length() == 2){
            kuerzel = neuesKuerzel;
        }
    }

    //Getter
    public String getKuerzel() {
        return kuerzel;
    }

    public String getname() {
        return name;
    }

    public int getAlter() {
        return alter;
    }
}
