# Aufgabe zu Konstruktoren

1. Erstellen Sie eine Klasse `Schueler` mit den Attributen Name, Vorname und email.

````java
public class Schueler {

    String nachname;
    String vorname;
    String email;
}
````

2. Ein Schuelerobjekt darf nur erstellt werden, wenn der Name und der Vorname bekannt ist. Ergänzen Sie die Klasse `Schueler`.

````java
public Schueler(String name, String vorname) {
        
        this.nachname = name;
        this.vorname = vorname;
        this.email = null;
    }
````

3. Ein Schueler soll auch mit einer Email-Adresse direkt erstellt werden können. Ergänzen Sie die Klasse `Schueler` um einen weiteren Konstruktor und verketten sie diesen mit dem bereits vorhandnen Konstruktor.

````java
public Schueler(String nachname, String vorname, String email) {
        this(nachname,vorname);     //Aufruf des Konstruktors mit 2 String Übergabeparametern
        this.email = email;
    }

````

4. Erzeugen Sie die Schuelerobjekte `Max Meier` mit der Emailadresse `mm@web.de` und `Julian Nagelsmann` ohne Emailadresse in einer ausführbaren Klasse `ErzeugeSchueler.java`.

````java
package B00_Konstruktor;

public class ErzeugeSchueler {
    
    public static void main(String[] args){

        Schueler Max = new Schueler ("Meier","Max","mm@web.de");
        Schueler Julian = new Schueler ("Julian","Nagelsmann",null);
    }
}

````

5. Die Daten der Schueler sollen auf der Konsole ausgegeben werden. Überschreiben Sie die `toString()`-Methode aus der Klasse `Object`.

````java
@Override
    public String toString() {
        return vorname +" "+ nachname +"\nEmail: "+ email;
    }
````