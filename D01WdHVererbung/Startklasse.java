package D01WdHVererbung;

import java.util.ArrayList;

public class Startklasse {
    
    public static void main(String[] args) {
        Filme rambo = new Filme("Rambo");
        Trickfilme peanuts = new Trickfilme("peanuts 1");
        Trickfilme peanuts2 = new Trickfilme("peanuts 2",10);
        Dokumentarfilme terraX = new Dokumentarfilme("Terra X Nr.15");

        ArrayList<Filme> dieFilme = new ArrayList<>();
        dieFilme.add(rambo);
        dieFilme.add(peanuts);
        dieFilme.add(peanuts2);
        dieFilme.add(terraX);

        terraX.setBeschreibung("Entstehung der Dajana");
        
        for (Filme filme : dieFilme) {
            System.out.println(filme);
        }
    }
}
