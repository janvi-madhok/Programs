class SwapT{

    int temp;

    public void SwapNumT(int H1, int H2){

        temp = H1;
        H1 = H2;
        H2 = temp;

        System.out.println("After Swap using Temp");
        System.out.println("Hand1 : "+H1);
        System.out.println("Hand2 : "+H2);

    }

}

class Swap{

    public void SwapNum(int H1, int H2){

        H1 = H1+H2; //H1=30 H2=20
        H2 = H1-H2;  //H1=30 H2=10
        H1 = H1-H2;  //H1=20 H2=10


        System.out.println("After Swap without using Temp");
        System.out.println("Hand1 : "+H1);
        System.out.println("Hand2 : "+H2);

    }

}

class SwapB{

    public void SwapNumB(int H1, int H2){

       /*
        * 2^4 2^3 2^2 2^1 2^0
               1   0   0   1  -  9 - y
               0   1   0   1  -  5 - x
     
               x = x^y = 1100    
               y = x^y = 0101 
               x = x^y = 1001
        */

        H1 = H1^H2;
        H2 = H1^H2;
        H1 = H1^H2;

        System.out.println("After Swap using Bitwise Operator XOR");
        System.out.println("Hand1 : "+H1);
        System.out.println("Hand2 : "+H2);

    }

}

class SwapMD{

    public void SwapNumMD(int H1, int H2){

        H1 = H1*H2;  //H1=200 H2=20
        H2 = H1/H2;  //H2=10 H1=200
        H1 = H1/H2;  //H1=20 H2=10


        System.out.println("After Swap using Multiplication and Division");
        System.out.println("Hand1 : "+H1);
        System.out.println("Hand2 : "+H2);

    }

}

public class SwapTwoNumbers{

    public static void main(String args[]){

        int Hand1 = 47;
        int Hand2 = 52;

        System.out.println("Before Swap");
        System.out.println("Hand1 : "+Hand1);
        System.out.println("Hand2 : "+Hand2);

        SwapT swt = new SwapT();
        swt.SwapNumT(Hand1,Hand2);
        Swap sw = new Swap();
        sw.SwapNum(Hand1,Hand2);
        SwapB swb = new SwapB();
        swb.SwapNumB(Hand1,Hand2);
        SwapMD swmd = new SwapMD();
        swmd.SwapNumMD(Hand1, Hand2);

    }
}