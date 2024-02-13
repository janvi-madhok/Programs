public class LeftRotateArray {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        //int n=1;

       int first = arr[0];
       int i=0;

       for(i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];
       }

       arr[i]=first;

       for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

        System.out.println();

        /*For n=3 */
        int arr1[] = {1,2,3,4,5};
        int n=3,m=0;
        int ndup=n;

        int arr2[] = new int[arr1.length];


        for(int k=0;k<n;k++){
            arr2[k]=arr1[k];
        }
        
        while(ndup!=0){
        for(int l=0;l<arr1.length-1;l++){
            arr1[l]=arr1[l+1];
        }
        ndup--;
    }

        for(int p=arr1.length-n;p<arr1.length;p++){
            arr1[p]=arr2[m];
            m++;
        }

        for(int s=0;s<arr1.length;s++){
            System.out.print(arr1[s]+" ");
        } 

        
    }
}
