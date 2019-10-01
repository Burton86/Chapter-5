package ASSIGNMENTS;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.print("Please enter any number >>>  ");
        int numEntered = 25;
        String result;
        Scanner input = new Scanner(System.in);
        numEntered = input.nextInt();
        if (numEntered % 2 == 0)
            result = " This number is Even";
        else
            result = " This number is Odd";

        System.out.println(result);
    }
}
