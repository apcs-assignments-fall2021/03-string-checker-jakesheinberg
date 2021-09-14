import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {

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
        return a + b + c;
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
        String palin= "";
        int x =0;
        int lenstr = str.length()-1;
        for (int p=lenstr; p>=0; p--) {
            char a = str.charAt(p);
            palin = palin+a;
        }
        if(palin.equals(str)){
            return true;
        }else {
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean y = isPalindrome("racecar");
        System.out.println(y);
    }
}
