public class SmallestOf3Numbers {
    
    public static void main(String args[]){

        int n1 = 1543, n2 = 4435, n3 = 843213;

        //using ternary/ conditional operator ?:
        int smallest = n3<(n1<n2?n1:n2)?n3:(n1<n2?n1:n2);
        System.out.println(smallest);
    }
}
