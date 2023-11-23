package D03_Polymorphie;
import java.util.Scanner;

public class Startklasse {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Wie viele Stunden arbeitet der Mitarbeiter?");
        Mitarbeiter m1 = new Mitarbeiter(s.nextInt(), 12);
        System.out.println("Wie viele Stunden arbeitet der Abteilungsleiter?");
        Abteilungsleiter a1 = new Abteilungsleiter(s.nextInt(), 120);

        System.out.println("\nGehalt Mitarbeiter: \t\t" + m1.berechneGehalt());
        System.out.println("Gehalt Abteilungsleiter: \t" + a1.berechneGehalt());

        s.close();
    }
}
