import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        int n,r,c,arm=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0) {
            r = n % 10;
            arm = (r * r * r) + arm;
            n = n/10;
        }
            if (c == arm)
                System.out.println("armstrong number");

            else
                System.out.println("not armstrong number");


    }
}
