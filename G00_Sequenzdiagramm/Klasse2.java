package G00_Sequenzdiagramm;

public class Klasse2 {
    Klasse1 object1;

    public Klasse2(Klasse1 klasse1) {
        object1 = new Klasse1(this);
    }

    public String op2() {
        String a3 = object1.op3();
        System.out.println("Klasse 2 hat a3 = " + a3);
        return "antwort2";
    }
}
