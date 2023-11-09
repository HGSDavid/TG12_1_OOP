package D01WdHVererbung;

public class Trickfilme extends Filme{
    //Objektattribute
    int mindestalter;

    public Trickfilme(String pTitel) {
        super(pTitel);
        mindestalter = 0;
    }

    //überladener Konstruktor
    public Trickfilme(String pTitel, int mindestalter) {
        super(pTitel);
        this.mindestalter = mindestalter;
    }

    @Override
    public String toString() {
        return super.toString() + " mindestalter:" + mindestalter;
    }

    
}
