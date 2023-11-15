package D03_Polymorphie;

public class Startklasse {
    
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter(40, 12);
        Abteilungsleiter a1 = new Abteilungsleiter(40, 120);

        System.out.println("Gehalt Mitarbeiter: \t\t" + m1.berechneGehalt());
        System.out.println("Gehalt Abteilungsleiter: \t" + a1.berechneGehalt());
    }
}
