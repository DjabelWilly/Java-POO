package banques.entites;

public class TestOperation {

    public static void main(String[] args) {

        // tableau de 4 opérations
        Operation[] listOperation = new Operation[4];

        // Initialisation des objets dans le tableau
        listOperation[0] = new Credit("04-09-2024", 23.99);
        listOperation[1] = new Debit("05-09-2024", 12.50);
        listOperation[2] = new Credit("09-09-2024", 200.00);
        listOperation[3] = new Debit("07-09-2024", 260.95);

        double somme = 0.0;

        for (int i = 0; i < listOperation.length; i++) {
            System.out.println(listOperation[i]);
            if (listOperation[i].getType().equals("CREDIT ")){
                somme += listOperation[i].getMontant();
            }
            else {
                somme -= listOperation[i].getMontant();
            }
        }
        // permet de conserver seulement 2 chiffres après la virgule
        System.out.printf("Le solde est de : %.2f%n", somme);

    }
}
