import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        //2row x 3column
        int[][] my2DArray = new int[2][3]; //2rows x 3columns
        fill2DArray(my2DArray);

        print2DArray(my2DArray);
        System.out.println();
        twice2DArray(my2DArray);
        print2DArray(my2DArray);

    }//end main

    public static void  fill2DArray(int[][] twoDArr) {
        Random rand = new Random(); //importing number generator

        for(int i = 0; i < twoDArr.length; i++) { //iterates through rows
            for (int j = 0; j < twoDArr[i].length; j++) { //twoDArray[i] refers to the i-th row(which is a 1D array)
                                //twoDArray[i].length gives the number of columns (or elements) in the i-th row.
                    //inner for loop iterates through columns

                //randomize 0 through to 99(inclusive)
                //row i, column j
                twoDArr[i][j] = rand.nextInt(100); //0...99(inclusive)

            }
        }//end for i
    }//end fill2DArray

    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr: twoDArr) { //the elements in the twoDArr are integers of sg dimensions
            for(int num : arr) {
                System.out.print(num + " ");
            }//end of inner for loop
            System.out.println();
        }//end of outer for loop
    }//end print2DArray

//CHALLENGE: Write and test another method called twice2DArray, which will take a two-dimensional integer array as a parameter
// and will double the values of each element in the 2D array. Make sure to test this method by placing a call to it
// after the methods we've already called in main. You will also want to call the print2DArray method to verify that
// your doubling of the values worked.

    public static void twice2DArray(int[][] twoDArr) {
        for(int i = 0; i < twoDArr.length; i++) {
            for(int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] *= 2; //doubles each element of the 2D array
            }//end for j
        }//end for i
    }

}
