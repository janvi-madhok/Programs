public class NthPrimeNumber{

    public static void main(String args[]){

        // n=5 i.e. first prime number

        int number = 25;
        int count = number;
        int num = 1;
        int flag = 0;

        while(count!=0){
            num++;
            for(int i=2; i<=num/2; i++){
                flag = 0;
                if(num%i == 0){
                    flag = 1;
                    break;
                }
            }
           if(flag == 0) 
           count--;
        }

        System.out.println(number+"th Prime Number : "+num);
    }
}