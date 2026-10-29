public class FicheEtudiant {
    public static void main(String[] args) {
        // String : le nom est une suite de caracteres (du texte)
        String nom = "KOUDADZE";

        // String : le prenom est une suite de caracteres (du texte)
        String prenom = "Josias";

        // int : l'age est un nombre entier, sans decimales
        int age = 19;

        // String : la filiere est un texte
        String filiere = "Cybersecurite";

        // char : le groupe est represente par un seul caractere
        char groupe = '1';

        // double : la moyenne peut avoir des decimales
        double moyenneAnneePrecedente = 16.0;

        // boolean : boursier est une information vrai ou faux
        boolean boursier = true;

        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Filiere : " + filiere);
        System.out.println("Groupe : " + groupe);
        System.out.println("Moyenne de l'annee precedente : " + moyenneAnneePrecedente);
        System.out.println("Boursier : " + boursier);

        age = age + 1;
        System.out.println("Age l'an prochain : " + age);
    }
}
