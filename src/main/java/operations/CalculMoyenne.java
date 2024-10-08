package operations;

public class CalculMoyenne {

    double[] arrayMoyenne;

    // Construct avec param "..." pouvant accepter plusieurs args indéfinis
    public CalculMoyenne(double... valeurs){
        this.arrayMoyenne = valeurs;
    }

    // Méthode qui ajoute des éléments dans arrayMoyenne
    public void ajout(double valeur) {

        // création d'un nouveau tableau avec 1 index supplémentaire
        double[] newArray = new double[arrayMoyenne.length + 1];

        // copie des valeurs de arrayMoyenne dans newArray
        for (int i = 0; i < arrayMoyenne.length; i++) {
            arrayMoyenne[i] = newArray[i];
        }
        // copie la nouvelle valeur à la fin de newArray
        newArray[newArray.length - 1] = valeur;

        // Remplacer le tableau original par newArray
        arrayMoyenne = newArray;
    }

    // Méthode qui retourne la moyenne des éléments de arrayMoyenne
    public double calcul(){
        double somme = 0;
        for (int i = 0; i < arrayMoyenne.length; i++) {
            somme += arrayMoyenne[i]; // Ajoute la valeur courante à la somme
        }
        return somme / arrayMoyenne.length;
    }
}
