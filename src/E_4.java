import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short a= sc.nextShort();
        short b= sc.nextShort();
        short c= sc.nextShort();
        short d= sc.nextShort();
        short e=0;
        List<Short>q=new ArrayList<>();
        for (short i=a;i<=b;i++){
            for (short j=c;j<=d;j++){
                e= (short) (i*j);
                if (q.contains(e)){
                }
                else {
                    q.add(e);
                }
            }
        }
        System.out.println(q.toArray().length);
    }
}
