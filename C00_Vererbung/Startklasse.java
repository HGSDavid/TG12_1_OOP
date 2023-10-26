package C00_Vererbung;

import java.util.ArrayList;

public class Startklasse {

    public static void main(String[] args) {

        //Schülerobjekte erzeugen
        Schueler s1 = new Schueler("Maier","Max");
        Schueler s2 = new Schueler("Hammer","Niko","nh@web.de");

        //Alle Schüler in eine Liste packen
        ArrayList<Schueler> dieSchueler = new ArrayList<>();
        dieSchueler.add(s1);
        dieSchueler.add(s2);

        //alle schueler ausgeben
        for (Schueler schueler : dieSchueler) {
            System.out.println(schueler);
        }
    }
}