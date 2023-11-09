package D01WdHVererbung;

public class Startklasse {
    
    public static void main(String[] args) {
        Filme rambo = new Filme("Rambo");

            try{
                rambo.setTitel("Bob der Meister");
            } catch (FilmtitelzukurzException e) {
                e.printStackTrace();
            }
        System.out.println(rambo.getTitel());
    }
}
