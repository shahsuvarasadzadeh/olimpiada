import java.util.Scanner;

public class E_3_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a < 100 && b < 100 && c < 100 && a > -100 && c > -100 && b > -100) {

            double d = b * b - 4 * a * c;

            if (d < 0) System.out.println("No roots");
            else if (d == 0) {
                long x = (-1 * b) / (2 * a);
                System.out.println("One root: " + x);
            } else if (d > 0) {
                long x = (long) (((-1 * b) + Math.sqrt(d)) / (2 * a));
                long y = (long) (((-1 * b) - Math.sqrt(d)) / (2 * a));
                if (x > y)
                    System.out.println("Two roots: " + y + " " + x);
                else
                    System.out.println("Two roots: " + x + " " + y);
            }
        }
    }
}
