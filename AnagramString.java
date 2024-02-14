import java.util.Arrays;

public class AnagramString {
    
    public static void main(String[] args) {
        
        String str1 = "DANS";

        String str2 = "SAND";

        int flag = 0;

        if(str1.length() != str2.length())
        System.out.println("Strings are Not Anagram as String Length Differs");

        else{

            str1.toLowerCase();
            str2.toLowerCase();

            char arrc1[] = str1.toCharArray();
            char arrc2[] = str2.toCharArray();

            Arrays.sort(arrc1);
            Arrays.sort(arrc2);

            //Arrays.equals(arrc1, arrc2)
            for(int i=0;i<arrc1.length;i++){
                if(arrc1[i]!=arrc2[i])
                flag = 1;
            }

            if(flag == 0)
            System.out.print("Strings are Anagram");
            else
            System.out.print("Strings are Not Anagram");

            
        }
    }
 }
