
import java.util.Scanner;
public class JavaIdentifierCheck {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = " ";
        System.out.println("Enter the name of your Java variable.");
        userInput = keyboard.nextLine();
        System.out.println(FirstLetter(userInput));

        keyboard.close();
    }

    static Boolean FirstLetter(String userInput) {
        return Character.isLetter(userInput.charAt(0));
    }
}