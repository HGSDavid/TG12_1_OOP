package G00_Sequenzdiagramm;

import G00_Sequenzdiagramm.Klasse1;

public class Start {
    public static void main(String[] args) {
        //Objekt Object1 erstellen
        //object1 erstellt dann object2
        Klasse1 k1 = new Klasse1();

        //benutzer sendet Botschaft op1() an object1 der Klasse
        k1.op1();
    }
}
