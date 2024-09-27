import java.util.Scanner;

public class AccountProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id: ");
        int id = sc.nextInt();
        System.out.println("Enter account type: ");
        String accountType = sc.next();
        System.out.println("Enter account balance : ");
        double balance = sc.nextDouble();
        AccountDetails ac= new AccountDetails(id, accountType, balance);
        System.out.println(ac.getDetails());
        System.out.println("Enter amount to Withdraw :");
        double amount = sc.nextDouble();
        if(ac.withdraw(amount)) {
            System.out.println("New Balance "+ac.getBalance());
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
