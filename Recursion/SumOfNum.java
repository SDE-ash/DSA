package Recursion;

public class SumOfNum {

    public static int getAllSum(int num){
        //base case:
        if(num == 1 || num ==0){
            return num;
        }

        return num+getAllSum(num-1);
    }
    public static void main(String[] args) {
        
        int num =5;
        System.err.println(getAllSum(num));
    }
}
