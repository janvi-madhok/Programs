public class PalindromeNumber{

    public static void main(String str[]){

        // 1234 - 4321 : no, 12121 - 12121 : yes
        // 121/10 = 12    121%10 = 1 
        // 12/10 = 1      12%10 = 2
        // 1/10 = 0        1%10 = 1

        int num = 13131, sum=0, remainder=0;

        int temp = num;

        while(num!=0){
            remainder = num%10;
            sum = (sum*10)+remainder;
            num = num/10;
        }

        if(temp == sum)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not Palindrome Number");

       
    }
}