public class PerfectSquare {
    
    public static void main(String[] args) {
        
        int number = 1600, i, flag = 0;

        for(i=1;i<number;i++){
            if(number%i == 0 && i*i == number){
                System.out.println(number+" is a perfect square.");
                flag=1;
            }

        }
        if(i==number && flag==0){
            System.out.println(number+" is not a perfect square.");
        }
    }
}
