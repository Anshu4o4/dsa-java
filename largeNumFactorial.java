
import java.math.BigInteger;
import java.util.*;

public class largeNumFactorial {
    public static void fact(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        BigInteger factorial=BigInteger.ONE;

        for(int i=n;i>=1;i--){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               fact(n);
    }
}
