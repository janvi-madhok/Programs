public class CharactersInString {
    
    public static void main(String[] args) {
        
        String str = "Java Programming Language";
        int charCount = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' ')
            charCount++;
        }

        System.out.println("Length of String : "+str.length());

        System.out.println("Characters in String : "+charCount);

    }
}
