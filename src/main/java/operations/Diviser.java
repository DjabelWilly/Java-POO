package operations;

public class Diviser extends Operations{

    // Constructeur enfant
    public Diviser(double a, double b) {
        super(a, b);
    }

    // Redéfinition de méthode
    @Override
    public double calcul() {
        return a / b;
    }
    @Override
    public String toString() {
        return "résultat de la division = " + calcul();
    }
}
