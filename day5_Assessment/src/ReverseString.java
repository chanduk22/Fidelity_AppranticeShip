import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int len=a.length;
        String s2=a[len-1];
        for(int i=len-2;i>=0;i--)
        {
            s2=s2+" "+a[i];
        }
        System.out.println(s2);

    }
}
