

// Write an application that prints to the screen following series 1,  3,  9, 27, ..
// The application should print the first 10 numbers of series
package exercise19chapter3;

import java.lang.Math;
public class Exercise19Chapter3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print( (int)Math.pow(3, i) + ", ");
        }
    }
    
}
