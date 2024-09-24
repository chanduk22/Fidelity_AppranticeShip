import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product Pd=new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product Id :");
        int ProductId=sc.nextInt();
        System.out.println("Enter product name: ");
        String ProductName=sc.next();
        System.out.println("Enter product category: ");
        String Category=sc.nextLine();
        Pd.Initialize(ProductId,ProductName,Category);
        Pd.Display();
        Product.Show();
    }
}