package D01WdHVererbung;

public class Dokumentarfilme extends Filme{
    //Objektattribute
    String beschreibung;

    public Dokumentarfilme(String pTitel) {
        super(pTitel);
        beschreibung = null;
    }

    public String getBeschreibung() {
        return beschreibung;
    }



    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return super.toString() + " beschreibung: " + beschreibung;
    }
}
