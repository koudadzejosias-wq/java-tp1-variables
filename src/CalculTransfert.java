public class CalculTransfert {
    public static void main(String[] args) {
        // Donnees personnelles
        String prenom = "Josias";
        int n = 6; // nombre de lettres du prenom

        // Parametres du transfert
        int montantEnvoye = 50000 + n * 1000; // montant personnel
        double tauxFrais = 0.02;
        int taxeFixe = 300;
        double tauxConversionEuro = 655.957;
        int valeurBillet = 5000;

        // Calculs
        double frais = montantEnvoye * tauxFrais;
        double totalAPayer = montantEnvoye + frais + taxeFixe;
        int totalEntier = (int) totalAPayer;
        int nombreBillets = totalEntier / valeurBillet;
        int complement = totalEntier % valeurBillet;
        double montantEuros = montantEnvoye / tauxConversionEuro;
        int partieEntiereEuros = (int) montantEuros;

        // Affichage
        System.out.println("Prenom : " + prenom);
        System.out.println("Valeur de N : " + n);
        System.out.println("Montant envoye : " + montantEnvoye + " FCFA");
        System.out.println("Frais : " + frais + " FCFA");
        System.out.println("Total a payer : " + totalAPayer + " FCFA");
        System.out.println("Billets de " + valeurBillet + " FCFA complets : " + nombreBillets);
        System.out.println("Complement a payer : " + complement + " FCFA");
        System.out.println("Montant recu en euros : " + montantEuros);
        System.out.println("Partie entiere en euros : " + partieEntiereEuros);
    }
}
