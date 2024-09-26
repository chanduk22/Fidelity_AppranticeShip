import java.util.Scanner;

public class BankingProcess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int acNo = sc.nextInt();
        System.out.println("Enter Account Name: ");
        String name = sc.next();
        System.out.println("Enter Balance: ");
        double bal = sc.nextDouble();
        BankingApplication BA=new BankingApplication(acNo,name,bal);
        while (true) {
            System.out.println("What Transaction you need to perform :");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. Print Account Details");
            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Amount to Deposit");
                    int dep = sc.nextInt();
                    BA.PerformTransaction(dep);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw");
                    int Wd = sc.nextInt();
                    BA.PerformTransaction(Wd, true);
                    break;
                case 3:
                    System.out.println("Enter From Account");
                    String from = sc.next();
                    System.out.println("Enter To Account");
                    String to = sc.next();
                    System.out.println("Enter Amount to Transfer");
                    int amt = sc.nextInt();
                    BA.PerformTransaction(from, to, amt);
                    break;
                case 4:
                    System.out.println("Show Account Details");
                    BA.printDetails();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
