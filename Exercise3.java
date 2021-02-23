import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers a, b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Sum: " + (a+b));
        System.out.println("Sub: " + (a-b));
        System.out.println("Mul: " + (a*b));
        if(b != 0)
        System.out.println("Div: " + ((float)a/b));
    }
    
}
