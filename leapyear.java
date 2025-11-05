import java.util.Scanner;

public class leapyear{
    public static boolean isleapyear(int year){
        if(year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0){
            return false;
        }

        else if(year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main (String[] args)
    {
        System.out.println("1900" +  isleapyear(1900));
                System.out.println("2000" +  isleapyear(2000));
            System.out.println("2004" +  isleapyear(2004));
                    System.out.println("1993" +  isleapyear(1993));
            }
}