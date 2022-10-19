
// Write an application that calculates the sum of all number between 1.. 100 that divides in 7 without a residual
package exercise10chapter3;

public class Exercise10Chapter3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
    
}
