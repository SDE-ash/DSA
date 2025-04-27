package Recursion;

public class Foundation {

    public static int meanOfArray(int arr[], int ptr, int sum){
        if(ptr == arr.length){
            return sum/arr.length;
        }

        //main kam

        return meanOfArray(arr, ptr+1, sum+=arr[ptr]);
        


    }

    public static void oppNum(int num){
        if(num ==1){
            System.err.println(num);
            return;
        }

        // main work
        System.err.println(num);
        oppNum(num-1);
    }

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

        //printNum(5);

        //oppNum(8);
        int arr[] = {1, 2, 3, 4, 5};
        System.err.println(meanOfArray(arr, 0, 0));
    }
}