public class SumOfnNaturalNos {

    public static void main(String args[]){

        int n = 100, sum=0;

        System.out.println("Sum of n natural no using formula : "+(n*(n+1))/2);

        for(int i = 1; i<=n ; i++){
            sum = sum + i;
        }

        System.out.println("Sum of n natural no using for loop : "+sum);
    }
}
