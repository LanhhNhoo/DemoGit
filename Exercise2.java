import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        char chon;
        do{
            Scanner scanner = new Scanner(System.in);
            int n;
            System.out.println("Enter the integer: ");
            n = scanner.nextInt();
            if(n % 2 == 0 && n >= 0)
                System.out.println(+ n + " is an even an positive number");
            else if(n % 2 != 0 && n >= 0)
                System.out.println(+ n + " is an odd an positive number");
            else if(n % 2 == 0 && n < 0)
                System.out.println(+ n + " is an even an negative number");
            else if(n % 2 != 0 && n < 0)
                System.out.println(+ n + " is an odd an negative number");
            System.out.println("do you want to continue?(y/n)");
            chon = scanner.next().charAt(0);

        }while(chon == 'y' || chon == 'Y');
    }
}
