package operations;

public class Soustraire extends Operations{

    // Constructeur enfant
    public Soustraire(double a, double b) {
        super(a, b);
    }

    // Redéfinition de méthode
    @Override
    public double calcul() {
        return a - b;
    }
    @Override
    public String toString() {
        return "résultat de la soustraction = " + calcul();
    }
}
