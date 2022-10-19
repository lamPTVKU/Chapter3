
// Write an application that calculates the sum of all the integer number between 1 (included) and 100 (included)
package exercise7chapter3;

public class Exercise7Chapter3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum (1..100) = " + sum);
    }
    
}
