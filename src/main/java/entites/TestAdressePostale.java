package entites;

public class TestAdressePostale {
    public static void main (String[] args){
        AdressePostale adr1 = new AdressePostale();
        AdressePostale adr2 = new AdressePostale();

        adr1.numeroRue = 45;
        adr1.libelleRue = "avenue Leon Blum";
        adr1.codePostal = 13001;
        adr1.ville = "Marseille";

        adr2.numeroRue = 13;
        adr2.libelleRue = "rue Toto";
        adr2.codePostal = 34000;
        adr2.ville = "Montpellier";
    }
}
