public class bionomCoeffic {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n=5;
        int r=10;
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int rmn_fact=factorial(r-n);
        int bc=n_fact/(r_fact*rmn_fact);
        System.out.println("bionomial Coefficient is: "+ bc);
    }
}
