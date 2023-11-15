package D03_Polymorphie;

public class Abteilungsleiter extends Mitarbeiter {

    private double zulage;

    public Abteilungsleiter(int anzahlStunden, int stundenLohn) {
        super(anzahlStunden, stundenLohn);
        zulage = 100;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
