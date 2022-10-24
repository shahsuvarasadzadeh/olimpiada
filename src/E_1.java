import java.util.Scanner;

public class E_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n<(2*1000*1000*1000)) {
            while (n > 0) {
                count++;
                int b = n;
                while (b > 0) {
                    n=n-b%10;
                    b = b / 10;
                }
            }
            System.out.println(count);
        }
    }
}
