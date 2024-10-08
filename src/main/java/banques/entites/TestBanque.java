package banques.entites;

import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {
   Compte cpt = new Compte("FR4533223443B", 100);

        // tableau d'objets Compte avec 2 éléments
        Compte[] comptes = new Compte[2];

        // Initialisation des objets dans le tableau
        comptes[0] = new Compte("FR4533223443B", 100);
        comptes[1] = new CompteTaux("FR6234565669R", 2000, 3.2);

        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }

        // System.out.println(Arrays.toString(comptes));
    }
}
