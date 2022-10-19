// Write an application that calculates and prints the biggest number between 1 (included) and 100 (included) that divides in 7 without a residual.

package exercise9chapter3;
public class Exercise9Chapter3 {

    public static void main(String[] args) {
        
        for (int i = 100; i >= 1; i--) {
            if(i % 7 == 0){
                System.out.println(i);
                break;
            }
            
        }
    }
    
}
