package entites;

public class TestTheatre {
    public static void main(String[] args) {

        // instance de Theatre
        Theatre theatre = new Theatre("Theatre National", 200, 0, 0);

        System.out.println(theatre.inscrire(100, 10));
        System.out.println("Total clients : " + theatre.getTotalClientsInscrits());
        System.out.println("Recette cumulée : " + theatre.getRecette());
        System.out.println("Capacité restante : " + (theatre.getCapacite() - theatre.getTotalClientsInscrits()));

        System.out.println(theatre.inscrire(101, 10));
        System.out.println("Total clients : " + theatre.getTotalClientsInscrits());
        System.out.println("Recette cumulée : " + theatre.getRecette());
        System.out.println("Capacité restante : " + (theatre.getCapacite() - theatre.getTotalClientsInscrits()));
    }
}
