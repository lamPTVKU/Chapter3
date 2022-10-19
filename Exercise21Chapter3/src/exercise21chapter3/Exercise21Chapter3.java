
// Develop a stand alone application that prints each one of the numbers between 0 and FFFF (the numbers should be printed in Hexdecimal base)
package exercise21chapter3;

public class Exercise21Chapter3 {
    
    public static void main(String[] args) {
        printHex();
    }
    public static void printHex() {
        int i = 0;
        while (true) {   
            String str = Integer.toHexString(i);
            System.out.println(str);
            i++;
            if(str.equals("ffff"))
                break;
        }
    }
}
