import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch < 'A' || ch > 'Z') {
            return ch;
        }
        else {
            return (char) (ch -'A' + 'a');
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            output += toLower(str.charAt(i));
        }
        
        return output;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch < 'a' || ch > 'z') {
            return ch;
        }
        else {
            return (char) (ch -'a' + 'A');
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            output += toUpper(str.charAt(i));
        }
        
        return output;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a String");
        String str = scan.nextLine();
        
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String command = scan.next();

        if (command.equals("lowercase")) {
            System.out.println("Here is your string in lowercase: "+ myToLowerCase(str));
        }
        else {
            System.out.println("Here is your string in uppercase: "+ myToUpperCase(str));
        }

        scan.close();
    }
}
