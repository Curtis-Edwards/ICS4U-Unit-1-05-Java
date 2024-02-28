/*
 * will then calculate the length, so that the result
 * is exactly 1 board foot and return that value. 
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-02-27
 */

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "BoardFoot" program.
*/
final class BoardFoot {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // variables
        boolean validInput = true;

        // input
        System.out.print("Enter the width(inches): ");
        final String boardWidthString = scanner.nextLine().trim();
        System.out.print("Enter the height(inches): ");
        final String boardHeightString = scanner.nextLine().trim();

        // error check
        try {
            if (boardWidthString.isEmpty() || boardHeightString.isEmpty()) {
                System.out.println("Invalid Input.");
                boolean validInput = false;
            } else {
                userGuessInt = Integer.parseInt(userGuessString)
                if () {
                    
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input.");
        }


    }
     /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void BoardFootProgram(String[] args) {
      
        // input
        System.out.print("Enter the width(inches): ");
        final String boardWidth = scanner.nextLine().trim();
        System.out.print("Enter the height(inches): ");
        final String boardHeight = scanner.nextLine().trim();

        try {
            if (userGuessString.isEmpty()) {
        System.out.println("Invalid Input.");
                
        }
        } catch (NumberFormatException ex) {
        System.out.println(invalidInputString);
        }


    }
}
