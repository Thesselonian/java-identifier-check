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
            System.out.println("First character is letter: " + FirstLetter(userInput));
            System.out.println("Variable contains spaces: " + CheckContainsSpaces(userInput));
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
}