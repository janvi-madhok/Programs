public class SubsetOfString {
    
    public static void main(String[] args) {
        
        // ABC - A B C AB BC ABC

        String str = "ABC";
        int len = str.length();
        int temp=0;
        int substringLen = (len*(len+1))/2;

        String arr[] = new String[substringLen];

        for(int i=0;i<len;i++){

            for(int j=i;j<len;j++){

                arr[temp]=str.substring(i, j+1);
                temp++;

            }
        }

        for(int i=0;i<substringLen;i++){

            System.out.print(arr[i]+" ");

        }


    }
}
