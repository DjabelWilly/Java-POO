package operations;

public class TestOperations {
    public static void main(String[] args) {

        Operations calcul1 = new Somme(2.00, 4.50);
        Operations calcul2 = new Soustraire(12.00, 2.00);
        Operations calcul3 = new Multiplier(2.00, 4.00);
        Operations calcul4 = new Diviser(10.00, 2);

        System.out.println(calcul1);
        System.out.println(calcul2);
        System.out.println(calcul3);
        System.out.println(calcul4);
    }
}
