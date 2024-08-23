package Strings;

public class reverseWords {
    public static void main(String[] args) {
        String s = "  the sky is blue  ";
        String reversed = reverseWords(s);
        System.out.println("Reversed: \"" + reversed + "\"");
    }

    public static String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Split the string into words based on spaces
        String[] words = s.split("\\s+");

        // Use StringBuilder to build the reversed sentence
        StringBuilder reversed = new StringBuilder();

        // Iterate backwards over the words array
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words, but not after the last word
            }
        }

        return reversed.toString();
    }
}

