public class LargestOf3Numbers {

    public static void main(String[] args) {
        
        int no1 = 1000;
        int no2 = 7885;
        int no3 = 285;

        if(no1>no2 && no1>no3){
            System.out.println("MAX Number is no1 : "+no1);
        }
        else if(no2>no3){
            System.out.println("MAX Number is no2 : "+no2);
        }
        else{
            System.out.println("MAX Number is no3 : "+no3);
        }
    }
    
}
