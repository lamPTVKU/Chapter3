

//   write an application that prints all of the integer numbers between 1 and 1000 and near each of them(each number will be printed
// in a new line) it prints EVEN or UNEVEN.
package exercise11chapter3;

public class Exercise11Chapter3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(i % 2 == 0) {
                System.out.println("(Even) " + i);
                continue;
            }
            System.out.println("(Uneven) " + i);
            
        }
    }
    
}
