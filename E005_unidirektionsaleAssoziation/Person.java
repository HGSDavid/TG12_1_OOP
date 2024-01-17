package E005_unidirektionsaleAssoziation;

public class Person {
    private String name;
    private String vorname;

    Account [] dieAccounts;

    public Person (String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public void setAccountList (Account [] As) {
        dieAccounts = As;
    }

    public void add (Account A) {
        //freie Stelle suchen
        dieAccounts [i] = A;
    }

    public Account get (int index) {
        return dieAccounts[index];
    }

    public void setAccount (int index, Account nA) {
        dieAccounts [index] = nA;
    }

    public void remove (int index) {
        dieAccounts[index] = null;
    }
    
}