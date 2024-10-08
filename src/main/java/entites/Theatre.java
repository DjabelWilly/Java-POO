package entites;

public class Theatre {
    String nom;
    int capacite;
    int totalClientsInscrits;
    double recette;

    // Constructeur
    public Theatre(String nom, int capacite, int totalClientsInscrits, double recette) {
        this.nom = nom;
        this.capacite = capacite;
        this.totalClientsInscrits = totalClientsInscrits;
        this.recette = recette;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    public double getRecette() {
        return recette;
    }

    // Méthode pour inscrire des clients
    public String inscrire(int nbClients, double prixPlace) {

        // Vérifie si la capacité maximale est atteinte
        if (totalClientsInscrits + nbClients <= capacite) {
            totalClientsInscrits += nbClients; // Met à jour le nombre total de clients inscrits
            recette += nbClients * prixPlace; // Calcule la recette
            return "Inscription réussie ! Il reste " + (capacite - totalClientsInscrits) + " places.";

        } else if (totalClientsInscrits < capacite) {
            // Si seulement une partie des clients peut être inscrite
            int placesRestantes = capacite - totalClientsInscrits;
            totalClientsInscrits += placesRestantes;
            recette += placesRestantes * prixPlace;
            return "Inscription partielle ! Il reste 0 places. " + placesRestantes + " clients ont été inscrits.";

        } else {
            return "Il n'y a plus de place disponible dans le théâtre.";
        }
    }
}
