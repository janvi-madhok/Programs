public class ReverseStringWordByWord {
    
    public static void main(String[] args) {
        
        String str = "HardWork Beats Luck";

        System.out.println("Original String : "+str);

        StringBuffer sb = new StringBuffer();

        String arr[] = new String[str.length()];

        arr=str.split(" ");

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        for(int i=arr.length-1;i>=0;i--){
            sb = sb.append(arr[i]).append(" ");
        }

        str = sb.toString().trim();

        System.out.println("Reversed String Word By Word : "+str);


    }
}
