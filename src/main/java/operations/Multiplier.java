package operations;

public class Multiplier extends Operations{

    // Constructeur enfant
    public Multiplier(double a, double b) {
        super(a, b);
    }

    // Redéfinition de méthode
    @Override
    public double calcul() {
        return a * b;
    }
    @Override
    public String toString() {
        return "résultat de la multiplication = " + calcul();
    }
}
