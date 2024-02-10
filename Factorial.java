public class Factorial{

    public static void main(String args[]){

        // 5!=5*4*3*2*1

        int number = 5, result = 1;

        for(int i=number; i>0; i--){
            result = result * i ;
        }

        System.out.println(number+"! = "+result);
    }
}