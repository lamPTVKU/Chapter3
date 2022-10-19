

//The following application prints the factorial of 6. The computation of 6! is done using a static method  that calculates the factorial of the nunber that it gets.
//Complete the missing lines
package exercise20chapter3;

import java.util.Scanner;

public class Exercise20Chapter3 {

    public static void main(String[] args) {
        long number, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần tính giai thừa: ");
        number = sc.nextLong();
        result = factorial(number);
        System.out.print("Kết quả là: " + result);
        
        
    }
    public static long factorial(long number) {
        long result = 1 ;
        for (int i = 1; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
    
}
