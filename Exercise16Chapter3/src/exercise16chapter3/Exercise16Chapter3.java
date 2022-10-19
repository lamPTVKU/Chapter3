
// Write an application that prints to the sceen following series: 0, 3, 8, 15, 24, 35, ...

package exercise16chapter3;

import java.util.Scanner;
import java.lang.Math;
public class Exercise16Chapter3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số chặn trên của dãy số : " );
        int chanTren = sc.nextInt();
        for (int i = 1; i <= Math.sqrt(chanTren); i++) {
            System.out.print((int)(Math.pow(i, 2) - 1) + ", ");
        }
    }
    
}
