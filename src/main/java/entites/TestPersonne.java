package entites;

import entites2.Personne;


public class TestPersonne {
    public static void main(String[] args) {

        // Création d'une adresse postale
        AdressePostale adr1 = new AdressePostale(13, "place du marché", 75000, "Paris");

        // Création de deux personnes avec des constructeurs différents
        Personne pers1 = new Personne("Machin", "Pierre", adr1);


        pers1.getId();
        System.out.println(pers1.getAdresse());
        System.out.println(pers1.getNom());
        System.out.println(pers1.getPrenom());

        Personne pers2 = new Personne("Toto", "Paul", adr1);
        pers2.setAdresse(3, "rue Truc", 13200, "Arles");
        pers1.setNom("Jean");
        pers2.setPrenom("Titi");

    }
}

