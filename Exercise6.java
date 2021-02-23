import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        float dai, rong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle(dai > rong): ");
        dai = scanner.nextFloat();
        rong = scanner.nextFloat();
        System.out.println("Perimeter of a rectangle: " + (2*(dai+rong)));
        System.out.println("Are of a rectangle: " + (dai*rong));
    }
}
