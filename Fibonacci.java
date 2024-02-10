public class Fibonacci{

    public static void main(String args[]){

        // 0 1 1 2 3 5 8 13 
        int firstNo = 0;
        int secondNo = 1;
        int nextNo = 0;
        int n = 8;

        System.out.print(firstNo+" "+secondNo+" ");
        for(int i=0;i<n-2;i++){
            nextNo=firstNo+secondNo;
            System.out.print(nextNo+" ");
            firstNo = secondNo;
            secondNo = nextNo;
           
        }

    }
}