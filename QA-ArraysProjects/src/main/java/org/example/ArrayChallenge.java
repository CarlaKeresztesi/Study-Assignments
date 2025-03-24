package org.example;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }//end of for - populating

        for(int num : array) {
            System.out.println(num);
        }//end of for - printing

    }//end of main

}//end of ArrayChallenge
