package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne();
        Personne pers2 = new Personne();

        pers1.nom = "Truc";
        pers1.prenom = "Toto";
        pers1.adressePostale = "3 place de marché";

        pers2.nom = "Machin";
        pers2.prenom = "Tutu";
        pers2.adressePostale = "10 rue Victor Hugo";

        System.out.println(pers1);
        System.out.println(pers2);
    }

}
