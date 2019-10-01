package DeBugging;

import java.util.Scanner;

public class Five3 {

    public static void main (String args[])
    {
        int item = 0;
        String output = null;
        final int LOW = 111;
        final int HIGH = 9;
        final int CUTOFF = 500;
        calculateOutPut(item , LOW , HIGH , CUTOFF , output);
    }
    public static void calculateOutPut(int item, final int LOW, final int HIGH, final int CUTOFF, String output)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter item number");
        item = input.nextInt();
        if(item < LOW) {
            output = "Item number too low";
        }
        else if(item > HIGH) {
            output = "Item number too high";
        }
        else if(item > CUTOFF) {
            output = "Valid - in Automotive Department";
        }
        else
            output = "Valid - Item in Housewares Department";
        System.out.println(output);
    }
}

