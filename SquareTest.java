/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;
import java.util.Scanner;

/**
 *
 * @author ahashmi
 */
public class SquareTest {
     // set up GUI components and instantiate new MyRectangle
 public static void main( String args[] )
 {
 Scanner input = new Scanner( System.in );

 // create a new Square with no initial values
 Square square = new Square();

 System.out.print( "Please enter a double value for the side of the square: " );

 double double1 = input.nextDouble();

 square.setSide( double1 );

System.out.println( square ); // see the results of the test
 } // end main
} // end class SquareTest


