import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static String countABC(String str) {

        int strlen = str.length();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int x = 0; x < strlen; x++) {
            char charloc = str.charAt(x);
            if (charloc == 'a') {
                a = a + 1;
                String aRemover = str.substring(x);
            } else if (charloc == 'b') {
                b = b + 1;
                String bRemover = str.substring(x);
            } else if (charloc == 'c') {
                c = c + 1;
                String cRemover = str.substring(x);
            } else {
                boolean jakethegoat = true;

            }
        }
        String statement = ("It had " + a + "a's, " + b + " b's, and " + c + " c's");
        return statement;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int answer=str.indexOf("the");
        int answerCaps = str.indexOf("The");
        if (answer == -1 && answerCaps==-1) {
            return false;
        }else{
            return true;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {

        int lenstr = str.length();
        int halfLen= lenstr/2;
        for (int p=0,p<halfLen, ++)
        char a = str.charAt(x);
        char b = str.charAt(lenstr-1);
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String y = countABC("jake");
        System.out.println(y);
    }
}
