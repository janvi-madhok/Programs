public class GCD{

    public static void main(String args[]){

        /*Factors of 12: 1, 2, 3, 4, 6, 12
        Factors of 8: 1, 2, 4, 8
        Common Factors: 1, 2, 4
        Greatest Common Factor/ HCM : 4  
         */
        int n1 = 60, n2 = 36;
        int gcd=1;

        //running loop from 1 to the smallest of both numbers  
        for(int i=1; i<=n1 && i<=n2; i++){
            //ith number that divides both numbers
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }

        System.out.println("GCD of "+n1+" and "+n2+" : "+gcd);


}
}