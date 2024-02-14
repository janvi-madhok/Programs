public class CountOfVowelsAndConsonantsInString {
    
    public static void main(String[] args) {
        
        String str = "Honesty is the best Policy";
        int vCount = 0 , cCount = 0, c = 0;

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)=='a' || str.charAt(i)=='A'|| 
            str.charAt(i)=='e' || str.charAt(i)=='E' || 
            str.charAt(i)=='i' || str.charAt(i)=='I' || 
            str.charAt(i)=='o' || str.charAt(i)=='O' || 
            str.charAt(i)=='u' || str.charAt(i)=='U')
            vCount++;

            else if(str.charAt(i)==' ')
            c++;

            else
            cCount++;
        }

        System.out.println("Count of Vowels in String : "+vCount);

        System.out.println("Count of Consonants in String : "+cCount);


    }
}
