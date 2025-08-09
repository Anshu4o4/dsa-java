public class primeNum {
    public static boolean  prime(int n){
         for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

         }
         return true;
        
    }

    public static void primee(int n){
         for(int i=2;i<=n; i++){
            if(prime(i)){
                System.out.println(i+" ");
            }
         }
         System.out.println();
    }
    


    public static void main(String[] args) {
       primee(20);
    }
}
