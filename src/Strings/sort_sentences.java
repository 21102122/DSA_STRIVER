package Strings;

public class sort_sentences {
    public static void main(String[] args) {
       String  s = "is2 sentence4 This1 a3";
        System.out.println( sortSentence(s));
    }
    public static String sortSentence(String s) {
        // Split the sentence into words
        String[] words = s.split(" ");

        // Create an array to hold the sorted words
        String[] sortedWords = new String[words.length];

        // Iterate over each word
        for (String word : words) {
            // Extract the position from the word (last character)
            int position = word.charAt(word.length() - 1) - '0' - 1;

            // Remove the number and place the word in the correct position
            sortedWords[position] = word.substring(0, word.length() - 1);
        }

        // Join the sorted words into a single string
        return String.join(" ", sortedWords);
    }
}
