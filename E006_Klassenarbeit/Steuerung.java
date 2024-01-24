package E006_Klassenarbeit;

public class Steuerung {
    Oberflaeche dieOberflaeche;
    Uhr dieUhr;
    Wurm derWurm;

    public Steuerung (Oberflaeche o) {
        dieOberflaeche = o;
        dieUhr = new Uhr(this);
        derWurm = new Wurm();
    }
}
