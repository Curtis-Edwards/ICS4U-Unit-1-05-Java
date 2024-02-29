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
        final Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Enter the width(inches): ");
        final String boardWidthString = scanner.nextLine().trim();
        System.out.print("Enter the height(inches): ");
        final String boardHeightString = scanner.nextLine().trim();

        // error check
        try {
            if (boardWidthString.isEmpty() || boardHeightString.isEmpty()) {
                System.out.println("Invalid Input.");
            } else {
                final float boardWidthFloat = Float.parseFloat(boardWidthString);
                final float boardHeightFloat = Float.parseFloat(boardHeightString);
                if (boardWidthFloat < 0 || boardHeightFloat < 0) {
                    System.out.println("Invalid Input.");
                } else {
                    // process
                    final float boardLength = BoardFootProgram(boardWidthFloat, boardHeightFloat);
                    // output
                    System.out.println("The wood should be" + boardLength + "inch(es) long.");
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input.");
        }
        System.out.println("\nDone.");
    }
    
    /**
    * The starting BoardFootProgram() function.
    *
    * @param args No args will be used
    */
    public static float BoardFootProgram(float boardWidthFloat, float boardHeightFloat) {
        final float boardLength = 144 / (boardWidthFloat * boardHeightFloat);
        return boardLength;
    }
}
