package banques.entites;

public class Compte {
    private String num;
    private double solde;

        public Compte(String num, int solde){
            this.num = num;
            this.solde = solde;
        }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return  "numéro de compte: " + num +"\n" +
                "solde: " + solde;
    }
}



