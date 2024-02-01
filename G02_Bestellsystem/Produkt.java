package G02_Bestellsystem;

public class Produkt {
    private double aPreis;
    private String aBezeichnung;
    private int aProduktnummer;
    

    public Produkt(int aProduktnummer, double aPreis, String aBezeichnung) {
        this.aProduktnummer = aProduktnummer;
        this.aPreis = aPreis;
        this.aBezeichnung = aBezeichnung;
    }

    public double getPreis() {
        return aPreis;
    }

    public String getBezeichnung() {
        return aBezeichnung;
    }
    
}
