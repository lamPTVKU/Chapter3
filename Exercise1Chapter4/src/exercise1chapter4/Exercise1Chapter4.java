// Write an OOP apllication with a method to find  the smallest number among three  numbers.
package exercise1chapter4;

public class Exercise1Chapter4 {

    public static void main(String[] args) {
       int max = maxThreeNumbers(5, 42, 20);
        System.out.println("Max = " + max);
    }
    public static int maxThreeNumbers(int a, int b, int c) {
        int max = a > b ? a : b;
        return max > c ? max : c;
    }
    
}
