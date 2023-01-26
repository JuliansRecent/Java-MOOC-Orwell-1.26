
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for an integer
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        // Print the string Orwell if the number is exactly 1984
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
