
// write an application that prints to the scren;
package exercise14chapter3;

import java.util.Scanner;

public class Exercise14Chapter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài cạnh đáy hình tam giác (yêu cầu số lẻ để vẽ cho đẹp hihi :Đ  : ");
        int width = sc.nextInt();
        int i;
        int idxSpace;
        if(width % 2 == 0) {
            idxSpace = width / 2  - 1;
            i = 2;
        }
        else {
            idxSpace = width / 2;
            i = 1;
        }
  
        while(true) {
            for (int j = 1; j <= idxSpace; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
            i += 2;
            idxSpace--;
            if( i > width)
                break;
        }
  
    }
    
}//                 *  *
//               *  *  *  *                          *
//            *  *  *  *  *  *                    *  *  *  
//         *  *  *  *  *  *  *  *              *  *  *  *  *