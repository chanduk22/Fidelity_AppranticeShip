import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Country: ");
        String country = sc.nextca();
        System.out.println("Welcome "+name+" your age is "+age+" and you are from "+country);
    }
}
