import java.util.Scanner;

public class E_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        int count=1;
        int sum=a;
        while ((a+1)*2<(n-sum)){
            a=a+1;
            sum=sum+a;
            count++;
        }
        System.out.println(count+1);
    }
}
