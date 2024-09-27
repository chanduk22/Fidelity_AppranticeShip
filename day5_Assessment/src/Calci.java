import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operator");
        char o= sc.next().charAt(0);
        System.out.println("Enter the Operands");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator cl=new Calculator();
        int res=0;
        double quotient=0;
        double[] remainder=new double[1];
        switch(o){
            case '+':
                res=cl.Addition(a,b);
                System.out.println("Result of "+a+" + "+b+" is "+res);
                break;
            case '-':
                res=cl.Subtraction(a,b);
                System.out.println("Result of "+a+" - "+b+" is "+res);
                break;
            case '*':
                res=cl.Multiplication(a,b);
                System.out.println("Result of "+a+" * "+b+" is "+res);
                break;
            case '/':
                res=cl.Division(a,b,remainder);
                System.out.println("Result of "+a+" / "+b+" is "+res);
                System.out.println("Reminder = "+remainder[0]);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

    }
}
