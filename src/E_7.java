import java.util.Scanner;

public class E_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for (int i=1;i<n/2;i++){
            for (int j=0;j<n;j++){
                if (j%i==0)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
