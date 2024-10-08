package operations;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne moyennePierre = new CalculMoyenne(10,18,15,10);
        CalculMoyenne moyennePaul = new CalculMoyenne(12,13,8,14);


        System.out.println("la moyenne est " + moyennePierre.calcul());
        System.out.println("la moyenne est " + moyennePaul.calcul());

    }
}
