import java.util.Scanner;

public class E_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long l=0;
        while (n>0){
            if ((n%10)%2==0){
                l=l*10+(n%10+1);
            }
            else {
                l = l * 10 + n % 10;
            }
            n=n/10;
        }
        n=0;
        while (l>0){
            n=n*10+l%10;
            l=l/10;
        }
        System.out.println(n);
    }
}
