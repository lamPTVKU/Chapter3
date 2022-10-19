
// Develop a stand alone application that prints each of the numbers between 0 and 777 (the numbers should be printed in Octal base)
package exercise22chapter3;


public class Exercise22Chapter3 {

    public static void main(String[] args) {
        printOctal();
    }
    public static void printOctal() {
        int i = 0;
        while (true) {            
            String str = Integer.toOctalString(i);
            System.out.println(str);
            i++;
            if(str.equals("777"))
                break;
        }
    }
}
