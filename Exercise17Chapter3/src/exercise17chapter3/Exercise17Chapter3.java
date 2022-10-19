// Write an application that prints to the sceen following series: 1, 3, 7, 15, 31, 63, ...
package exercise17chapter3;

import java.util.Scanner;

public class Exercise17Chapter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số chặn trên của dãy số : " );
        int chanTren = sc.nextInt();
        int idx;
        for (idx = 0; (idx * 2 + 1) <= chanTren; idx *= 2) {
            System.out.print((idx * 2 +1)  + ", ");
            idx++;
        }
    }
    
}
