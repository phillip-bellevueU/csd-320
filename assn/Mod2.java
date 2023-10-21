/* 
Module2 Phillip Thoendel 10/18/2023
This program will take user input, do math to it and print the result
This program will also demonstrate the use of JOptionPane
*/

///* 
import javax.swing.*; //allows for the use of JOptionPane

public class Mod2 {
    public static void main(String[] args) {

        //placeholders to convert strings to doubles
        double kgWater, minTemp, maxTemp, totalJoules;

        //declaring string variables for input
        String strKgWater, strMinTemp, strMaxTemp;
        
        //calls window which prompts user for input
        strKgWater = JOptionPane.showInputDialog(null, "Please enter the amount of water in kilograms", "Input dialog", JOptionPane.QUESTION_MESSAGE);
        strMinTemp = JOptionPane.showInputDialog(null, "Please enter the starting temperature in degrees C", "Input dialog", JOptionPane.QUESTION_MESSAGE);
        strMaxTemp = JOptionPane.showInputDialog(null, "Please ending temperature in degrees C", "Input dialog", JOptionPane.QUESTION_MESSAGE);


        //string input must be converted to double to do math to it
        kgWater = Double.parseDouble(strKgWater);
        minTemp = Double.parseDouble(strMinTemp);
        maxTemp = Double.parseDouble(strMaxTemp);

        // fomula for joules
        totalJoules = kgWater * (maxTemp - minTemp) * 4184;

        //displays results pane
        JOptionPane.showMessageDialog(null, totalJoules + " Joules", "Total Joules Required", JOptionPane.INFORMATION_MESSAGE);  
    }
}    //*/

/*
//alternate version using scanner class 

import java.util.*;

public class Mod2 {
    public static void main(String[] args) {

        //declare variables
        double minTemp, maxTemp, kgWater, totalJoules;

        //initialize scanner to take user input
        Scanner input = new Scanner(System.in);

        //statement prompting user for input
        System.out.print("Enter the minimum temp: ");
        minTemp = input.nextDouble(); //converts to double

        System.out.print("Enter the maximum temp: ");
        maxTemp = input.nextDouble();

        System.out.print("Enter the water weight in kg: ");
        kgWater = input.nextDouble();

        //formula to determine total joules
        totalJoules = kgWater * (maxTemp - minTemp) * 4184;

        //prints final statement
        System.out.println("\n To bring " + kgWater + " of water from " + minTemp + " degrees Celcius to " +
                             maxTemp + " degrees Celcius will require " + totalJoules + " joules of energy");

    }
}  */
