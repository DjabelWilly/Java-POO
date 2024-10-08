package banques.entites;

public abstract class Operation {

   private String date;
   protected double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    // précise le type d'opération
    public abstract String getType();

    public abstract double calculTotal(double somme);

    @Override
    public String toString() {
        return  "Date: " + date + ", Montant: " + montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
