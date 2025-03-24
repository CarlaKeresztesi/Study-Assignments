package org.example;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

          //Regular for loop:
//        for(int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }//end of for

        //Enhanced for loop - preferred as we can't go out of bounds using it:
        for(int num : myArray){
            System.out.println(num);
        }//end of for loop

    }//end of main

}//end of ArrayFun
