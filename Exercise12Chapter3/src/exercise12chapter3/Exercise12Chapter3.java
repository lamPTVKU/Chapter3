// Write an application that prints a recangle of stars;
package exercise12chapter3;

import java.util.Scanner;

public class Exercise12Chapter3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a width : ");
        int width = sc.nextInt();
        System.out.print("Enter a height : ");
        int height = sc.nextInt();
        for(int i = 1; i<= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*  ");
            }
            System.out.printf("\n");
        }
    }
    
}
