package Examples;

import java.util.Scanner;

public class WeekDay{

    public static void main(String[] args)
    {
        String day;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day during the week for your schedule? >>>>  ");
        day = input.nextLine();
        switch(day)
        {
            case "Monday":
                System.out.print("Reserve room for Friday meeting");
                break;
            case "Tuesday":
                System.out.print("Prepare Powerpoint slides.");
                break;
            case "Wednesday":
                System.out.print("Send out meeting reminders.");
                break;
            case "Thursday":
                System.out.print("Get ready for the football game.");
                break;
            case "Friday":
                System.out.print("Wear spirit wear for the game. SPACE THEME");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It is the weekend which means getting ready for Monday.");
                break;
            case "Humpday":
                System.out.println("This is not as funny as I think it is. ");
            default:
                System.out.print("That day does not exist to the know realm.");
        }
    }
}