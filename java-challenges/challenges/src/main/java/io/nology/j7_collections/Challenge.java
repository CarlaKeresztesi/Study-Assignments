package io.nology.j7_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge {

    public Challenge() {
    }

    /**
     * Reverses a list of strings without using any helper functions.
     *
     * @param items - the list we are reversing
     * @return Reversed list
     */
    public List<String> reverseList(List<String> items) {

        List<String> modifiableList = new ArrayList<>(items);

        int n = modifiableList.size();

        for (int i = 0; i < n / 2; i++) { //iterating halfway
            String temp = modifiableList.get(i);
            modifiableList.set(i, modifiableList.get(n - i - 1));
            modifiableList.set(n - i - 1, temp);
        }

        return modifiableList;

    }

    /**
     * Finds the maximum value in a list of integers.
     *
     * @param numbers - The list of integers
     * @return The maximum value in the list
     * @throws IllegalArgumentException ("List is empty") if the list is empty
     */
    public int findMaxValue(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        } else if (numbers.size() == 1) {
            return numbers.get(0);
        } else {
            return Collections.max(numbers);

        }

    }

    /**
     * Rotates a list to the right by a given number of positions.
     *
     * @param items     - The list to rotate
     * @param positions - Number of positions to rotate
     * @return Rotated list
     */
    public List<String> rotateListRight(List<String> items, int positions) {

        List<String> rotatedList = new ArrayList<>(items);

        Collections.rotate(rotatedList, positions);
        return rotatedList;
    }
}

