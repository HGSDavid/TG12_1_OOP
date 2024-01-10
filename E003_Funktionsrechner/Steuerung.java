package E003_Funktionsrechner;

public class Steuerung{
    Oberflache dieOberflache;
    Funktion dieFunktion;

    public Steuerung(Steuerung steuerung){
        dieOberflache = new Oberflache(this);
    }

    private void ermittleFlache(){

    }

    private void tastaturEreignis(){

    }

    private void beendeProgramm(){
        dieFunktion = null;
        dieOberflache = null;
        System.exit(0);
    }
}
