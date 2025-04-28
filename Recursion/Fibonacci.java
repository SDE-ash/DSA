package Recursion;

public class Fibonacci {
    public static void printFibo(int a, int b , int counter){

        //base case:
        if(counter<=0){
            return;
        }

        //small wrok
        System.err.println(a+b);
        printFibo(b, a+b, counter-1);

    }
    public static void main(String[] args) {
        
        printFibo(-1, 1, 5);

    }
}
