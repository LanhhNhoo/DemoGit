import java.util.Scanner;


public class Exercise4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer a,b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a < b)
        System.out.println(+ a + " less " + b);
        else if(a > b)
        System.out.println(+ a + " bigger " + b);
        else
        System.out.println(+ a + " equal " + b);
    }
}
