# Polymorphie in der OPP

Es gibt zwei Arten der Polymorphie
1. Statische Polymorphie
2. dynamische Polymorphie

## statische Polymorphie
Mit statischer Polymorphie ist das überladen von Methoden innerhalb einer Klasse gemeint. D.h. eine Methode kommt in einer Klasse mehrmals vor und unterscheidet sich nur durch die Übergabeparameter.

### 1. Beispiel in Java:
````Java
class Schueler {
    
    private String name;
    private String vorname;

    //Konstruktor
    public Schueler(){
        name = "Mustermann";
        vorname = "Max";
    }

    //überladener Konstruktor
    public Schueler(String name){
        this.name = name;
        vorname = "Max";
    }
}
````
### 2. Beispiel in Java
````Java
class Uhr {
    // ...

    public void setUhrzeit(int stunden){
        //...
    }

    public void setUhrzeit(int stunden, int minuten){
        // ...
    }
}
````
> Bei statischer Polymorphie ist direkt beim Aufruf der Methode erkennbar, welche der überladenen Methoden ausgeführt werden muss.

````java
Schueler s1 = new Schueler("Maier");    //->überladener Konstruktor
Schueler s2 = new Schueler();           //->standart Konstruktor
// ...
dieUhr.setUhrzeit(13,15);               //setUhrzeit mit Stunden und Minuten
dieUhr.setUhrzeit(13);                  //setUhrzeit nur mit Stunden
````

## dynamische Polymorphie
Gibt es in einer Vererbungshierarchie mindestens zwei überschriebene Methoden, so ist diese Methode polymorph. 

### Beispiel in Java:
````Java
public class Mitarbeiter {

    public berechneGehalt(){
        return anzahlStunden * Stundenlohn;
    }
}

public class Abteilungsleiter extends Mitarbeiter{

    @override
    public double berechneGehalt(){
        return anzahlStunden * stundenlohn + zulage;
    }
}
````
folgendes gilt hier: 
- die Methode `berechneGehalt()` in der Klasse `Abteilungsleiter` wurde überschrieben. Das heißt, der gleiche Methodenname mit der gleichen Signatur (Rückgabewert, Übergabeparameter) wird in einer erbeneden Klasse mit neuem Code implementiert.
- es exisitiert bereits eine Implementierung in der Oberklasse.

Daraus folgt:
>- es existieren zwei Implementierungen einer Methode in einer Vererbungshirarchie.
>- Die Methode ist polymorph. 

### Beispiel:
````java
public class Startklasse{

    public static void main(String[] args){

        Mitarbeiter m1 = new Mitarbeiter();
        Abteilungsleiter a1 = new Abteilungsleiter();

        double gehalt1 = m1.berechnegehalt();
        double gehalt2 = a1.berechnegehalt();
    }
}
````