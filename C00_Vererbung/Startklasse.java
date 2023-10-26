package C00_Vererbung;

public class Startklasse {

    public static void main(String[] args) {

        Schueler s1 = new Schueler("Meier","Max");
        Schueler s2 = new Schueler("Hammer","Niko","nh@web.de");

        System.out.println(s1);
        System.out.println(s2);

    }
}
