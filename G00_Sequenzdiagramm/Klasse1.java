package G00_Sequenzdiagramm;

public class Klasse1 {
    Klasse2 object2;

    public Klasse1 (Klasse2 klasse2) {
        object2 = new Klasse2(this);
    }

    public void op1(){
        String a2 = object2.op2();
        System.out.println(a2);
    }

    public String op3() {
        return "Antwort 3 von Klasse 1 an Klasse 2";
    }
}