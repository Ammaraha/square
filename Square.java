/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import java.io.PrintStream;

/**
 *
 * @author ahashmi
 */
//clas declaration
public final class Square {

    private double side;//private instance
    private double area; // private instance
    //constructor without argument

    public Square() {
       setSide(1.0);
    }

    public Square(double side) {
        setSide(side);
    }
    //method set side 

    public void setSide(double setside) {
        if (setside < 0 )
        {
            side = 1.0;
        }
        else{
        side = setside;
        }
        computeArea();
    }

    public double getside() {
        return this.side;
    }

//constructor for square set method to set a side
//method to compute area
    public void computeArea() {
        this.area = this.side * this.side;
       //  System.out.printf("The area is %s\n", this.area);
    }//end compute area

    @Override
    public String toString() {
        return String.format("%s %.2f %s %.2f" ,"Side: ",this.side, "Area: ",  this.area);
    }
}
