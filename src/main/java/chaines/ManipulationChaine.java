package chaines;

public class ManipulationChaine {

    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println( "la longueur de la chaine de caractères: " + chaine.length());
        System.out.println("index du premier « ; » : " + chaine.indexOf(";"));
        System.out.println(chaine.substring(7,13)); // extract "Marcel"
        System.out.println(chaine.indexOf("D")); // index de "D"
        System.out.println(chaine.indexOf("d")); // index de "d"
        System.out.println(chaine.indexOf("M")); // index de "M"
        System.out.println(chaine.indexOf("l")); // index de "l"
        System.out.println(chaine.substring(0,6)); // extract de index 0 à 6
        System.out.println(chaine.substring(7,13)); // extract de index 7 à 13

        // Méthode toUpperCase
        String nom = chaine.substring(0,6);
        String prenom = chaine.substring(7,13);
        System.out.println(nom.toUpperCase()); // "DURAND"
        System.out.println(prenom.toUpperCase()); // "MARCEL"

        // Méthode toLowerCase
        System.out.println(nom.toLowerCase()); //"durand"

        // Méthode split
        System.out.println("tableau sans le caractère ';'");
        String[] cleanedArray = chaine.split(";");
        for (String i : cleanedArray){
            System.out.println(i);
        }


    }

}

