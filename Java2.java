import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Java2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter number of strings:");
        // int num = scanner.nextInt();

        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        System.out.println("Enter the strings:");

        for (int i = 0; i < 10; i++) {
            String word = scanner.nextLine();

            list.add(word);
            set.add(word);
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nList Contains:");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("\nSet Contains:");
        for (String str : set) {
            System.out.println(str);
        }

        System.out.println("\nFrequency of the words:");
        for (String str : set) {
            System.out.println("Word = " + str + ", Frequency = " + wordFrequency.get(str));
        }

        scanner.close();
    }
}
