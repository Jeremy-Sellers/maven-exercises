import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number or sentence");
        String userText = userInput.nextLine();
        System.out.println("You entered: ");
        System.out.println(userText);

        if(StringUtils.isNumeric(userText)){
            System.out.println( userText + " is a number");
        }
        else{
            System.out.println(userText + " is not a number");
        }

        System.out.println("Flipeed case: " + StringUtils.swapCase(userText));
        System.out.println("Reversed: " + StringUtils.reverse(userText));

    }
}
