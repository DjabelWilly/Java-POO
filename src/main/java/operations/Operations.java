package operations;

public abstract class Operations {

    public double a;
    public double b;

    // Construct.
    public Operations(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Méthode abstraite à définir dans classes enfants
    public abstract double calcul();



}
