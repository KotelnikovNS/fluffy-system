package Lesson4_HW;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Green", "Red", "Blue", "White", "Black", "Yellow", "Purple", "Pink", "Grey", "Brown"};
        Map<String, Integer> uniqWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (words.containsKey(words[i]))
                words.put(words[i], uniqWords.get(words[i]) + 1);
            else
                words.put(words[i], 1);
        }
        System.out.println(uniqWords);
    }
}