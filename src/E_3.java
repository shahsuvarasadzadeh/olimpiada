import java.util.Scanner;

public class E_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d;
        int x1,x2;

        d=b*b-4*a*c;
        if (d>0){
            x1= (int) ((-b+Math.sqrt(d))/2);
            x2=(int) ((-b-Math.sqrt(d))/2);
            if (x1>x2){
                System.out.println("Two roots:"+" "+x2+" "+x1);
            }
            else {
                System.out.println("Two roots:" + " " + x1 + " " + x2);
            }
        } else if (d==0) {
            x1= (int) (-b/(2*a));
            x2=x1;

            System.out.println("One root:"+" "+x1);
        }
        else {
            System.out.println( "No roots");
        }
    }

}
