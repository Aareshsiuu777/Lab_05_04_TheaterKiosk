import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;

        // Prompt user for age
        System.out.print("Please enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();

            // Only if they are 21 or older
            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
            // Note: Program does nothing if under 21
        }
    }
}