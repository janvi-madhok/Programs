public class CopyArrayElementsInAnotherArray {
    
    public static void main(String[] args) {
        
        int arr1[] = {2,1,6,4,8};
        int arr2[] = new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.print("Array 1 Elements : ");

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.print("\nArray 2 Elements : ");

        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
