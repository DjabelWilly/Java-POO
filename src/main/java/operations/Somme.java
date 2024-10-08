package operations;

public class Somme extends Operations {

    // Constructeur enfant
    public Somme(double a, double b) {
        super(a, b);
    }

    // Redéfinition de méthode
    @Override
    public double calcul() {
        return a + b;
    }

    @Override
    public String toString() {
        return "résultat de la somme = " + calcul();
    }
}



