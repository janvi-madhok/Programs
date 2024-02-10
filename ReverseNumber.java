public class ReverseNumber{

    public static void main(String args[]){

        int number = 23456, digit = 0, reversedNo = 0;
        int n1 = number;

        while(n1!=0){
            digit = n1%10;
            reversedNo = reversedNo*10 + digit;
            n1 = n1/10;
        }

        System.out.println(number+" : "+reversedNo);
    }
}