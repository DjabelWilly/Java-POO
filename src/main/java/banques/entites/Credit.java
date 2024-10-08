package banques.entites;

public class Credit extends Operation {

    // Constructeur de la classe fille qui appelle le constructeur de la classe parente
    public Credit(String date, double montant) {
        super(date, montant);  // Appel du constructeur de Operation
    }

    @Override
    public String getType() {
        return "CREDIT ";
    }

    @Override
    public String toString() {
        return getType() + super.toString();  // Appel à toString() de la classe parente
    }

    public double calculTotal(double somme){
        return somme+montant;
    }
}
