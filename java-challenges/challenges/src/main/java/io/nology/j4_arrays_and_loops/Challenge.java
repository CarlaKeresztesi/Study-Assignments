package io.nology.j4_arrays_and_loops;

import java.util.Arrays;


public class Challenge {

    public Challenge() {
    }

    /**
     * A method to check if two strings are anagrams of each other.
     * 
     * Two strings are considered anagrams if they contain the same characters in
     * the same frequency, but possibly in a different order (reordered characters
     * of one string create the second string)
     * 
     * @param str1 the first string
     * @param str2 the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) { //checking lengths are equal, otherwise not anagrams
            return false;
        }
        char[] arr1 = str1.toCharArray(); //converting string to char arrays
        char[] arr2 = str2.toCharArray(); //so they can be sorted as character arrays

        Arrays.sort(arr1); //sorts array alphabetically
        Arrays.sort(arr2); //if the strings are anagrams, the characters will be in the same order

        return Arrays.equals(arr1, arr2); //compares the sorted arrays - if identical => they are anagrams
    }

    /**
     * A method to print characters between two given characters
     *
     * @param start the starting character (A)
     * @param end   the ending character (P)
     * @return returns all the characters between the start and end
     *         (`ABCDEFGHIJKLMNOP`)
     * 
     */
    public void printCharactersBetween(char start, char end) {
          if (start > end) {
              System.out.println("Start character should be less than or equal to end character");
              return;
          }
          for (char c = start; c <= end; c++) {
              System.out.println("Print the character with a space in between");
          }
        System.out.println();
//          public static main void(String[] args) {
//              CharacterPrinter printer = new CharacterPrinter;
//
//              printer.printCharactersBetween('A', 'P');
//
//              printer.printCharactersBetween('M', 'R');
//        }//end of main

    }

    /***
     * A method to find the middle item(s) in a given string array
     * 
     * If the array has an odd number of items, return an array containing the
     * single middle item.
     * If the array has an even number of items, return an array containing the two
     * middle items.
     * If the array is empty, return an empty string array.
     *
     * @param array the input array of strings
     * @return an array containing the middle item(s)
     */
    public String[] findMiddleItems(String[] array) {
        return new String[] {};
    }

    /***
     * A method to merge two sorted integer arrays into a single sorted array
     *
     * @param array1 the first sorted integer array
     * @param array2 the second sorted integer array
     * @return a new sorted integer array containing all elements from both input
     *         arrays
     */
    public int[] mergeSortedArrays(int[] array1, int[] array2) {
        return new int[] {};
    }

    /***
     * A method to find the sum of all odd numbers in an array
     *
     * @param array the input array of integers
     * @return the sum of all odd numbers in the array
     */
    public int sumOfOddNumbers(int[] array) {
        return 1;
    }

    /***
     * A method to find the maximum subarray sum in a given integer array
     * 
     * Example:
     * Input: array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
     * Output: 6 (The maximum subarray is [4, -1, 2, 1] with sum 6)
     * 
     * Input: array = { -1, -2, -3, -4}
     * Output: -1
     *
     * @param array the input array of integers
     * @return the maximum subarray sum
     */
    public int maxSubarraySum(int[] array) {
        return 1;
    }

    /**
     * A recursive method to calculate the factorial of a given positive integer
     *
     * @param n the positive integer
     * @return the factorial of the given integer
     * @throws IllegalArgumentException if n is negative
     */
    public int calculateFactorial(int n) {
        return 1;
    }

}
