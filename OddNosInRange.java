public class OddNosInRange {
    
    public static void main(String[] args) {
        
        int r1 = 1, r2 = 100;

        System.out.print("Odd numbers between "+r1+" and "+r2+" : ");

        for(int i=r1; i<=r2; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
