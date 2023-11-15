package D03_Polymorphie;

public class Mitarbeiter {
    
    private int anzahlStunden;
    private int stundenLohn;

    public Mitarbeiter(int anzahlStunden, int stundenLohn) {
        this.anzahlStunden = anzahlStunden;
        this.stundenLohn = stundenLohn;
    }

    public double berechneGehalt(){
        return anzahlStunden * stundenLohn;
    }
}
