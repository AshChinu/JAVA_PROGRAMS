package Test_Programs;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Word_Count {
    public static void main(String[] args) {
        String input = "This is a IS A duplicate string";
        Map<String, Integer> wordCountMap = countDuplicateWords((input.toLowerCase()));
        printWordCounts(wordCountMap);
    }

    private static Map<String, Integer> countDuplicateWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    private static void printWordCounts(Map<String, Integer> wordCountMap) {
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + " " + count + " time" + (count > 1 ? "s" : ""));
        }
    }
}
/*
This program first converts the input string to lowercase using toLowerCase() 
to ensure that the counting is case-insensitive.
It then uses a HashMap to count the occurrences of each word in the input string. 
Finally, it prints the words that appear more than once, along with their respective counts.
*/
