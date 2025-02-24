package io.nology.j8_hash_maps_and_streams;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge {

    public Challenge() {
    }

    /**
     * Counts the occurrences of each word in a given sentence and returns a HashMap
     * where the keys are words and the values are the number of occurrences.
     *
     * @param sentence - The sentence to analyse
     * @return A HashMap with words as keys and their occurrences as values
     */
    public HashMap<String, Integer> countWordOccurrences(String sentence) {

        String[] words = sentence.split("\\s+"); //splitting sentence into words using the regex delimiter \\s+

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            //remove punctuation and convert to lower case for case insensitivity
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
    /**
     * Merges two HashMaps containing student names and their scores. If a student
     * appears in both maps, the scores should be summed.
     *
     * @param map1 - The first HashMap of student scores
     * @param map2 - The second HashMap of student scores
     * @return A merged HashMap with summed scores for students appearing in both
     *         maps
     */
    public HashMap<String, Integer> mergeStudentScores(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {

        HashMap<String, Integer> mergedMaps = new HashMap<String, Integer>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMaps.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMaps;
    }

    /**
     * Finds the most frequent character in a string and returns it. If there is a
     * tie,
     * return any one of the most frequent characters.
     *
     * @param input - The input string
     * @return The most frequent character
     * @throws IllegalArgumentException ("Input string must not be null or empty")
     *                                  if the input is empty
     */
    public char findMostFrequentCharacter(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty");
        }

        HashMap<Character, Integer> frequencyCheck = new HashMap<>();

        char answer = input.charAt(0);
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequencyCheck.put(ch, frequencyCheck.getOrDefault(ch, 0) + 1);

            if (frequencyCheck.get(ch) > count) {
                answer = ch;
                count = frequencyCheck.get(ch);
            }
        }

        return answer;
    }

    /**
     * Calculates the average length of words in a list using streams.
     *
     * @param words - The list of words
     * @return The average length of the words
     */
    public double calculateAverageWordLength(List<String> words) {

        double averageLength = words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0);

        return averageLength;
    }

    /**
     * Filters a list of integers to return only prime numbers using streams.
     * 
     * (write a "helper method" checking if a number isPrime)
     *
     * @param numbers - The list of integers
     * @return A list of prime numbers
     */
    public List<Integer> filterPrimes(List<Integer> numbers) {

         return numbers.stream()
                 .filter(n -> isPrime(n))
                 .collect(Collectors.toList());
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Concatenates a list of strings into a single string, separated by commas,
     * using streams.
     *
     * @param strings - The list of strings
     * @return A single concatenated string
     */
    public String concatenateWithCommas(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining(", "));
    }

}
