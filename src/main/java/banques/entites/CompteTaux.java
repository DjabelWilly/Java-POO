package banques.entites;



    public class CompteTaux extends Compte {

        double tauxRemun;
        // constructeur qui reprend les attributs de la classe parent
        public CompteTaux(String num, int solde, double tauxRemun) {
            super(num, solde);
            this.tauxRemun = tauxRemun;
        }

        //appel de la méthode parent
        @Override
        public String toString(){
            return super.toString() + "\n" +  "taux de rémunération: " + tauxRemun;

        }

    }

