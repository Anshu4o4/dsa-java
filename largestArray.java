public class largestArray {
    public static int largest_Array(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,54,6,7,78};
        System.out.println("largest value is "+ largest_Array(numbers));
}
}