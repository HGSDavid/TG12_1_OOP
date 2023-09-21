package B00_Konstruktor;

public class ErzeugeSchueler {
    
    public static void main(String[] args){

        Schueler Max = new Schueler ("Meier","Max","mm@web.de");
        Schueler Julian = new Schueler ("Julian","Nagelsmann",null);

        System.out.println(Max);
        System.out.println(Julian);
    }
}
