
import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String inputString = scanner.nextLine();

        int count = countAs(inputString);

        System.out.println("Number of 'A's in the string: " + count);

    }

    public static int countAs(String inputString) {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = Character.toLowerCase(inputString.charAt(i));

            if (c == 'a') {
                count++;
            }
        }

        return count;
    }
}