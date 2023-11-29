import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter second string:");
        String secondString = scanner.nextLine();

        System.out.println("The length of the first string is " + firstString.length());
        System.out.println("The length of the second string is " + secondString.length());

         if (firstString.length() == secondString.length()) {
            System.out.println("The length of the two strings are the same");
        } else {
            System.out.println("The length of the two strings is not the same");
        }

        if (firstString.equals(secondString)) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }

        scanner.close();
    }
}