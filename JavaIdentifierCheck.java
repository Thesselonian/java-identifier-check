import java.util.Scanner;
public class JavaIdentifierCheck {
    public static void main(String[] args) {
        // Create instance of scanner
        Scanner keyboard = new Scanner(System.in);
        // Initialize userInput variable
        String userInput = " ";
        while(!userInput.equalsIgnoreCase("Q")) {
            // Ask user to enter variable name
            System.out.println("Enter the name of your Java variable. Enter Q to quit.");
            userInput = keyboard.nextLine();
            if(userInput.equalsIgnoreCase("Q")) {
                break;
            }
            if(!FirstLetter(userInput)) {
                System.out.println("The first character is not a letter.");
            }
            if(CheckContainsSpaces(userInput)) {
                System.out.println("The variable contains spaces. It is illegal");
            }
            if(!OnlyLettersDigits(userInput)) {
                System.out.println("The variable contains characters that are neither a letter or a digit. This is poor style");
            }
            if(FirstLetter(userInput) && !CheckContainsSpaces(userInput) && OnlyLettersDigits(userInput)) {
                System.out.println("The submitted variable begins with a letter, does not contain spaces and only consists of letters and digits, therefore it is good!");
            }
        }
        keyboard.close();
    }

    static Boolean FirstLetter(String userInput) {
        return Character.isLetter(userInput.charAt(0));
    }

    static Boolean CheckContainsSpaces(String userInput) {
        for(int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

    static Boolean OnlyLettersDigits(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
}