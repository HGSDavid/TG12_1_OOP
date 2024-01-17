package E005_unidirektionsaleAssoziation;

public class Start {

    public static void main(String[] args) {
        Person p1 = new Person("Maier", "Max");

        Account a1 = new Account ("www.google.de", "Max69");
        Account a2 = new Account ("www.netflix.com", "Max420");

        Account [] acl = new Account [6];
        acl[0] = a1;
        acl[1] = a2;

        p1.setAccountList (acl); //schon erstellte Accounts der Person zuordnen
        p1.add(new Account ("www.github.com", "gitMax"));

        Account testA = p1.get(1); //netflix

        p1.setAccount(0, new Account ("www.google.de", "GoggleMax")); //Googlepasswort ändern
        p1.remove(1); //netflix löschen
    }
}