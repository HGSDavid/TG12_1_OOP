package B00_Konstruktor;

public class ErzeugeSchueler {
    
    public static void main(String[] args){

        Schueler Max = new Schueler ("Meier","Max","mm@web.de");
        Schueler Julian = new Schueler ("Julian","Nagelsmann",null);

        System.out.println(Max.getName() +" "+ Max.getVorname() +" "+ Max.getEmail());
        System.out.println(Julian.getName() +" "+ Julian.getVorname() +" "+ Julian.getEmail());
    }
}
