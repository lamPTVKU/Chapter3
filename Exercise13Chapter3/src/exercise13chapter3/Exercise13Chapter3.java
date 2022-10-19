// write an application that prints a shape of stars
package exercise13chapter3;

import java.util.Scanner;


public class Exercise13Chapter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh max: ");
        int widthMax = sc.nextInt();
        System.out.print("Nhập độ dài cạnh min (yêu cầu cùng chẵn, lẻ với max): ");
        int widthMin = sc.nextInt();
        int idxSpace = 0;
        for(int i = widthMax; i >= widthMin;) {
            
            for (int k = 1; k <= idxSpace; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
                }
            System.out.printf("\n");
            i-=2;
            idxSpace++;
        }
        idxSpace--;
        for (int i = widthMin; i <= widthMax; i+=2) {
            for (int k = 1; k <= idxSpace; k++) {
                System.out.print("   ");  
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.printf("\n");
            idxSpace--;
        }
    }
    
}
