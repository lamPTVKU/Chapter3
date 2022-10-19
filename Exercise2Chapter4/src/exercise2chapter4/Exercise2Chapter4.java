
// write an OOP application with a method to count all vowels in a string
package exercise2chapter4;

public class Exercise2Chapter4 {


    public static void main(String[] args) {
        int count = countVowels("Lam Dep trai");
        System.out.println("Số nguyên âm: " + count);
    }
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o')
                count++;
            else if(str.charAt(i) == 'a' ||str.charAt(i) == 'i')
                count++;
        }
        return count;
    }
    
}
