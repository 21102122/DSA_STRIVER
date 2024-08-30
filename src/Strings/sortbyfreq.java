package Strings;

import java.util.Arrays;

//https://leetcode.com/problems/sort-characters-by-frequency/description/
public class sortbyfreq {
    public static void main(String[] args) {

    }
    class Solution {
        private int[] frequency = new int[62]; // Frequency array as a class member

        public String frequencySort(String s) {
            // Fill the frequency array
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    frequency[c - '0']++;
                } else if (Character.isLowerCase(c)) {
                    frequency[c - 'a' + 10]++; // Shift index for lowercase letters
                } else if (Character.isUpperCase(c)) {
                    frequency[c - 'A' + 36]++; // Shift index for uppercase letters
                }
            }

            // Create a list of characters based on frequency
            Character[] chars = new Character[62];
            for (int i = 0; i < 10; i++) {
                chars[i] = (char) (i + '0'); // Digits
            }
            for (int i = 10; i < 36; i++) {
                chars[i] = (char) (i - 10 + 'a'); // Lowercase letters
            }
            for (int i = 36; i < 62; i++) {
                chars[i] = (char) (i - 36 + 'A'); // Uppercase letters
            }

            // Sort characters based on their frequency in descending order
            Arrays.sort(chars, (a, b) -> {
                int freqA = getFrequency(a);
                int freqB = getFrequency(b);
                return freqB - freqA;
            });

            // Build the result string
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                int freq = getFrequency(c);
                for (int i = 0; i < freq; i++) {
                    sb.append(c);
                }
            }

            return sb.toString();
        }

        private int getFrequency(char c) {
            if (Character.isDigit(c)) {
                return frequency[c - '0'];
            } else if (Character.isLowerCase(c)) {
                return frequency[c - 'a' + 10];
            } else if (Character.isUpperCase(c)) {
                return frequency[c - 'A' + 36];
            }
            return 0;
        }
    }


}
