package DeBugging;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Five4 {

    public static void main (String args[])
    {
        int one, two, three, four;
        String str = null;
        String output;
        JOptionPane.showInputDialog(null, "Enter an integer");
        one = parseInt(str);
        JOptionPane.showInputDialog(null, "Enter an integer");
        two = parseInt(str);
        JOptionPane.showInputDialog(null, "Enter an integer");
        three = parseInt(str);
        JOptionPane.showInputDialog(null, "Enter an integer");
        four = parseInt(str);
        if(one > two && one > three && one > four){
            output = "Highest is " + one;
        }
        else if(two > one && two > three && two > four){
            output = "Highest is " + two;
        }
        else if(three > one && three > two && three > four){
            output = "Highest is " + three;
        }
        else output = "Highest is " + four;
        JOptionPane.showMessageDialog(null, output);
    }
}
