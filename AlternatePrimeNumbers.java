class PrimeNumbers{

    public void PrimeNumber(int number){

        int num=1,j=0;
        int flag=0;
        int arr[] = new int[number/2];

        while(num<number){
            num++;
            flag=0;
            for(int i=2;i<=num/2;i++){
                if(num%i == 0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arr[j]=num;
                j++;
            }
        }

        System.out.println("All prime nos upto "+number+" : ");

        for(int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println("\nAlternate prime nos upto "+number+" : ");

        for(int k=0;k<j;k+=2){
            System.out.print(arr[k]+" ");
        }
    }

}
public class AlternatePrimeNumbers{

    public static void main(String args[]){

        int n = 15;

        PrimeNumbers pn = new PrimeNumbers();
        pn.PrimeNumber(n);

    }
}