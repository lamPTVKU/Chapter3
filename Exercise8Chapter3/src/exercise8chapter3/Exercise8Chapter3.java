
// Write an application that calculates and prints the average of all the integer numbers between 1 (included) and 100 (included)
package exercise8chapter3;

public class Exercise8Chapter3 {

    
    public static void main(String[] args) {
        int idx = -1;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            idx++;
        }
        System.out.println("Average (1..100) : " + ((double)sum / idx));
    }
    
}
