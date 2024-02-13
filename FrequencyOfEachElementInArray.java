public class FrequencyOfEachElementInArray {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,8,3,2,2,2,5,1};

        int arr1[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]=arr1[arr[i]]+1;
        }

        System.out.println();

        //array that contains frequency of each array element
        for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+" ");
        }

        System.out.println();

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0)
            System.out.println("Frequency of "+i+" : "+arr1[i]+" ");
         }
 







    }
}
