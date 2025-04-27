package Recursion;

public class Foundation {

    public static void printNum(int num){
        if(num ==0){
            return;
        }

        printNum(num-1);
        System.err.println(num);


    }

    public static String printNameNTimes(String name, int times){

        if(times ==1){

            System.err.println(name);
            return name;
        }

        System.err.println(name);
        printNameNTimes(name, times-1);
        return name;

    }
    public static void main(String[] args) {

        System.out.println("hello world");

        // System.err.println(printNameNTimes("akash", 5));


        // Your code herestatic

        printNum(5);
    }
}