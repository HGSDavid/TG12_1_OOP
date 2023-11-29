package E002_UebungAssoziationen;

public class StartFilm {
    public static void main(String[] args) {

        //Objekte erstellen
        Regisseur wahlheim = new Regisseur("Wahlheim");
        Regisseur darobont = new Regisseur("Darobont");
        Regisseur loewe = new Regisseur("Loewe");

        Film cars = new Film("Cars", wahlheim);
        Film braveheart = new Film("Breaveheart", darobont);
        Film verurteilten = new Film("Die Verurteilten", loewe);

        //Werte setzen
        wahlheim.setVorname("Milena");
        darobont.setVorname("Robert");
        loewe.setVorname("Dajanaaaaaaaa");

        cars.setFsk(0);
        braveheart.setFsk(6);
        verurteilten.setFsk(18);


        //Film löschen
        cars = null;
    }
}
