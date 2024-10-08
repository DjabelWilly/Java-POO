package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public  AdressePostale adresse;

    public void getId(){
        System.out.println(nom.toUpperCase() + prenom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public Personne(String nom, String prenom, AdressePostale adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }



}

