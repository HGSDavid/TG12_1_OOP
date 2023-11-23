package E001_Assoziationen;

public class Parkplatz {

    //Klassenvariable
    private static int anzahlgeloschterParkplatze = 0;
    private static int anzahlerzeugterParkplatze = 0;

    //Objektvariablen
    private int id;
    private String nummer;

    //Konstruktor
    public Parkplatz(String nr) {
        this.nummer = nr;

        //Id erzeugen
        anzahlerzeugterParkplatze++;
        id = anzahlerzeugterParkplatze;
    }

    public static int getAnzahlparkplatze(){
        return anzahlerzeugterParkplatze-anzahlgeloschterParkplatze;
    }

    public int getId() {
        return id;
    }

    public String getNummer() {
        return nummer;
    }

    @Override
    protected void finalize() throws Throwable {
        anzahlgeloschterParkplatze++;
        System.out.println("Parkplatz gulasch");
    }

    @Override
    public String toString() {
        return "Parkplatz [id=" + id + ", nummer=" + nummer + "]";
    }

    
}
