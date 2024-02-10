public class PrimeNumber{

    public static void main(String args[]){

        // 3-prime, 5-prime, 6-not prime

        int number = 89, flag=0;

        if(number==0 || number==1){
            System.out.print("Not Prime");
        }

        else{
        for(int i=2;i<number/2;i++){
            if(number%i==0)
            {
                System.out.print("Not Prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.print("Prime");
    }
    
}

}