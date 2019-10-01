package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice;
        int rand1 = rand.nextInt(100) + 1;

        System.out.println("Please pick a number between 1 and 100 >>>");
        choice = input.nextInt();

        if(choice == rand1){
            System.out.println("Congrats, you are a good guesser.");
        }
        else if(choice > rand1){
            System.out.println("Nope, it was lower " + rand1);
        }
        else if(choice < rand1){
            System.out.println("Nope, it was higher " + rand1);
        }
    }
}
