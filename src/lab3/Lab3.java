/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author saum
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myScanner = new Scanner(System.in);
        
        //ask user to enter a number
        System.out.println("Enter integer number to convert to binary: ");
        int number = myScanner.nextInt();
        //call function to convert number to binary and output
        System.out.println("The number " + number + " in binary is: " + decimalToBinary(number));
    }
    
    public static String decimalToBinary(int number) {
        String result = "";
        boolean reiterate = true;   
        
        //while loop checks while boolean veraible is true
        while(reiterate) {
            //Converts integer to string and concatanates it to variable
            //Also taking the remainder of the number divided by zero
            result = Integer.toString(number%2) + result;
            //divideing the number by zero to get next value
            number /= 2;
            //checks for exit case, when the number reaches 0
            if (number == 0) reiterate = false;
        }
        //returns the string value of the binary number
        return result;
    }
    
}

