package Recursion;

public class Factorial {

    public static int getFcatorial(int  num){
        //base case
        if(num ==1 || num ==0){
            return 1;
        }

        //samll work
        return num*getFcatorial(num-1);

    }


    public static void main(String[] args) {
        int factNUm =3;
        System.err.println(getFcatorial(factNUm));
    }
}
