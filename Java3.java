import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Java3 {
    public static void main(String[] args) {
        String filePath = "D:/kickdrumJava3.csv";

        Map<String, Integer> wordFrequency = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        wordFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
