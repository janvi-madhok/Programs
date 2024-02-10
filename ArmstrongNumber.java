public class ArmstrongNumber{

    public static void main(String args[]){

        //153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

        int number = 88593477, digit = 0, noOfDigits = 0;
        int n1 = number, n2 = number;
        int result = 0;

        while(n1!=0){
            n1 = n1/10;
            noOfDigits++;
        }

        System.out.println(noOfDigits);

        while(n2!=0){
            digit = n2%10;
            result = result + (int)Math.pow(digit,noOfDigits);
            n2 = n2/10;
        }

        System.out.println(result);
        if(number == result)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong Number");

    }
}