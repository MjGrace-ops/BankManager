public class Main {
        public static void main(String[] args) {

            // Création d'instance de chaque classe fille
            CheckingAccount checking = new CheckingAccount();
            SavingsAccount savings = new SavingsAccount();
            COD cod = new COD();

            //Exemple de Définition les attributs hérités
            checking.account = "Check-001";
            checking.balance = 1500.00;
            checking.limit = 3000.00;

            savings.account = "Save-001";
            savings.balance = 5000.00;
            savings.tauxInteret = 2.5;

            cod.account = "Cod-001";
            cod.balance = 10000.00;
            cod.echeance = "2026-12-31";

            // Lecture et Affichage des attributs
            System.out.println("=== CheckingAccount ===");
            System.out.println("Compte : " + checking.account);
            System.out.println("Solde  : " + checking.balance);
            System.out.println("Limite : " + checking.limit);

            System.out.println("\n=== SavingsAccount ===");
            System.out.println("Compte : " + savings.account);
            System.out.println("Solde  : " + savings.balance);
            System.out.println("Taux   : " + savings.tauxInteret + "%");

            System.out.println("\n=== COD ===");
            System.out.println("Compte   : " + cod.account);
            System.out.println("Solde    : " + cod.balance);
            System.out.println("Échéance : " + cod.echeance);
        }



}
