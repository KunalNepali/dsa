import java.util.Scanner;
//first ten num: 1, 1, 2, 3, 5, 8, 13, 21, 34, and 55.
public class Fibo{
    public static int fibonacci(int n){
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
    public static void main (String[] args)
    {
        System.out.println("Result for 1: " + fibonacci(1));
        System.out.println("result for 2: " + fibonacci(2));
        System.out.println("Result For 5:" + fibonacci(5));
    }
}