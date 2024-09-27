import java.util.Scanner;

public class SquareAndCube {
    public static double FindSquare(double x){
        return x*x;
    }
    public static double FindCube(double x){
        return x*x*x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        double x = sc.nextDouble();
        double square = FindSquare(x);
        double cube = FindCube(x);
        System.out.println("Square of Number "+x+" is "+square);
        System.out.println("Cube of Number "+x+" is "+cube);
    }
}
