public class Main {
        public static void main(String[] args) {

            // Création d'instance de chaque classe fille
            CheckingAccount checking = new CheckingAccount();
            SavingsAccount savings = new SavingsAccount();
            COD cod = new COD();

            //Exemple
            // Définir les attributs hérités
            checking.account = "CHK-001";
            checking.balance = 1500.00;
            checking.limit = 500.00;

            savings.account = "SAV-001";
            savings.balance = 5000.00;
            savings.interestRate = 2.5;

            cod.account = "COD-001";
            cod.balance = 10000.00;
            cod.MaturityDate = "2026-12-31";

            // Lire et afficher les attributs
            System.out.println("=== Checking Account ===");
            System.out.println("Compte : " + checking.account);
            System.out.println("Solde  : " + checking.balance);
            System.out.println("Limite : " + checking.limit);

            System.out.println("\n=== Savings Account ===");
            System.out.println("Compte : " + savings.account);
            System.out.println("Solde  : " + savings.balance);
            System.out.println("Taux   : " + savings.interestRate + "%");

            System.out.println("\n=== COD ===");
            System.out.println("Compte   : " + cod.account);
            System.out.println("Solde    : " + cod.balance);
            System.out.println("Échéance : " + cod.MaturityDate);
        }



}
