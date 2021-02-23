import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        int max = a;
        if(max < b)
        max = b;
        if(max < c)
        max = c;
        if(max < d)
        max = d;
        if( a == b && b == c && c == d)
        System.out.println("There is no largest number!!");
        if(a !=b )
        System.out.println("The largest numner: " + max);
    }
}
